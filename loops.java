import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        /* Syntax
        for(initialisation; condition; increment/decrement){
        body}
         */
        Scanner input = new Scanner(System.in);
        /*int i ;
        for( i = 1;i<=5;i++)
        {System.out.print(" ");
        System.out.print(i);}*/
        
        int n = input.nextInt();
        //for(int i = 1 ; i<=n; i++)
        //System.out.print(i + " ");
        /* while syntax
        while (condition){
        // body
        }
         */
        
        /*while(i<=n)
        {
            System.out.println(i);
            i++;
        }
        /* do while syntax
        do{
        }
        while condition;
         */
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while(i<=n);
        
    }
}
