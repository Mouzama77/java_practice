import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a>b && a>c)
        {
            System.out.println( "a is largset ");
        }
        else if(b > c && b > a )
        {
            System.out.println("b is largest");
        }
        else{
            System.out.println(" c is largest");
        }
        //int max = Math.max(c,Math.max(a,b));
        //System.out.println(Math.max(34,47));
        //System.out.println(max);
    }
    
}
