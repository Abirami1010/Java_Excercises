package Ex_04_Java_Intermediate_Logic_Building;

public class Lab081_For_Loop_Decrement {
    public static void main(String[] args) {
        for (int i=-1; i<-10; i--) // Condition false
            System.out.println(i);
        System.out.println("END1");

        for (int j=-1; j>=-10; j--)
            System.out.println(j);
        System.out.println("END2");

        int z=-1;
        for ( ; z>-5; z--) //initialization outside of loop is works
            System.out.println(z);

    }
}
