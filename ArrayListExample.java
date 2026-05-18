import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        //syntax ://for unknown size
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        //in rhs Integer is not mandatory
       /*  list.add(67);
        
        list.add(478);
        list.add(97);
        list.add(407);
        list.add(7);

        list.add(447);
        list.add(470);
        list.add(471);

        list.add(473);
        list.add(4766);
        System.out.println(list);*/
    for(int i=0;i<5;i++)
    {
        list.add(in.nextInt());
        System.out.print(list+ " ");
        System.out.println();
    }
    System.out.println(list+" ");
    }

    
}
