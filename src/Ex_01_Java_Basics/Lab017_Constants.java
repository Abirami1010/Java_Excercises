package Ex_01_Java_Basics;

public class Lab017_Constants {
    public static void main(String[] args) {
        int a= 10;  // Local variable value can't be assigned by JVM
        System.out.println(a);

        final int b=9;  // Constant or final --> can't change the variable value o
       // b=10;   // can't assign value to final variable
        System.out.println(b);

        final float PI=3.14f;
        System.out.println(PI);

        final int c=55;
        System.out.println(c);

    }
}
