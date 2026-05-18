import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun("mahenoor","mouzama");
    }
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
        //during overloading atleast one parameter should exist
        // else compiler gives error of which fn should get executed int or String when both are empty 
        // known as ambiguity in overloading.
    }
}
