package Ex_04_Java_Intermediate_Logic_Building;

public class Lab071_Interview_Qstn {
    public static void main(String[] args) {
        int a=11;
        switch (-1)
        {
            default:
                System.out.println("default");
                break;
            case -1:   // 10 will be printed as switch case is matching with case -1, int a=11 given just to confuse.
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
