// Write a program in C using structures to extract and print only the even-length words from a given string.

// You must use a structure with a bounded array to store and print the even-length words.

// If no such words exist, print -1.

// Input Format:
// The first line contains a string (max length: 100).

// Output Format:
// The output should contain all even-length words (separated by space).

// If none, output -1.

// Boundary Conditions:
// String length ≤ 100

// Words are separated by a single space

// Example Input/Output 1:
// Input:
// we live in india
// Output:
// we in
// Example Input/Output 2:
// Input:
// india beautiful country
// Output:
// -1


#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct BoundedArray {
    int size;
    char **words;
};

typedef struct BoundedArray boundedArray;

boundedArray getEvenLengthWords(char *str) {
    boundedArray b;
    b.words = (char **)malloc(100 * sizeof(char *));
    b.size = 0;

    char *token = strtok(str, " ");
    while (token != NULL) {
        if (strlen(token) % 2 == 0) {
            b.words[b.size] = (char *)malloc(strlen(token) + 1);
            strcpy(b.words[b.size], token);
            b.size++;
        }
        token = strtok(NULL, " ");
    }

    if (b.size == 0) {
        b.words[0] = (char *)malloc(3);
        strcpy(b.words[0], "-1");
        b.size = 1;
    }

    return b;
}

int main() {
    char str[1001];
    scanf("%[^\n]", str);
    boundedArray result = getEvenLengthWords(str);

    for (int i = 0; i < result.size; i++) {
        printf("%s\n", result.words[i]);
    }
    return 0;
}
