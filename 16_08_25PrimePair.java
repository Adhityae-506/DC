// Given a number N, find two consecutive prime numbers X and Y such that N is equidistant from both of them (i.e., N - X = Y - N) and N is composite.

// If such primes exist, print X Y.

// Otherwise, print -1.

// Sample Test Cases:
// Input 1:
// 6

// Output 1:
// 5 7

// Input 2:
// 473

// Output 2:
// 467 479

// Input 3:
// 10

// Output 3:
// -1

// Input 4:
// 5

// Output 4:
// -1

import java.util.*;

public class 16_08_25PrimePair {
    static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isComposite(int n) {
        return (n > 1 && !isPrime(n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (!isComposite(n)) {
            System.out.println("-1");
            return;
        }

        int left = n - 1, right = n + 1;

        while (left > 1 && !isPrime(left)) left--;
        while (!isPrime(right)) right++;

        if (n - left == right - n) {
            System.out.println(left + " " + right);
        } else {
            System.out.println("-1");
    }
}
}
