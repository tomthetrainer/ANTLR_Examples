grammar Help;           // Define a grammar called Help
r : 'HELP' ID ;         //Match Keyword Help followed by an identifier
ID : [a-zA-Z]+ ;        //Match Lower Case Identifiers
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines, \r (Windows)
// handle characters which failed to match any other token
ErrorCharacter : . ;