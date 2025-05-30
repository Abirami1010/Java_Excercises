package Ex_03_Java_Basics;

public class Lab050_Interview_Qstn_Ternary_Operator {
    public static void main(String[] args) {
        // Find the maximum number between two number
        int x=10;
        int y=20;
        System.out.println(Math.max(x,y)); // General format

        int max= x > y ? x : y; // Using ternary operator
        System.out.println(max);
    }
}
