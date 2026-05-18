import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String input = inp.nextLine();
         StringBuilder b = new StringBuilder(input);
        b.reverse();
        System.out.println(b);   
    }
}