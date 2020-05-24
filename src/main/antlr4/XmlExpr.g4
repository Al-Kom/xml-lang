grammar XmlExpr;

ASSIGN : '=';

NODE : 'node';
ATTRIBUTE : 'attribute';

OPAR : '(';
CPAR : ')';
OANGLEBR : '<';
CANGLEBR : '>';
OBRACKET : '{';
CBRACKET : '}';
PLUS : '+';

PUSH : '<-';
PULL : '->';

NEGATION : '!';
CONTAIN : '<?>';
EQ : '==';
NEQ : '!=';
IS : 'is';

IN : 'in';

PRINT : 'print';

IF : 'if';
ELSE : 'else';
WHILE : 'while';
FOREACH : 'forEach';

MAIN : 'main';
FUNCTION : 'fun';
RETURN : 'return';

parse
 : create* main function* EOF
 ;

create
 : create_node
 | create_attribute
 ;

create_node
 : (NODE)? ID ASSIGN name_object_node
 ;

create_attribute
 : (ATTRIBUTE)? ID ASSIGN name_object_attribute
 ;

name_object_node
 : STRING                   #nameObjectNode
 | function_call            #functionCallNode
 | ID                       #idNode
 ;

name_object_attribute
 : connect                  #nameObjectAttribute
 | function_call            #functionCallAttribute
 | ID                       #idAttribute
 ;

connect
 : OANGLEBR name = STRING ',' value = STRING CANGLEBR
 ;

main
 : MAIN OBRACKET start CBRACKET
 ;

start
 : instruction*
 ;

instruction
 : create
 | push_in_node
 | pull_from_node
 | print
 | if_stat
 | while_stat
 | foreach_stat
 | function_call
 ;

push_in_node
 : id = ID PUSH push_more
 ;

pull_from_node
 : id = ID PULL pull_more
 ;

push_more
 : ID ',' push_more      #pushMore
 | ID                    #pushOne
 ;

pull_more
 : ID ',' pull_more      #pullMore
 | ID                    #pullOne
 ;

if_stat
 : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 ;

condition_block
 : OPAR (NEGATION)? condition CPAR stat_block
 ;

stat_block
 : OBRACKET start CBRACKET
 ;

condition
 : ID op=(EQ | NEQ) ID                  #equalityExpr
 | ID CONTAIN ID                        #contain
 | ID IS type                           #checkType
 ;

while_stat
 : WHILE condition_block
 ;

foreach_stat
 : FOREACH OPAR condition_for_each CPAR stat_block
 ;

condition_for_each
 : ATTRIBUTE ID IN ID                   #forEachVertex
 | NODE ID IN ID                        #forEachEdge
 ;

print
 : PRINT print_expr
 ;

print_expr
 : print_expr PLUS print_expr           #concatString
 | ID                                   #printId
 | STRING                               #printString
 ;

function_call
 : ID param_call
 ;

param_call
 : OPAR (arg_call)? CPAR
 ;

arg_call
 : ID                      #paramCallArg
 | ID ',' arg_call         #paramCallArgs
 ;

function
 : FUNCTION ID param stat_block                     #voidFunction
 | FUNCTION type ID param stat_block_with_return    #returnFunction
 ;

stat_block_with_return
 : OBRACKET start return_id CBRACKET
 ;

return_id
 : RETURN ID
 ;

param
 : OPAR (arg)? CPAR
 ;

arg
 : type ID                      #paramArg
 | type ID ',' arg              #paramArgs
 ;

type
 : NODE
 | ATTRIBUTE
 ;

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;

COMMENT
 : '//' ~[\r\n]* -> skip
 ;

SPACES
 : [ \t\r\n] -> skip
 ;