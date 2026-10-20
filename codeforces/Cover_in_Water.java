import java.util.*;
public class Cover_in_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int count=0;
            boolean flag=false;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='.'){
                    count++;

                    if(i>=2 && s.charAt(i-1)=='.' && s.charAt(i-2)=='.'){
                        flag=true;
                        break;
                    }
                }
            }
            if(flag){
                System.out.println(2);
            }
            else{
                System.out.println(count);
            }

        }
    }
}
