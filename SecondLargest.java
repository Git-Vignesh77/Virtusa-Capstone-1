
import java.util.*;

public class SecondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int l = Integer.MIN_VALUE;
        int sL = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > l) {
                sL = l;
                l = num;
            } else if (num > sL && num != l) {
                sL = num;
            }
        }

        System.out.println(sL);
    }
}
