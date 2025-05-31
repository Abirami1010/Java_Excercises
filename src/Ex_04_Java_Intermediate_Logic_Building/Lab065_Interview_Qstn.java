package Ex_04_Java_Intermediate_Logic_Building;

public class Lab065_Interview_Qstn {
    public static void main(String[] args) {
        char a ='A';  // character is also an integer, int is supported in switch so this is valid program
        switch (a)
        {
            case 65:
                System.out.println("Math ASCII");
                break;
            default:
                System.out.println("No Match");
        }

    }
}
//⚠️ Java switch expressions must be of only byte, short, int, long(with its Wrapper type), enums and String.