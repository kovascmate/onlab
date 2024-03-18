grammar Nyelvtan;

program: (package_def)? imports class;

imports: import_def*;
class: class_def '{' variables  functions connections '}';
variables: variable*;
functions: function*;
package_def: 'package' (IDENTIFIER|CLASS_NAME) ';';
import_def: 'import' QualifiedImportName ';';
parameter_list : (variable_name IDENTIFIER)*;
variable: (string_variable | int_variable | boolean_variable);
class_def: VISIBILITY? 'class' CLASS_NAME ('extends' CLASS_NAME)? ('implements' CLASS_NAME (',' CLASS_NAME)* )?;
function: VISIBILITY?
            (variable_name IDENTIFIER '(' parameter_list ')'
                                '{' variables IDENTIFIER* return_state '}')|
            ('void'       IDENTIFIER '(' parameter_list ')'
                                '{' variables IDENTIFIER*              '}');

string_variable : VISIBILITY?  'string'    IDENTIFIER ('=' '"' IDENTIFIER '"')?   ';';
int_variable :    VISIBILITY?  'int'       IDENTIFIER ('=' NUMBERS           )?   ';';
boolean_variable: VISIBILITY?  'boolean'   IDENTIFIER ('=' ('true'| 'false') )?   ';';
variable_name : 'int' | 'boolean' | 'string' | 'double';
return_state: 'return' (NUMBERS | IDENTIFIER) ';';

connections: (aggregation | association)*;

aggregation: VISIBILITY? 'aggregation' CLASS_NAME ':' IDENTIFIER  ';';
association: VISIBILITY? 'association' CLASS_NAME ':' IDENTIFIER  ';';

WHITESPACE: [ \t]+ -> skip;
NEWLINE: '\r'? '\n' -> skip;
//LOOPS:          'for' | 'while';
VISIBILITY : 'private' | 'public' | 'protected';
NUMBERS : ('-'|'+')? [0-9]+;
CLASS_NAME: [A-Z]IDENTIFIER;
IDENTIFIER: [a-z][a-zA-Z0-9_]*;
QualifiedImportName: (IDENTIFIER|CLASS_NAME) ('.' (IDENTIFIER|CLASS_NAME))+ ('.*')?;