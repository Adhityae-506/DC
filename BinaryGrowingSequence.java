// The program must accept N integers as the input. The program must print "YES" if the given N integers represent a binary growing sequence. Else the program must print "NO" as the output. A binary growing sequence is a sequence of positive integers (B₁, B₂, B₃, … Bₙ) where all ones in the binary representation of Bᵢ are in the places of ones in the binary representation of Bᵢ₊₁.

// Boundary Condition(s):
// 2 <= N <= 1000
// 1 <= Each integer value <= 10^5

// Input Format:
// The first line contains N.
// The second line contains N integer values separated by a space.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// 4  
// 1 5 7 23
// Output:
// YES
// Explanation:
// The binary representation of 1 is 1.
// The binary representation of 5 is 101.
// The binary representation of 7 is 111.
// The binary representation of 23 is 10111.
// The binary growing sequence is 1, 101, 111, and 10111.

// Example Input/Output 2:
// Input:
// 5  
// 2 10 27 219 731
// Output:
// YES
// Example Input/Output 3:
// Input:
// 4  
// 4 12 57 185
// Output:
// NO

import java.util.Scanner;

public class BinaryGrowingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isEqual = true;

        for(int i = 0; i < N - 1; i++) {
            if((arr[i] & arr[i + 1]) != arr[i]) {
                isEqual = false;
                break;
            }
        }

        System.out.println(isEqual ? "YES" : "NO");
    }
}

