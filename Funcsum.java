import java.util.Scanner;
public class Funcsum {
    public static void main(String[] args) {
        
    
    Scanner in = new Scanner(System.in);
    System.out.println("enter 1 number:");
    int a = in.nextInt();
    System.out.println("enter 2 number:");
    int b = in.nextInt();
    
    System.out.println(Fun(a,b));
    }
    static int Fun(int a,int b)
    {
        return a+b;
    }

    
}





