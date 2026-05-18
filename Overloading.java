//import java.util.Scanner;
public class Overloading {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        
        
        fun("mouzama");
        fun(47);

        /*int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();*/
        int a ;
        int b;
        int c;

        sum(10,30);
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
    }
    static void fun(int a){
        System.out.println(a);
//this is called overloading means have same function name with diff arguments in it
// might be diff return type or diff no.of arguments
    }
    static void fun(String name){
        System.out.println(name);
    }
    static int sum(int a,int b){

        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
}
/*when having same fn name then compiler checks
when the program is compiled then it decides which func should be taken*/
