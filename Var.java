import java.util.Arrays;

public class Var {
    public static void main(String[] args) {
        multiple(2,35,"riya","priya","diya");

        
    }//...v contains any no.of arguments so ...v should always be at the end
    static void multiple(int a , int b, String...v){
        System.out.println(a+" " +b+" " +Arrays.toString(v));
    }
    
}
