
// Description:
// The program must accept two string values S1 and S2 representing the names of two persons as input. The program must 
// calculate the name matching score based on the following conditions:

// If a character occurs in the same position in both names, then the score increments by 2.

// If a character occurs in both names but in different positions, then the score increments by 1.

// Once a character in a position is used for the calculation, it cannot be reused. However, if the same character occurs 
// in another position, it can be used.

// Finally, the program must print the name matching score for the given two persons.

// Boundary Conditions:

// 1 <= Length of S1, S2 <= 1000

// Input Format:

// The first line contains S1.

// The second line contains S2.

// Output Format:

// Print a single integer: the name matching score for the two names.

//Example Input/Output 1
// Input:
// bhuvana
// lavanya
// Output:

// 5
// Explanation:
// Only one character occurs at the same position in both names — so +2.
// Other common characters in different positions: v, a, n → so +1 for each.
// Total score: 2 + 1 + 1 + 1 = 5.

// Example Input/Output 2
// Input:

// ABBACCD
// ABDCCA
// Output:

// 9

import java.util.*;

public class nameMatchingScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        int score = 0;
        boolean[] used1 = new boolean[s1.length()];
        boolean[] used2 = new boolean[s2.length()];

        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                score += 2;
                used1[i] = true;
                used2[i] = true;
            }
        }

        for (int i = 0; i < s1.length(); i++) {
            if (!used1[i]) {
                for (int j = 0; j < s2.length(); j++) {
                    if (!used2[j] && s1.charAt(i) == s2.charAt(j)) {
                        score += 1;
                        used1[i] = true;
                        used2[j] = true;
                        break;
                    }
                }
            }
        }

        System.out.println(score);
        sc.close();
    }
}

