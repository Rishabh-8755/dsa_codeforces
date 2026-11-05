import java.util.*;

public class Walking_Master {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            if (b > d) {
                System.out.println(-1);
                continue;
            }

            long result = d - b;
            a = a + result;

            if (a >= c) {
                long remaining = a - c;
                result = result + remaining;
                System.out.println(result);
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}