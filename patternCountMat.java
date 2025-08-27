// The program accepts an integer matrix of size 
// R
// ×
// C
// R×C containing only 0s and 1s.

// The program must find how many times the following 3x3 pattern appears in the matrix:

// text
// 1 0 1
// 0 1 0
// 1 0 1
// Boundary Conditions
// 3
// ≤
// R
// ,
// C
// ≤
// 50
// 3≤R,C≤50

// Input Format
// First line: integers 
// R
// R and 
// C
// C, separated by a space.

// Next 
// R
// R lines: each contains 
// C
// C integers (0 or 1), separated by spaces.

// Output Format
// Single integer: the count of occurrences of the given 3x3 pattern in the matrix.

// Example Input
// text
// 5 6
// 0 0 1 1 0 0
// 0 1 0 1 0 1
// 0 0 1 0 1 0
// 1 1 0 1 0 1
// 0 0 1 0 1 1
// Example Output
// text
// 3
// Explanation
// The pattern occurs 3 times in the matrix.

// The problem is to slide a 3x3 window across the matrix and count how many blocks match exactly the pattern:

// text
// 1 0 1
// 0 1 0
// 1 0 1
import java.util.*;
public class patternCountMat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[r][c] = sc.nextInt();
            }
        }

        int[][] pattern = {
            {1,0,1},
            {0,1,0},
            {1,0,1}
        };
        int count = 0;
        for(int i=0;i<=r-3;i++){
            for(int j=0;j<=c-3;j++){
                boolean match = true;
                for(int x=0;x<3;x++){
                    for(int y=0;y<3;y++){
                        if(mat[i+x][i+y]!=pattern[x][y]){
                            match = false;
                            break;
                        }
                    }
                    if(!match) break;
                }
                if(match) count++;
            }
        }
        System.out.println(count);

    }
    
}
