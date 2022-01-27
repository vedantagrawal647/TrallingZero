/*
Me Bean is very good in mathematics. He was given a number n and was told to find out number of
trailing zeroes in n! (Factorial) . Can you help him?
Sample Input
5
Sample Output
1
Explanation
5! (Factorial) is 120, so there is one trailing zero.
Implement it by using loop
 */

import java.util.Scanner;
public class TrallingZero {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=1;
        for(int i=n;i>0;i--)
        {
            c=c*i;
        }
        int j=0;
        while(c%10==0)
        {
            c=c/10;
            j++;
        }
        System.out.println(j);

    }
}
