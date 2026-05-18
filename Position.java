import java.util.Arrays;
import java.util.Scanner;
public class Position {
    public static void main(String[] args) {
        int[] a = {3,5,7,9,10,90,100,130,140,160,170};
        int key = 10;
        System.out.println(infinite(a,key)); 
    }
    static int infinite(int[] a,int key)
    //first find range
    //first start with a box of size 2
    {
        int low = 0;
        int high = 1;
        // condition for the key to lie in space
        while(key>a[high]&&high<a.length)
        {
            int x = high + 1;//this is my new start
            //double the box value
            //end = previous end + sizeofbox*2;
            high = high + 2*(high - low + 1);
            if(high >=a.length)
            {
                high=a.length-1;
            }
            low = x;
        }
        return binary(a,key,low,high);
    } 
    static int binary(int[] a,int key,int low,int high)
    {
         
        while(low<high)
        {
            int mid = (low+high)/2;
            if(a[mid]==key)
                return mid;
            else if(a[mid]>key)
            {
                high = mid - 1;
                
            }
            else 
            {
                
                low = mid + 1;
            }
        }
        return -1;
    }
}
