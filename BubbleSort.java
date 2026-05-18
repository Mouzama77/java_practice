import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       /*  int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = in.nextInt();
        }*/
       int[] a = {5,4,3,2,1};
        bubble(a);
      
        
        System.out.print(Arrays.toString(a));
        

    }
    static void bubble(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=1;j<a.length-i;j++)
            {
              if(a[j]<a[j-1])
              {
                int temp = a[j];
                a[j]=a[j-1];
                a[j-1] = temp;
              }

            }
        }
    }
    
}
