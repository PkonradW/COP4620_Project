grammar Little;


KEYWORDS : 'PROGRAM'
         | 'BEGIN'
         | 'END'
         | 'FUNCTION'
         | 'READ' | 'WRITE'
         | 'IF' | 'ELSE' | 'ENDIF' | 'WHILE' | 'ENDWHILE' | 'CONTINUE' | 'BREAK'
         | 'RETURN' | 'INT' | 'VOID' | 'STRING' | 'FLOAT';

OP : ':=' | '+' | '-' | '*' | '/' | '=' | '!=' | '<' | '>' | '(' | ')' | ';' | ',' | '<=' | '>=';

WS : [ \t\r\n]+ -> skip;
IDENTIFIER  : [a-zA-Z][a-zA-Z0-9]*;
INTLITERAL  : [0-9]+;
FLOATLITERAL : [0-9]+'.'[0-9]+ |'.'[0-9]+;
STRINGLITERAL : '"' (~["])* '"';
COMMENT : '--' ~[\r\n]*;




prog : (IDENTIFIER | INTLITERAL | FLOATLITERAL | STRINGLITERAL | COMMENT | KEYWORDS | OP )*;