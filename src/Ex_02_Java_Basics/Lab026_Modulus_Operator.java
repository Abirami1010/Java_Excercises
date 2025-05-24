package Ex_02_Java_Basics;

public class Lab026_Modulus_Operator {
    public static void main(String[] args) {
        int a=30;
        int b=20;
        System.out.println(a%b);  // Gives remainder as output

        //      20  |   30  |  1  --> Quotient
        //              20
        //              10   --> Remainder

        System.out.println(13%7);

        System.out.println(100%10);
    }
// Note:    Any Number % 2 = Remainder 0 -> Even , 1 -> Odd

}
