import java.util.Scanner;
public class We_Need_the_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            int[] arr = new int[(int)n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int result = 0;
            for(int i=0;i<n;i++){
                result = result ^ arr[i];
            }
            int newarr[] = new int[(int)n];
            for(int i=0;i<n;i++){
                newarr[i] = arr[i]^result;
            }
            int finalresult = 0;
            for(int i=0;i<n;i++){
                finalresult = finalresult ^ newarr[i];
            }
            if(finalresult == 0){
                System.out.println(result);
            }else{
                System.out.println(-1);
            }
        }
    }
}
