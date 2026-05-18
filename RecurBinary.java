public class RecurBinary {
    public static void main(String[] args) {

        int[] a = {1,2,4,5,10};
        int key = 10;
        int s = search(a,key,0,a.length-1);
        System.out.println(s);

        
    }
    static int search(int[] a,int key,int low,int high)
    {
        if(low>high)
        {
            return -1;
        }
        int mid = (low+high)/2;
        if(key == a[mid])
        {
            return mid + 1;
        }
        else if(key>a[mid])
        {
            return search(a,key,mid+1,high);

        }
        else
        {
            return search(a,key,low,mid-1);
        }

    }
}
