grammar DotGrammar;

diagram
    : 'digraph' CLASS_NAME '{' HEADER nodes edges
    ;

nodes
    : (node)*
    ;

edges
    : (edge)*
    ;

node: node_title '[' 'label' '=' '"''{'  node_body '}"]';

node_title: CLASS_NAME;
node_body: (interface_name | CLASS_NAME ) '|'
         dot_variables '|'
         dot_functions ;
interface_name: '«' CLASS_NAME '»';

//LEFT_GUILLEMET: '*';
//RIGHT_GUILLEMET: '*';

dot_functions: dot_function*;
dot_variables: dot_variable*;

dot_variable: VISIBILITY_ICON IDENTIFIER ':' variable_type '\\n';

edge: 'edge' '[' edge_attributes ']' CLASS_NAME '->' CLASS_NAME edge_labels?;

edge_attributes: (arrow_head | style )*;
edge_labels: '[' (xlabel | taillabel) ']';

dot_function: VISIBILITY_ICON IDENTIFIER '('  ')' ':' ('void' | variable_type)'\\n';

arrow_head: 'arrowhead' '=' ARROWHEAD_TYPE;
style: 'style''=' STYLE_TYPE;
xlabel: 'xlabel''=''"' IDENTIFIER* '"';
taillabel: 'taillabel''=''"' multiplicity '"';

variable_type
    : 'int'
    | 'boolean'
    | 'string'
    | 'double'
    | 'date'
    ;

multiplicity
    : '[' NUMBERS '..' (NUMBERS | '*') ']'
    | '[' NUMBERS ']'
    ;

WHITESPACE    : [ \t\r\n]+ -> skip    ;

INTERFACE_NAME: '<<' CLASS_NAME '>>';

HEADER:
     'node [ shape = "record"] edge [ arrowhead = "empty"]';

ARROWHEAD_TYPE
    : '"empty"'
    | '"odiamond"'
    | '"diamond"'
    | '"curve"'
    ;
STYLE_TYPE
    : 'dashed'
    | 'filled'
    ;


CLASS_NAME
    : [A-Z][a-zA-Z0-9_]*
    ;

IDENTIFIER
    : [a-z][a-zA-Z0-9_]*
    ;

NUMBERS
    : ('-' | '+')? [0-9]+
    ;


VISIBILITY_ICON: '-' | '#' | '+';