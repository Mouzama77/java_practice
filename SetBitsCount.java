public class SetBitsCount {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(Integer.toBinaryString(n));
        
        System.out.println(set(n));
    }
        private static int set(int n){

            int count = 0;
        while(n>0)
        {
            count ++;
            n = n - (n & (-n));
           
        }
        return count;
        
    }
    
}
