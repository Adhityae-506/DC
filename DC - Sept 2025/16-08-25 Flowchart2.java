import java.util.*;
public class 16-08-25 Flowchart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p = 0;

        while(m > 0 && n > 0)
        {
            if(m%10!=n%10)
            {
                if(m%10>n%10){
                    System.out.print(m%10);
                }
                else{
                    System.out.print(n%10);
                }
                p = 1;

            }
            m/=10;
            n/=10;
        }
        if(p==0)
        {
            System.out.print("-1");
        }
    }

}