import java.util.Arrays;
public class SelectionSort_Recursion {
    public static void main(String[] args) {
        int[]  a = {1,2,5,8,3,4};
        sort(a,a.length,0,0);
        System.out.println(Arrays.toString(a));

        
    }
    static void sort(int[] a,int i,int j,int max){
        if(i==0){
            return;
        }
        if(j<i){
            if(a[j]>a[max]){
               sort(a,i,j+1,j);
            }
            else{
            sort(a,i,j+1,max);}
        }
              
        else{
            int temp = a[max];
            a[max] = a[i-1];
            a[i-1] = temp;
            sort(a,i-1,0,0);
        }
    }
    
    }
    
    

