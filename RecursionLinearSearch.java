public class RecursionLinearSearch {
    public static void main(String[] args) {
      
        int[] a = {1,12,5,10,22};
        System.out.println(check(a,0));
        System.out.println(index(a,0));
        
    }
    public static boolean check(int[] a,int i){
        int target = 11;
        if(i==a.length){
            return false;
        }
        if(a[i]==target){
            return true;
        }
        return check(a,i+1);
    }
    
    public static int index(int[] a,int i){
        int target = 11;
        if(i==a.length){
            return -1;
        }
        if(a[i]==target){
            return i;
        }
      
        return index(a,i+1);
    }
}
