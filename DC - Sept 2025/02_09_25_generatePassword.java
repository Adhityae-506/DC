// 
import java.util.*;

public class 02_09_25_generatePassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt(); 
        int D = sc.nextInt(); 

        int[] password = new int[N];
      
        for (int i = 0; i < N; i++) {
            password[i] = C + i + 1;
        }

        
        for (int day = 1; day <= D; day++) {
            
            for (int i = 0; i < N; i++) {
                System.out.print(password[i]);
                if (i != N - 1) System.out.print(" ");
            }
            System.out.println();

            
            for (int i = 0; i < N; i++) {
                password[i] = password[i] + C + day;
            }
        }
    }
}
