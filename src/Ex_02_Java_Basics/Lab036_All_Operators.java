package Ex_02_Java_Basics;

public class Lab036_All_Operators {
    public static void main(String[] args) {
         boolean b1=true;
         int a=10;
         int b=20;

        System.out.println(a + b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

        // Compound assignment

        int age = 10;
         age += 20; // age = age +10
         age /=10;  // age = age/10

        System.out.println(age);

        // Bitwise operators (optional -  not used mostly)
        // -- Bitwise Not
        // >> Left shift
        // << Right shift
        // ^ XOR

    }
}
