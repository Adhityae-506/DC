// There are three cups on a table, at the positions 1, 2, and 3.
// Initially, there is a ball hidden under the cup at position P.
// The program must accept N pairs of integers and the value of P as the input.
// Each pair (X, Y) represents the positions of two cups to be swapped.

// After performing N swaps on the three cups, the program must print the final position of the ball.

// Boundary Condition(s):
// 1 <= N <= 1000
// 1 <= P, X, Y <= 3
// Input Format:

// The first line contains N and P separated by a space.

// The next N lines contain two integers X and Y, representing the positions of the cups to swap.

// Output Format:

// Print the final position of the ball after all swaps.

// Example Input/Output 1:
// Input:
// 4 2
// 1 2
// 3 1
// 3 1
// 3 1

// Output:
// 1
// Explanation:

// Initially: ball at position 2

// Swap (1, 2) → ball moves to 1

// Swap (3, 1) → ball moves to 3

// Swap (3, 1) → ball moves to 1

// Swap (3, 1) → ball stays at 1

// Example Input/Output 2:
// Input:
// 4 3
// 3 1
// 3 1
// 3 2
// 2 1

// Output:
// 2

import java.util.*;

public class findTheBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int ballPos = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (ballPos == X) {
                ballPos = Y;
            } else if (ballPos == Y) {
                ballPos = X;
            }
        }

        System.out.println(ballPos);
        sc.close();
    }
}
