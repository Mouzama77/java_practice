import java.util.Scanner;
public class New {
    int j=2;
    public static void main(String[] args) {
    int a,b,c;
    Scanner in = new Scanner(System.in);
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();
    New obj1 = new New();
    New obj2 = new New();
    System.out.println(obj1. add(a,b));
    System.out.println(obj1. sub(c,b));
    System.out.println(obj2. add(c,b));
    System.out.println(obj2. sub(c,b));
    
}
public int add(int a , int b)
{
    System.out.println(obj1.j);
    return a+b;
}
public int sub(int a,int b)
{
    return a-b;
}
}
