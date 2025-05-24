package Ex_02_Java_Basics;

public class Lab028_Logical_Operator {
    public static void main(String[] args) {
        boolean a=true;
        System.out.println(!a);  // `!`  (NOT) - REVERSE

        boolean b=false;
        System.out.println(!!b);  // even ! cancels each other

        boolean c= true || false; // ||`  (OR)
        System.out.println(c);

        boolean d =false && true;  // `&&`  (AND)
        System.out.println(d);

//        Logical Operators ->  (Digital Electronics)
//        - `&&`  (AND)
//                - `||`  (OR)
//                - `!`  (NOT) - REVERSE

    }
}
