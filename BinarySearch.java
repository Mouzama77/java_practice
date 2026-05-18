import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] a = new int[7];
        for(int i=0;i<a.length;i++)
        {
            a[i] = in.nextInt();
        }

        int ans = ceiling(a,t);
        System.out.println(ans);

        /*if(ans==t||ans>t)
        {
            System.out.println(t);
        }
        else if(ans<t)
        {
            System.out.println(ans);
        }*/
    }
    //sorted array then surely apply binary search
    static int ceiling(int[] a,int t)
    {
        int low = 0;
        int high = a.length-1;
        while(low <= high){
        
        int mid = (low+high)/2;
        if(t==a[mid])
        {
            return t;
        }
        else if(t>a[mid])
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }
        return high;//floor
        //return low; //ceiling
    
            } 
        
   }
    

