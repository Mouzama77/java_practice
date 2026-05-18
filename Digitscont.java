public class Digitscont {
    public static void main(String[] args) {
        int n = 326;
        int b = 10;//decimal
        // int b = 2 ; // binary
        int ans = (int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
    }
    
}
