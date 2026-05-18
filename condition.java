import java.util.Scanner;
public class condition {
    public static void main(String[] args) {
        // syntax:
        // if(boolean expression T or F)
        // body
        // else{
        // do this}
        Scanner in = new Scanner(System.in);
        int salary = 25400;
        if( salary > 10000){
            salary = salary + 2000;
        }
        else{
            salary = salary + 1000;
        }
        System.out.println(salary);
    
    }

    
}
