import java.util.*;
class Ambitious_kid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr[i]=Math.abs(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}