package Task;

public class Ex07_Increment_Op {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--;
        //     = 1 - 2 - 3  = -1-3=-4   // i=0, j=1, k=2, m=-4

        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);





    }
}
