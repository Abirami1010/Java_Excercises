package Ex_03_Java_Basics;

public class Lab043_Typecasting_Widening {
    public static void main(String[] args) {
        byte b=10;
        int a=b; // Valid syntax  -- Implicit casting automatically done
        int a1 = (int) b; // in Widening - Explicit casting (int) is optional
    }
}
//- Type casting in Java is the process of **converting a value from one data type to another.**
//- There are two main types of type casting:
//    - widening  -> Explicit, Implicit
//    - narrowing -> Explicit, Implicit

//Widening Casting
//- Widening casting, also known as implicit casting, occurs when converting a smaller data type to a larger one.
//- **This type of casting is performed automatically by the Java compiler** and is considered safe because there's no risk of data loss.