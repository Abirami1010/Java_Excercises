package Ex_05_Java_Intermediate_Logic_Building;

public class Lab086_For_Loop_Continue_Find_Even {
    public static void main(String[] args) {
        for (int i=0; i<=50; i++)
        {
            if (i % 2 != 0)
            {
                continue; //Skips odd numbers
            }
            System.out.println( "It is Even " +i);
        }

    }
}
