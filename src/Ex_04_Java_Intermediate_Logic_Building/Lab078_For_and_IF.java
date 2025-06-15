package Ex_04_Java_Intermediate_Logic_Building;

public class Lab078_For_and_IF {
    public static void main(String[] args) {
        for (int abi_age=10; abi_age<=20; abi_age++) // Combination of For and IF

        {
            if (abi_age>=18)
                System.out.println("Abi can VOTE");

            else
                System.out.println("Not Eligible to VOTE");
        }
    }
}
