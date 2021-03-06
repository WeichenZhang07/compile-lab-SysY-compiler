grammar grammer;

compUnit : (decl| function)+;
//ignore \t\r\n
//skip notes
SPACE: ('\t'|'\n'|'\r'|' ') -> channel(HIDDEN);
COMMENT_LINE: '//' .*? '\r'? '\n' ->skip;
COMMENT :'/*' .*? '*/' -> skip;
//rules
decl: constDecl|varDecl;
constDecl: 'const' Btype constDef (',' constDef)* ';';
Btype : 'int';
constDef : Ident constScripts* '=' constInitVal;
constInitVal : constExp #singleConstInitVal
              |'{' (constInitVal (',' constInitVal)*)? '}' # arrayConstInitVal;
constExp: addexp;

constScripts :'[' constExp ']';
scripts : '[' exp ']';
varDecl : Btype varDef (',' varDef)* ';';
varDef : Ident scripts* # single
        | Ident scripts* '=' initVal #initial;
initVal : exp #singleInitVal
        | '{' (initVal (',' initVal)*)? '}' #arrayInitVal;
funcDef : funcType Ident '('(funcFParams)* ')';
function :funcDef block;
funcType : 'int'|'void';
funcFParams : funcFParam (',' funcFParam)*;
funcFParam : Btype Ident ('[' ']' (scripts)*)?;
Ident : NoneDigit ( NoneDigit | Digit )*;
nakedBlock : block;
block : '{' blockItem* '}';
blockItem: decl|stmt;
ifState :'if' '(' cond ')';
whileState : 'while' '(' cond ')';
ifBlock : stmt;
elseBlock : 'else' stmt;
stmt : 'return' (exp)? ';' # return |
        lval '=' exp ';'# assignment|
        ifState ifBlock elseBlock? # if|
        whileState stmt #while |
        nakedBlock # singleBlock|
        'continue' ';'#continue|
        'break' ';'#break|
        exp? ';' #singleExp;
lval : Ident scripts*;
rightLval : Ident scripts*;
cond: lOrExp;
exp : addexp;
addexp : mulexp # singleAddExp| addexp('+'|'-') mulexp # multipleAddExp;
mulexp : unaryExp # singleMulExp| mulexp('*'|'/'|'%') unaryExp # multipleMulExp;
relExp : addexp # singleRelExp|
        relExp('<'|'>'|'<='|'>=') addexp # multipleRelExp;
eqExp : relExp # singleEqExp | eqExp('=='|'!=') relExp #multipleEqExp;
lAndExp:eqExp # singleLAndExp|eqExp '&&'lAndExp # multipleLAndExp;
lOrExp: lAndExp # singleLOrExp |lAndExp'||'lOrExp # multipleLOrExp;
unaryOp: '+'|'-'|'!';
unaryExp : primaryExp # pri| Ident '(' funcRParams? ')' # func
            |unaryOp unaryExp # unary;
funcRParams : exp (',' exp)*;
primaryExp: '(' exp ')'| number|rightLval;


number : Decimal_const #decimal | Octal_const# octal | Hexadecimal_const #hex;
Decimal_const : Nonzero_digit Digit*;
Octal_const : '0' [0-7]*;
Hexadecimal_const :('0x'|'0X') Hexadecimal_digit*;
Nonzero_digit : [1-9];
Octal_digit : [0-7];
Digit : '0'|Nonzero_digit;
Hexadecimal_digit:[0-9]|[a-fA-F];

NoneDigit : '_'|[a-zA-Z];



