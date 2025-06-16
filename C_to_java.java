// #include<Stdio.h>
// #include<stdlib.h>

// int main()
// {
//     char str[101],words[10001];
//     int rowcount = 0,sum = 0, index = 0;
//     while(scanf("%s\n",str)==1)
//     {
//         rowcount++;
//         if(rowcount & 1)
//         {
//             index += sprintf(words+index,"%s ",str);
//         }
//         else
//         {
//             sum+=atoi(str);
//         }
//     }
//     printf("%s\n%d",words,sum);
//     return 0;
// }

import java.util.*;

public class Hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder words = new StringBuilder();
        int sum = 0, rowCount = 0;

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.isEmpty()) break; // SkillRack may not send EOF, use empty string to stop
            rowCount++;
            if ((rowCount & 1) == 1) {
                words.append(str).append(" ");
            } else {
                sum += Integer.parseInt(str);
            }
        }

        System.out.println(words.toString().trim());
        System.out.println(sum);
    }
}
