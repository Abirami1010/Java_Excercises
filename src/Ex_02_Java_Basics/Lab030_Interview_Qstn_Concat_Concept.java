package Ex_02_Java_Basics;

public class Lab030_Interview_Qstn_Concat_Concept {
    public static void main(String[] args) {
         String s1 = "Good";
         String s2 = "luck";
         int a=10;
         int b=20;

        System.out.println(s1 + s2 + a + b);  // When staring with concat of string rest of operation also be concatenated (simply joins)
        System.out.println(a + b + s1 + s2); // works normally
        System.out.println( s1 + s2 + (a+b)); // () will be considered first always; so works normally

    }
}
