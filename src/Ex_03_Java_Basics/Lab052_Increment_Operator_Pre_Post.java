package Ex_03_Java_Basics;

public class Lab052_Increment_Operator_Pre_Post {
    public static void main(String[] args) {

        // Pre_Increment   --> Increase first & then store/print  --> a & b both return increased value
        int a=10;
         int b=++a; // ++a= a+1;   Increase the value of a and store the value in b as well as a
        System.out.println(a);
        System.out.println(b);

        // Exp and Result table
        // L.no | a | b
        // 7   | 10 | NA
        // 8   | 11  | 11
        // 9   | 11  | NA
        // 10   |  NA | 11



        //Post_Increment  --> Print first then increase
        // so d prints c original value first, then increased value stored in c
        int c=1;
        int d= c++;
        System.out.println(c);  //
        System.out.println(d);

        // Exp and Result table
        // L.no | c | d
        // 23   | 1 | NA
        // 24   | 2  | 1
        // 25   | 2  | NA
        // 26   |  NA | 1
    }
}

