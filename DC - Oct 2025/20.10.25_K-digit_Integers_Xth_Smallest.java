// Example Input/Output 1:
// text
// Input:
// 8
// 450 87 65 720 616 8 10 536
// 3 2

// Output:
// 536

// Explanation:
// Here K = 3 and X = 2.
// The three-digit integers are 450, 720, 616 and 536.
// The 2nd smallest three-digit integer is 536.
// Example Input/Output 2:
// text
// Input:
// 6
// -95 -5254 -13 -20 -654 -40
// 2 3

// Output:
// -20
// Example Input/Output 3:
// text
// Input:
// 5
// 456 78 13 -564 125
// 3 4

// Output:
// -1

import java.util.*;
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        int x = sc.nextInt();

        List<Integer> resultList = new ArrayList<>();
        for(int a : arr){
            int len = (int)(Math.log10(Math.abs(a)) + 1); 
            if(len == k) {
                resultList.add(a);
            }
        }
        if(resultList.size() < x){
            System.out.print(-1);
        } else {
            Collections.sort(resultList);
            System.out.print(resultList.get(x-1)); 
        }
    }
}
