// The program must accept an integer array of size N and Q queries as the input.
// Each query contains two integers X and Y and a character (L or R).
// The integers X and Y denote the starting and ending position of a subarray.
// For each query, the program must modify the array by shifting the integers in the specified subarray left or right by 1 position based on the specified character (L = left shift, R = right shift).
// After processing each query, the program must print the modified array.

//Boundary Conditions:
// 2 <= N <= 100  
// 1 <= Each integer value <= 10^5  
// 1 <= Q <= 100  
// 1 <= X < Y <= N

//Input Format:
// The first line contains N.  
// The second line contains N integers.  
// The third line contains Q.  
// Next Q lines: each contains 2 integers and a character.
//Output Format:
// Q lines: after each query, print the updated array.
// Example Input/Output 1:
// Input:
// 10
// 1 2 3 4 5 10 9 8 7 6
// 3
// 7 10 L
// 3 8 R
// 2 4 R

// Output:
// 1 2 3 4 5 10 8 7 6 9
// 1 2 7 4 5 10 8 6 9
// 1 3 2 7 4 5 10 8 6 9
// Example Input/Output 2:

// Input:
// 9
// 25 36 6 18 15 51 95 78 90
// 4
// 1 3 L
// 2 8 R
// 6 9 R
// 1 9 L

// Output:
// 36 6 25 18 15 51 95 78 90
// 36 78 6 25 18 15 51 95 90
// 36 78 6 25 18 15 51 95 90
// 78 6 25 18 15 51 95 90 36

import java.util.Scanner;

public class SubarrayShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int Q = sc.nextInt();

        for (int q = 0; q < Q; q++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            char C = sc.next().charAt(0);

            int start = X - 1; 
            int end = Y - 1;

            if (C == 'L') {
                leftShift(arr, start, end);
            } else if (C == 'R') {
                rightShift(arr, start, end);
            }

            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static void leftShift(int[] arr, int start, int end) {
        int temp = arr[start];
        for (int i = start; i < end; i++) {
            arr[i] = arr[i + 1];
        }
        arr[end] = temp;
    }

    public static void rightShift(int[] arr, int start, int end) {
        int temp = arr[end];
        for (int i = end; i > start; i--) {
            arr[i] = arr[i - 1];
        }
        arr[start] = temp;
    }
}
