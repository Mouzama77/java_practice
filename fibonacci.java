import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a=0,b=1;
        System.out.println("0");
        System.out.println("1");
        for(int i=3;i<n;i++)
        {

            int m = 0;
            
            m = a+b ;
            System.out.println(m);
            a=b;
            b=m;

        
        }


    }
    
}
