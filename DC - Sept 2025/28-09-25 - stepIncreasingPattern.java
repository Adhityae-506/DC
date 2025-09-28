// Example Input/Output 1:

// Input:

// text
// 4
// Output:

// text
// 1
// 1 1 2
// 1 1 2 1 2 3
// 1 1 2 1 2 3 1 2 3 4

import java.util.*;

public class 28-09-25 - stepIncreasingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> prevRow = new ArrayList<>();

        for (int row = 1; row <= N; row++) {
            
            for (int num : prevRow) {
                System.out.print(num + " ");
            }

            
            for (int num = 1; num <= row; num++) {
                System.out.print(num + " ");
                prevRow.add(num); 
            }

            System.out.println();
        }
    }
}
