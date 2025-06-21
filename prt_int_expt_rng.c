// 

#include <stdio.h>
#include <stdlib.h>

int main() {
    int N, X, Y, val;
    scanf("%d%d%d", &N, &X, &Y);

    for (int ctr = 1; ctr <= N; ctr++) {
        scanf("%d", &val);

        for (int printVal = 1; printVal <= val; printVal++) {
            if (!(printVal >= X && printVal <= Y)) {
                printf("%d ", printVal);
            }
        }

        printf("\n");
    }

    return 0;
}

// java:
// import java.util.*;

// public class Hello {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int N = sc.nextInt();
//         int X = sc.nextInt();
//         int Y = sc.nextInt();

//         int[] arr = new int[N];
//         for (int i = 0; i < N; i++) {
//             arr[i] = sc.nextInt();
//         }

//         for (int i = 0; i < N; i++) {
//             for (int j = 1; j <= arr[i]; j++) {
//                 if (j == X || j == Y) continue;
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }
