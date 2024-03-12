grammar Nyelvtan;

program: (package_def)? imports class;

imports: import_def*;
class: class_def (variable | function)*;
package_def: 'package' Identifier ';';
import_def: 'import' QualifiedImportName ';';

variable: Visibility? Variable_name Identifier ('=' Identifier)? ';';
class_def: Visibility? 'class' Identifier
            '{';
function: Visibility? (Variable_name | 'void') Identifier '(' (Variable_name Identifier)* ')'
            '{' (variable | Loops '(' ')' | Return_state )* '}';



WHITESPACE: [ \t]+ -> skip;
NEWLINE: '\r'? '\n' -> skip;
Return_state: 'return' Identifier ';';
Variable_name : 'Int' | 'Boolean' | 'String' | 'Double' | 'int' | 'string';
Loops:          'for' | 'while';
Visibility : 'private' | 'public' | 'protected';

Identifier: [a-zA-Z0-9_]+;
QualifiedImportName: Identifier ('.' Identifier)+ ('.*')?;


