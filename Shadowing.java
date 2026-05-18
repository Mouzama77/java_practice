public class Shadowing {
    public static void main(String[] args) {
        int a = 10;
        {
            a = 50;//can be reassigned but not declared again in the block
            int c = 99;
            System.out.println(a+" "+c);
        }
        // c can be declared here again because compiler dont know about the c inside the block
        a = 77;
        int c = 45;
        System.out.println(a+" "+c);
        
    }
    
}
