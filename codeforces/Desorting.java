import java.util.*;
public class Desorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            boolean isSorted = true;
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    isSorted=false;
                    break;
                }
            }
            if(!isSorted){
                System.out.println(0);
                continue;
            } 

            int mindiff = Integer.MAX_VALUE;
            for(int i=0;i<n-1;i++){
                mindiff = Math.min(mindiff, arr[i+1] - arr[i]);
            }
            int result=((mindiff/2)+1);
            System.out.println(result);
        }
    }
}
