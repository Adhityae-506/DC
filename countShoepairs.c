// Description:
// The function/method countShoePairs accepts two arguments N and arr.

// The integer N represents the number of shoes in a shop.

// The integer array arr represents the colours of the N shoes.

// All N shoes are the same size.

// The function/method countShoePairs must return an integer representing the number of matching pairs of shoes that are available.

// Your task is to implement the function countShoePairs so that the program runs successfully.

// IMPORTANT:
// Do not write the main() function as it is already defined.

// Input Format:
// The input format is handled by the provided main().
// Output Format:
// Return the integer: total pairs.
// Example Input/Output 1:
// Input:  
// 9  
// 15 25 25 15 15 35 45 15 25

// Output:  
// 3

// Explanation:  
// The 3 shoe pairs are (15, 15), (25, 25) and (15, 15).
// Example Input/Output 2:

// Input:  
// 4  
// 10 10 10 10

// Output:  
// 2

// Explanation:  
// The pairs are (10, 10) and (10, 10).
#include <stdio.h>

int countShoePairs(int N, int *arr) {
    int colorCount[101] = {0};
    int pairs = 0;

    for (int i = 0; i < N; i++) {
        colorCount[arr[i]]++;
    }

    for (int i = 0; i <= 100; i++) {
        pairs += colorCount[i] / 2;
    }

    return pairs;
}

int main() {
    int N;
    scanf("%d", &N);

    int arr[N];
    for (int i = 0; i < N; i++) {
        scanf("%d", &arr[i]);
    }

    printf("%d\n", countShoePairs(N, arr));
    return 0;
    //-------Code over----
}
