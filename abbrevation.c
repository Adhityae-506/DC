// Input: "indian space research organization"
// Output: ISRO

// Input: "central processing unit"
// Output: CPU

// Input: "   world    health organization"
// Output: WHO

#include <stdio.h>
#include <ctype.h>
#include <string.h>

char* getAbbreviation(char *str) {
    static char abbr[100]; 
    int j = 0;

   
    if (str[0] != '\0' && str[0] != ' ')
        abbr[j++] = toupper(str[0]);

    
    for (int i = 0; str[i] != '\0'; i++) {
        if (str[i] == ' ' && str[i+1] != '\0' && str[i+1] != ' ') {
            abbr[j++] = toupper(str[i+1]);
        }
    }

    abbr[j] = '\0'; 
    return abbr;
}
