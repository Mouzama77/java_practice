import java.util.ArrayList;
public class Stringop {
    public static void main(String[] args) {
        System.out.println('m');// output is m only
        System.out.println("m");// strings remains as it is
        System.out.println('a'+'b');// ascii values are added
        System.out.println("a"+"b");// values are concatenataed
        System.out.println("a"+ 1);
        System.out.println('a'+1);// all output values are strings
        System.out.println("mahenoor"+ new ArrayList<>() );
        System.out.println("mouzama"+ Integer.valueOf(99));// new Integer(99) is old version
        System.out.println("a"+'b');//if start is string then remaing is also string
        // hence this output is ab only not a98...

        
    }
    
}
