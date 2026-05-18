import java.util.Arrays;
public class Cyclic { 
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }  
    static void sort(int[] arr)
    {
        int i=0;
        while(i<arr.length)

        {
            int x = arr[i]-1;
            if(arr[i]!=arr[x])
            {
                int temp = arr[i];
                arr[i]=arr[x];
                arr[x] = temp;
            }
            else 
                 i++;
        }
        
    }
    
}
