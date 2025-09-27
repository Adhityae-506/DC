// Input-Output Examples
// Example Input/Output 1:

// Input:
// 10

// Output:
// 8+2

// Explanation:
// Binary representation of 10 = 1010

// 1
// →
// 2
// 3
// =
// 8
// 1→2 
// 3
//  =8

// 0
// →
// 2
// 2
// =
// 0
// 0→2 
// 2
//  =0

// 1
// →
// 2
// 1
// =
// 2
// 1→2 
// 1
//  =2

// 0
// →
// 2
// 0
// =
// 0
// 0→2 
// 0
//  =0

// Hence output is 8+2.

// Example Input/Output 2:

// Input:
// 15

// Output:
// 8+4+2+1

// Example Input/Output 3:

// Input:
// 83

// Output:
// 64+16+2+1

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        BigInteger N = new BigInteger(s);
        String binaryStr = N.toString(2);  // Convert to binary string
        
        List<BigInteger> powers = new ArrayList<>();
        int length = binaryStr.length();
        
        for (int i = 0; i < length; i++) {
            if (binaryStr.charAt(i) == '1') {
                int power = length - 1 - i;
                powers.add(BigInteger.valueOf(2).pow(power));
            }
        }
        
        for (int i = 0; i < powers.size(); i++) {
            System.out.print(powers.get(i));
            if (i != powers.size() - 1) {
                System.out.print("+");
            }
        }
    }
}
