public class SumofDigits {
    public static void main(String[] args) {
        
        int x = digitsum(515);
        System.out.println(x);

        
    }
    static int digitsum(int n){
        if(n%10==n)//if(n==0)
        {
            return n;//return 0;
        }
        
        int r = n % 10;
        n = n/10;
        return r*digitsum(n);//r+digitsum(n)
        
    }
    
}
