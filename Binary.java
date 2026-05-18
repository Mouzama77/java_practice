import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int [] a;
        a = new int[n];
        for(int i=0;i<n;i++){
        a[i]=in.nextInt();}
        int key = in.nextInt();
        int pos = BS(a,n,key);
        if(pos!=-1)
        {
            System.out.println(" element found at " + pos);
        }
        else
        {
            System.out.println("element not found");
        }
    }
    
    public static int BS(int[] a,int n,int key)
    {
        int low = 0,high = n-1,mid;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(a[mid]==key)
            {
                return mid+1;
            }
            else if(a[mid]>key)
            {
                high = mid-1;
            }
            else 
            {
                low = mid+1;
            }
           
        }
        return -1;
    }
}

