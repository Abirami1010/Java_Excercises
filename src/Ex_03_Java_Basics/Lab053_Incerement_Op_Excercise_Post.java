package Ex_03_Java_Basics;

public class Lab053_Incerement_Op_Excercise_Post {
    public static void main(String[] args) {
        int a=10;
        int b=a++; // Print first then store
        System.out.println(a); // then increase & store
        System.out.println(b); //Print original

        System.out.println();

        int c=10;
        System.out.println(c++); // print first original
        System.out.println(c); //then increase & store
    }
}
