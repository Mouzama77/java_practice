import java.util.Arrays;
public class EvenDigits {
    public static void main(String[] args) {
        int[] a = {1, 90, 44, 3221, 666};
        
        digits(a);
        
    }
    static void digits(int[] a)
    {
        
        int evencount=0;

        for(int i=0;i<a.length;i++)
        { 
            int x=a[i];
            int count = 0;
            if(x==0)
                count = 1;

            while(x!=0)
            {
                
                count++;
                x = x/10;

            }
            if(count % 2 ==0)
            {
                 System.out.println(a[i]);
            }
        }
        
    }
    
}
