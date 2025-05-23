grammar ClassDiagram;

program
    : (package_def)?
    imports
    (class | interface)*
    ;

imports
    : import_def*
    ;

class
    : class_def
    '{'
        variables
        functions
        connections
        enumerations
    '}'
    ;
class_def
    : VISIBILITY?
    'class'
    class_name
    ('extends' extended_class_name)?
    ('implements' interface_name)?
    ;
interface
    : VISIBILITY?
    interface_def
    ('implements' interface_name)?
    '{'
        variables
        functions
        connections
        enumerations
    '}'
    ;
interface_def
    : 'interface'
    interface_name
    ;

variables
    : variable*
    ;

functions
    : (function)*
    ;

enumerations
    : enumeration*
    ;

package_def
    : 'package'
    package_def_name
    ';'
    ;

package_def_name
    : (IDENTIFIER | CLASS_NAME)
    ;

import_def
    : 'import'
    import_def_name
    ';'
    ;

import_def_name
    : QualifiedImportName
    ;

parameter_list
    : (variable_type parameter_name)*
    ;

parameter_name
    : IDENTIFIER
    ;

variable
    : (string_variable | int_variable | boolean_variable | date_variable)
    ;



class_name
    : CLASS_NAME
    ;

extended_class_name
    : CLASS_NAME
    ;

interface_name
    : CLASS_NAME
    ;

function
    : VISIBILITY?
            (('void' function_name '(' parameter_list ')'
            '{'
            variables
            IDENTIFIER*
            '}')
             |
            (variable_type function_name '(' parameter_list ')'
            '{'
            variables
            IDENTIFIER*
            return_state
            '}'))
    ;

function_name
    : IDENTIFIER
    ;

string_variable
    : VISIBILITY?
    'string'
    variable_name
    ('=' '"' IDENTIFIER '"')?
    ';'
    ;

int_variable
    : VISIBILITY?
    'int'
    variable_name
    ('=' NUMBERS)?
    ';'
    ;

boolean_variable
    : VISIBILITY?
    'boolean'
    variable_name
    ('=' ('true' | 'false'))?
    ';'
    ;

date_variable
    : VISIBILITY?
    'date'
    variable_name
    ('=' DATE)?
    ';'
    ;

variable_name
    : IDENTIFIER
    ;

variable_type
    : 'int'
    | 'boolean'
    | 'string'
    | 'double'
    | 'date'
    ;

return_state
    : 'return'
    (NUMBERS | IDENTIFIER)
    ';'
    ;

connections
    : connection*
    ;

connection
    : (aggregation | composition | association)
    ;

enumeration
    : 'enum'
    CLASS_NAME
    '{'
        enum_constants
    '}'
    ;

enum_constants
    : CLASS_NAME
    (',' CLASS_NAME)*
    ;


aggregation
    : VISIBILITY?
    'aggregation'
    CLASS_NAME
    ':'
    IDENTIFIER
    multiplicity? // <- Added multiplicity
    ';'
    ;

composition
    : VISIBILITY?
    'composition'
    CLASS_NAME
    ':'
    IDENTIFIER
    multiplicity?
    ';'
    ;

association
    : VISIBILITY?
    'association'
    CLASS_NAME
    ':'
    IDENTIFIER
    multiplicity?
    ';'
    ;

multiplicity
    : '[' NUMBERS '..' (NUMBERS | '*') ']'
    | '[' NUMBERS ']'
    ;
WHITESPACE
    : [ \t]+ -> skip
    ;

NEWLINE
    : '\r'? '\n' -> skip
    ;

VISIBILITY
    : 'private'
    | 'public'
    | 'protected'
    ;

NUMBERS
    : ('-' | '+')? [0-9]+
    ;

DATE
    : [0-9][0-9][0-9][0-9] '-' [0-1][0-9] '-' [0-3][0-9]
    ;

CLASS_NAME
    : [A-Z][a-zA-Z0-9_]*
    ;

IDENTIFIER
    : [a-z][a-zA-Z0-9_]*
    ;

QualifiedImportName
    : (IDENTIFIER | CLASS_NAME)
    ('.' (IDENTIFIER | CLASS_NAME))+
    ('.*')?
    ;
