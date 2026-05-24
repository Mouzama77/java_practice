import java.util.Arrays;
public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        sort(a,a.length-1,0);
        System.out.println(Arrays.toString(a));
        
    }
    public static void sort(int[] a,int i,int j){
        if(i==0){
            return ;
        }
        if(j<i){
            if(a[j]>a[j+1]){
                int temp = a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
            
            sort(a,i,++j);
        }
        else{
            sort(a,--i,0);
        }

    }
    
}
