import java.util.Arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = in.nextInt();
        }
        int key = in.nextInt();
        int g = linearS(n,a,key);
        System.out.println(g);
        
        
    }
    static int linearS(int n,int[] a,int key)
    {

        for(int i=0;i<n;i++){
        if(a[i]==key)
        {
            return i+1;
        }  }
        return -1;

    }

    
}
