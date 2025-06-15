package Ex_05_Java_Intermediate_Logic_Building;

public class Lab096_Diff_While_and_Dowhile {

    public static void main(String[] args) {

        int a = 0;
//        while (a < 0)  // Prints only if condition is true
//        {
//            System.out.println(a);
//            a++;
//        }

        do{
            System.out.println(a);
            a++;
        }while (a<0); // Prints once even if condition is false


    }
}
