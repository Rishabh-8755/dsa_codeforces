import java.util.*;
public class C{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s="codeforces";
        int t = sc.nextInt();
        while(t-- > 0) {
            char c= sc.next().charAt(0);
            boolean found = false;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==c){
                    found = true;
                    break;
                }
            }
            if(found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        

    }

}