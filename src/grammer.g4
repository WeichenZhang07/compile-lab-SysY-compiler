grammar grammer;

compUnit : funcDef;
//ignore \t\r\n
//skip notes
SPACE: ('\t'|'\n'|'\r'|' ') -> channel(HIDDEN);
COMMENT_LINE: '//' .*? '\r'? '\n' ->skip;
COMMENT :'/*' .*? '*/' -> skip;
//rules
decl: constDecl|varDecl;
constDecl: 'const' Btype constDef (',' constDef)* ';';
Btype : 'int';
constDef : Ident '=' constInitVal;
constInitVal : constExp;
constExp: addexp;

varDecl : Btype varDef (',' varDef)* ';';
varDef : Ident # single
        | Ident '=' initVal #initial
        ;
initVal : exp;
funcDef : funcType Ident '(' ')' block;
funcType : 'int';
Ident : NoneDigit ( NoneDigit | Digit )*;
block : '{' blockItem* '}';
blockItem: decl|stmt;
ifState :'if' '(' cond ')';
ifBlock : stmt;
elseBlock : 'else' stmt;
stmt : 'return' exp ';' # return |
        lval '=' exp ';'# assignment|
        ifState ifBlock elseBlock? # if|
        block # singleBlock|
        exp ';' #singleExp;
lval : Ident;



number : Decimal_const #decimal | Octal_const# octal | Hexadecimal_const #hex;
Decimal_const : Nonzero_digit Digit*;
Octal_const : '0' [0-7]*;
Hexadecimal_const :('0x'|'0X') Hexadecimal_digit*;
Nonzero_digit : '1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9';
Octal_digit : '0'|'1'|'2'|'3'|'4'|'5'|'6'|'7';
Digit : '0'|Nonzero_digit;
Hexadecimal_digit:'0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
                                        | 'a' | 'b' | 'c' | 'd' | 'e' | 'f'
                                        | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';

NoneDigit : '_'|'a'| 'b'| 'c'| 'd'| 'e'| 'f'| 'g'| 'h'| 'i'| 'j'| 'k'| 'l'
                        | 'm'| 'n'| 'o'| 'p'| 'q'| 'r'| 's'| 't'| 'u'| 'v'
                        | 'w'| 'x'| 'y'| 'z'| 'A'| 'B'| 'C'| 'D'| 'E'| 'F'
                        | 'G'| 'H'| 'I'| 'J'| 'K'| 'L'| 'M'| 'N'| 'O'| 'P'
                        | 'Q'| 'R'| 'S'| 'T'| 'U'| 'V'| 'W'| 'X'| 'Y'| 'Z';

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


