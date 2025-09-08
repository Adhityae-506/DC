long long int stringToDecimal(char *str) {
    char binary[1001];
    int j = 0;

    for (int pos = 0; str[pos] != '\0'; pos++) {
        binary[j++] = (int)str[pos];
    }

    long long int decimal = 0;
    for (int i = 0; i < j; i++) {
        decimal = decimal * 2;
        if (binary[i] % 2 != 0) {
            decimal += 1;      
        }
        
    }

    return decimal;
}
