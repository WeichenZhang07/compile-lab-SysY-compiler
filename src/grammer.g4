grammar grammer;

compUnit : (decl| funcDef)+;
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
              |'{' (constInitVal (',' constInitVal)*)? '}' # arrarConstInitVal;
constExp: addexp;

constScripts :'[' constExp ']';
scripts : '[' exp ']';
varDecl : Btype varDef (',' varDef)* ';';
varDef : Ident scripts* # single
        | Ident scripts* '=' initVal #initial;
initVal : exp #singleInitVal
        | '{' (initVal (',' initVal)*)? '}' #arrayInitVal;
funcDef : funcType Ident '('(funcFParams)* ')' block;
funcType : 'int'|'void';
funcFParams : funcFParam (',' funcFParam)*;
funcFParam : Btype Ident ('[' ']' ('['exp']')*)?;
Ident : NoneDigit ( NoneDigit | Digit )*;
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
        block # singleBlock|
        'continue' ';'#continue|
        'break' ';'#break|
        exp? ';' #singleExp;
lval : Ident scripts*;
cond: lOrExp;
exp : addexp;
addexp : mulexp # singleAddExp| addexp('+'|'-') mulexp # multipleAddExp;
mulexp : unaryExp # singleMulExp| mulexp('*'|'/'|'%') unaryExp # multipleMulExp;
relExp : addexp # singleRelExp|
        relExp('<'|'>'|'<='|'>=') addexp # multipleRelExp;
eqExp : relExp # singleEqExp | eqExp('=='|'!=') relExp #multipleEqExp;
lAndExp:eqExp # singleLAndExp|lAndExp '&&'eqExp # multipleLAndExp;
lOrExp: lAndExp # singleLOrExp |lOrExp'||'lAndExp # multipleLOrExp;
unaryOp: '+'|'-'|'!';
unaryExp : primaryExp # pri| Ident '(' funcRParams? ')' # func
            |unaryOp unaryExp # unary;
funcRParams : exp (',' exp)*;
primaryExp: '(' exp ')'| number|lval;


number : Decimal_const #decimal | Octal_const# octal | Hexadecimal_const #hex;
Decimal_const : Nonzero_digit Digit*;
Octal_const : '0' [0-7]*;
Hexadecimal_const :('0x'|'0X') Hexadecimal_digit*;
Nonzero_digit : [1-9];
Octal_digit : [0-7];
Digit : '0'|Nonzero_digit;
Hexadecimal_digit:[0-9]|[a-fA-F];

NoneDigit : '_'|[a-zA-Z];



