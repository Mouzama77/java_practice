import java.util.Scanner;
public class PrimesUpTon{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i)== true){
            System.out.println(i);}
        }
        
    }
    static boolean isPrime(int n)
    {
        int c = 2;
        while(c*c <= n)
        {
            if(n%c == 0)
                return false;
            c++;
        }
        return true;


    }
}
