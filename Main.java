import java.util.Scanner;
public class Main
// Main is identifier ( beside class )
{
    public static void main(String[] args) 
    // above main is identifier
    {
        Scanner input = new Scanner(System.in);
        int a = 10;
        // int primtive data types(basic data types built in programming language that cannot be further broken down into simpler types like int,bool,char,float) 10 is called literal(fixed value in source unlike variables)
        //(syntactical representatin of boolean , char , numeric...)
        // a is called identifier (referrence variable is called as identifier)
        // name of the variable, class, method , packages, interfaces... in java
        int b = 234_000_000;
        // _ are ignored 
        //String name = input.next();
        // input.next prints only first string
        // input.nextLine prints whole line
        float marks = input.nextFloat();
        // doesnt give accurate value (gives round of value after dcml pnt)
        System.out.println(marks);
    }

}