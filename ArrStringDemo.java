import java.util.Scanner;
import java.util.Arrays;
public class ArrstringDemo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] arr = new String[3][2];
        for(int row= 0;row<arr.length;row++)//arr.length gives no.of rows
        {
            for(int col=0;col<arr[row].length;col++)
            {
                arr[row][col] = in.nextLine();
            }
        }
        for(int row =0;row<arr.length;row++)
        {
          
        
        System.out.print(Arrays.toString(arr[row]));
        System.out.println();
    }
    for(String[]  a:arr)//every element in array is an array
    {
        System.out.println(Arrays.toString(a));// no need for nxt line
    }
    
}
}
