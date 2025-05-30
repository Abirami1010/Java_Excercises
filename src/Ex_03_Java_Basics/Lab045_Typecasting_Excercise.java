package Ex_03_Java_Basics;

public class Lab045_Typecasting_Excercise {
    public static void main(String[] args) {
        long phone_number = 9876543210l; //64 bits
        //short s = phone_number;
        short s = (short) phone_number; // 32 bits
        System.out.println(s);
    }
}
