import java.util.Scanner;
public class Funstr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        System.out.println(greet(x));
    }
    static String greet(String a){
       
        return "Good Evening "+a+ " Have a nice day";
    }   
}