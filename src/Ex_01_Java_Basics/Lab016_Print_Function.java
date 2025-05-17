package Ex_01_Java_Basics;

public class Lab016_Print_Function {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);   //println
        System.out.printf("a value is %d",a); //printf

// % d -> int, byte, long, short   --Dat Type
// %s  -> string
// %f  -> float, double
// %b  -> boolean
        int b=20;
        System.out.printf("%d + %d", a,b);
        System.out.println();
        System.out.printf("a value is %d ,b value is %d",a, b);

    }
}