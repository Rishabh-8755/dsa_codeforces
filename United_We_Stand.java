import java.util.*;
public class United_We_Stand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int [] b=new int[n];
            int [] c=new int[n];
            int idx1=0 ,idx2=0;
            Arrays.sort(arr);
            int max=arr[n-1];
            if(arr[0]==arr[n-1]){
                System.out.println("-1");
                continue;
            }
            for(int i=0;i<n;i++){
                if(arr[i]==max){
                    c[idx2++]=arr[i];
                }else{
                    b[idx1++]=arr[i];
                }
            }
            System.out.println(idx1+" "+idx2);
            for(int i=0;i<idx1;i++){
                System.out.print(b[i] + (i == idx1 - 1 ? "" : " "));
            }
            System.out.println();
            for(int i=0;i<idx2;i++){
                System.out.print(c[i] + (i == idx2 - 1 ? "" : " "));
            }
            System.out.println();
        }
        sc.close();
    }
}
