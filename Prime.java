import java.util.Scanner;
public class Prime {// time compx:O(n*sqrt(n))//by eliminating multiples of 2 3.. before only 
    // then time compx is O(n*log(log(n)))
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=2;i<=n;i++)
        {
        System.out.println(i + " " +isPrime(i));}
        
    }
    static boolean isPrime(int n)
    {
        int c = 2;
        while(c*c<=n)// c <= sqrt(n)
        {
            if(n%c==0)
                return false;
            c++;
        }
        return true;
    }
    
    
}
