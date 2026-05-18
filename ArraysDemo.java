import java.util.Scanner;
import java.util.Arrays;
public class ArraysDemo {
    public static void main(String[] args) {
        //datatype[] variable_name = new datatype[size];
        //int[] a = new int[5];
        // or 
       // int[] a = {1,2,3,4,5};
        // int[] a ; is declaration of array(this happens at compile time)
       // a = new int[5];// initialisation:here obj is being created in the memory
        //(creating the obj in heap memory)(mem allocated at run time)(this is known as dynamic mem allocation)
        // if size is not mentioned then it gives an error
        //internally values in array are 0 if we dont assign any values
        // for strings it shows null
        //for(int num:a)//for every element in array :print element
        {
         //   System.out.println(num);// num represents element of array
        }
        Scanner in = new Scanner(System.in);
        String[] c = new String[4];
        for(int i =0;i<c.length;i++){
        c[i] = in.next();}
       
        System.out.println(Arrays.toString(c));
        

    }

}
