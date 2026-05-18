import java.util.Scanner;
public class FunPrime {
    static int count=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        if(count == 2)
        {
            return true;
        }
        else
            return false;  
    }
    
}
