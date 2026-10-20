import java.util.*;
public class Halloumi_Boxes {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int n = sc.nextInt();
        int k= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int [] check = new int[n];
        for(int i=0; i<n; i++){
            check[i] = arr[i];
        }
        Arrays.sort(arr);
        boolean flag = false;
        for(int i=0; i<n; i++){
            if(arr[i]!=check[i]){
                flag = true;
                break;
            }
        }
        if(k==1&&flag==true){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }

    }

}
