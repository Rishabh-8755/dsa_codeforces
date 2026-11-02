import java.util.*;
public class Blank_Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n=sc.nextInt();
            int []arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int currcount=0;
            int maxcount=0;
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    currcount++;
                    maxcount=Math.max(currcount,maxcount);
                }
                else{
                    currcount=0;
                }
            }
            System.out.println(maxcount);
        }
    }

}
