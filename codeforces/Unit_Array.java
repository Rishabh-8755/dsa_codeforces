import java.util.*;
public class Unit_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int countneg=0 , countpos=0;
            for(int i=0;i<n;i++){
                if(arr[i]<0){
                    countneg++;
                }
                else if(arr[i]>0){
                    countpos++;
                }
            }
            int ops=0;
            while(countneg>countpos){
                countneg--;
                countpos++;
                ops++;
            }
            if(countneg%2!=0){
                ops++;
            }
            System.out.println(ops);
        }
    }
}
