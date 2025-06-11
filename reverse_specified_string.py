# # java to python code conversion

# import java.util.*;

# public class Hello {
#     public static void main(String[] args) {
#         Scanner sc = new Scanner(System.in);
#         StringBuilder sb = new StringBuilder();

#         while (sc.hasNextLine()) {
#             String currLine[] = sc.nextLine().trim().split("\\s+");
#             for (String word : currLine) {
#                 sb.append(word.charAt(word.length() - 1));
#             }
#         }

#         System.out.println(sb.reverse().toString());
#     }
# }

import sys

result = []

for line in sys.stdin:
    words = line.strip().split()
    for word in words:
        result.append(word[-1])

print(''.join(result)[::-1])

