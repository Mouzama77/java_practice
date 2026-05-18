import java.util.Arrays;
class Peak {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,6,7,4,1,0};
        
        int x = peakIndexInMountainArray(arr);
        System.out.println(x);
    }
    
    static int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        
        int high = arr.length-1;
        while(low<high)
        {
            int mid = (low+high)/2;
            if(arr[mid]<arr[mid+1])
            {
                low=mid+1;
            }
            else
            {
                high = mid;
            }
        }

        return high ;
    }
}
    

