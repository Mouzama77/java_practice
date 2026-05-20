import java.util.Scanner;
public class ReverseRec2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = revfun(n);

        System.out.println(ans);
    }
    static int fun(int n,int dig){
        if(n%10==n)
        {
            return n;
        }
        int rem = n % 10;
      return rem * (int)(Math.pow(10,dig-1)) + fun(n/10,dig-1);
    }
    static int revfun(int n){
        int dig = (int)(Math.log10(n))+1;
        return fun(n, dig);
    }
    
}
