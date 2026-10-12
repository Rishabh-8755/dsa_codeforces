import java.util.*;

public class Sequence_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] result = new int[2 * n];
            int idx = 0;
            result[idx++] = arr[0];

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i+1]) {

                    result[idx++] = arr[i+1]; 
                }
                result[idx++] = arr[i+1];
            }
            System.out.println(idx);
            for (int i = 0; i < idx; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}