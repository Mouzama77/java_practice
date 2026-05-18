import java.util.Scanner;
class Repeat{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = n;
    int k = in.nextInt();
    int count = 0;
    int c;
    while(n>0)
    {
        c = n%10;
        if(c == k)
        {
            count++;
        }
        n = n/10;
    }
    System.out.println(count);
    }

}