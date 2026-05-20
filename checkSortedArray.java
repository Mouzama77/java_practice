public class checkSortedArray {
    public static void main(String[] args) {
        int[] a = { 1,8,3,4,5};
        System.out.println(check(a,0));
    }
    public static boolean check(int[] a , int i){
        if(i== a.length-1){
            return true;
        }
        return a[i]<a[i+1] && check(a,i+1);
    }
    
}
