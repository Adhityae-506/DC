// The program must accept an integer N as the input. The program must flip (invert) the 4th bit from the end of the binary representation of N. 
// Then the program must print the revised value of N as the output.

// Please fill in the blanks with code so that the program runs successfully.
// Input Format:
// The first line contains N.
// Output Format:
// The first line contains the revised value of N after inverting the 4th bit from the end of the binary representation of N.
// Example Input/Output 1:
// Input:
// 25
// Output:
// 17
// Explanation:
// The binary representation of 25 is 11001.
// After flipping the 4th bit from the end, the binary becomes 10001.
// The decimal equivalent of 10001 is 17.

// Example Input/Output 2:
// Input:
// 15
// Output:
// 7
// Explanation:
// The binary representation of 15 is 01111.
// Flipping the 4th bit gives 00111, which is 7 in decimal.

#include <stdlib.h>
#include <stdio.h>

int main()
{
    int N;
    scanf("%d", &N);
    printf("%d", N ^ (1 << 3));
    return 0;
}
