public class ReverseRecur {
    static int sum =0;
    public static void main(String[] args) {
        
        reverse(1234);
        System.out.println(sum);
        
    }
    static void reverse(int n){
        
        if(n==0)
        {
            return;
        }
        int r = n%10;
        sum = sum * 10 + r;
        reverse(n/10);
        
    }


    
}
