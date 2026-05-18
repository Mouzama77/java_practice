import java.util.Arrays;
import java.util.Scanner;
public class FindMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[7];
        for(int i:a)
        {
            a[i] = in.nextInt();
        }
        int result = findingmin(a);
        System.out.println(result);



    }
    static int findingmin(int[] a)
    {
        int min = a[0];
        for(int i=1;i<a.length;i++)
        {
            if(min>a[i])
            {
                min = a[i];
            }

        }
        return min;
    }
    
}
