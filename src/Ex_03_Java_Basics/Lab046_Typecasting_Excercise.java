package Ex_03_Java_Basics;

public class Lab046_Typecasting_Excercise {
    public static void main(String[] args) {
        int course=100;
        float GST =18.45f;
        //int total = course +GST ; // In Narrowing Implicit won't work

        int total = course + (int)GST;  // when converting to int 0.45 is loss
        System.out.println(total);
        float total2 = course + GST;
        System.out.println(total2);


    }
}
