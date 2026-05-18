import java.util.Arrays;
public class Max {
    public static void main(String[] args) {
        int[] arr = {44,55,-1,0,632,477,10400,00100};
        System.out.println(max(arr,1,3));
    }
    static int max(int[] arr,int s,int e){
        int m=arr[s];
        for(int i=s;i<=e;i++)
        {
            if(arr[i]>m)
            {
                m=arr[i];
            }
        }
        return m;

    }

}
