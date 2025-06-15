package Task;

import java.util.Scanner;

public class Ex10_Factorial_Hacker_Rank {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= scanner. nextInt();
        int fact=1;

        if (n==0)
        {
            System.out.println(1);
        }
        if(n > Integer.MAX_VALUE){ // if(n > 2147483647){
            System.out.println("I can't handle the number > Max of Int"); }
        else
        {
            for (int i=1; i<=n; i++)
            {
            fact=fact*i;
            }
            System.out.println(fact);
        }




    }
}
