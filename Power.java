public class Power {
    public static void main(String[] args) {
        int a = 6;//power
        int base = 3;
        int ans = 1;
        while(a>0){
        if((a & 1) == 1)
        {
            ans *= base;
        }
        base = base * base;
        a = a >> 1;
    }
        System.out.println(ans);
    }
    
    
}
