package Ex_01_Java_Basics;

public class Lab011_Variable_namecheck {
    public static void main(String[] args) {
        int _=65;  //valid but will not be used it cannot be run
        int $=55;
        int year=2025;

        //System.out.println(_); //throws an error
        System.out.println($);
        System.out.println(year);

        //interview questions
        int _2=123; /* is it valid ? Yes */
        System.out.println(_2);

      // int enum=10;  /* is it valid? No enum is a keyword*/
        int Enum=10;  // This is valid as it is case_sensitive ...not a keyword
        int a_b=90;
        //int age is =10;    Space is not allowed

        int Check_$ =100;
        int Value_should_be_100 =100;

        System.out.println(Enum);
        System.out.println(a_b);
        System.out.println(Check_$);
        System.out.println(Value_should_be_100);




    }
}
