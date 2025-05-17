package Ex_01_Java_Basics;

public class Lab021_ASCII {
    public static void main(String[] args) {
        // characters value are integer
        char c='A';// char c='A';--> 65 as per ASCII standard
        System.out.println('A');

    /* Java supports unicode (universal code) as well */
         char rupees='₹';
        System.out.println(rupees);

         char Smiling_Face_with_Smiling_Eyes='\u1f60';
        System.out.println(Smiling_Face_with_Smiling_Eyes);
    }
}
