package Task;

public class Ex01_Print_5_table_using_printf {
    public static void main(String[] args) {
        int num = 5;
        System.out.printf("%d*%d=%d\n", num, 1, num * 1);
        System.out.printf("%d*%d=%d\n", num, 2, num * 2);
        System.out.printf("%d*%d=%d\n", num, 3, num * 3);
        System.out.printf("%d*%d=%d\n", num, 4, num * 4);
        System.out.printf("%d*%d=%d\n", num, 5, num * 5);
        System.out.printf("%d*%d=%d\n", num, 6, num * 6);
        System.out.printf("%d*%d=%d\n", num, 7, num * 7);
        System.out.printf("%d*%d=%d\n", num, 8, num * 8);
        System.out.printf("%d*%d=%d\n", num, 9, num * 9);
        System.out.printf("%d*%d=%d\n", num, 10, num * 10);

        System.out.println();

        // slightly different code than above ( Abi -> better choice)
        int n=2;
        System.out.printf("%d*1=%d\n", n, n * 1);
        System.out.printf("%d*2=%d\n", n, n * 2);
        System.out.printf("%d*3=%d\n", n, n * 3);
        System.out.printf("%d*4=%d\n", n, n * 4);
        System.out.printf("%d*5=%d\n", n, n * 5);
        System.out.printf("%d*6=%d\n", n, n * 6);
        System.out.printf("%d*7=%d\n", n, n * 7);
        System.out.printf("%d*8=%d\n", n, n * 8);
        System.out.printf("%d*9=%d\n", n, n * 9);
        System.out.printf("%d*10=%d\n", n, n * 10);

    }
    }

