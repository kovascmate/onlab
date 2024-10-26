grammar DotGrammar;
import ClassDiagram;

diagram
    : 'digraph' CLASS_NAME '{'
        HEADER
        nodes
        edges
    '}'
    ;
nodes
    : node*
    ;
edges
    : edge*
    ;

node: CLASS_NAME '['  ']';

edge: 'edge' '[' arrow_head+ style+ ']'
        CLASS_NAME '->' CLASS_NAME'[xlabel = "' IDENTIFIER '"]';

arrow_head: 'arrowhead = ' ARROWHEAD_TYPE;
style: 'style = ' STYLE_TYPE;
tail: 'taillabel = ' IDENTIFIER;

HEADER:
     'node [ shape = "record" ] edge [ arrowhead =' ARROWHEAD_TYPE ']';
ARROWHEAD_TYPE
    :
    '"empty"'
    | '"odiamond"'
    | '"diamond"'
    ;
STYLE_TYPE
    :
    '"dashed"'
    |'"filled"'
    ;
MULTIPLICITY
    : '0..1'
    | '1'
    | '0..*'
    | '1..*'
    | '*'
    ;