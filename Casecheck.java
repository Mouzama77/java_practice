import java.util.Scanner;
public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = "hello";
        //System.out.println(word.charAt(8));
        char ch = in.next().trim().charAt(0);
        //System.out.println(in.next().trim());
        //here it removes unecessary spaces and 
        //if the input is mouzama mahenoor then the output is only mouzama
        if(ch>='a' && ch <= 'z')
        {
            System.out.println("lowercase");
        }
        else{
            System.out.println("uppercase");
        }
        //only checks first letter 
    }
}
