// <!-- Integers - At least One Odd Digit

// Problem Statement:
// The program must accept two integers X and Y (where X < Y) as input. In the range from X to Y, the program must print the integers having at least one odd digit as the output.

// Input Format:

// The first line contains X and Y separated by a space.

// Output Format:

// The first line contains the integers having at least one odd digit.

// Example Input/Output 1:
// Input:
// 200 240

// Output:
// 201 203 205 207 209 210 211 212 213 214 215 216 217 218 219 221 223 225 227 229 230 231 232 233 234 235 236 237 238 239
// Explanation:
// Here, X = 200 and Y = 240.
// All numbers that have at least one odd digit are printed in order. -->

#include <stdio.h>

int main()
{
    int X, Y;
    scanf("%d %d", &X, &Y);

    for (int val = X; val <= Y; val++)
    {
        int temp = val;

        while (temp > 0)
        {
            while (temp > 0)
            {
                if (temp % 10 % 2 == 1)
                {
                    temp = -1;
                    break;
                }
                temp = temp / 10;
            }
        }

        if (temp!=0)
        {
            printf("%d ", val);
        }
    }

    return 0;
}