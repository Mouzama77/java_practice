import java.util.Scanner;
public class Typecast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //float a = input.nextFloat();
        //System.out.println(a);
        // two types should be compatible
        // destination type should be greater than or equal to the source type
        // wkt float is greater than integer
        // int num = input.nextFloat(); gives an error
        // asking for integer and we give float also gives an error
        //int num = input.nextInt();
        //System.out.println(num);
        // if u r asking for smaller and giving bigger than that then will not work
// java also performs an automatic type conversion when storing literal integer 
//const into variables of type byte, short, long and even char sometimes it takes the ascii value of that

        


// converting integer to float explicitly: is known as typecasting(casting incompatible types)
// narrowing conversion 
int n = (int)(2343.756); // o/p is 2343
//System.out.println(n);


// automatic type promotion in expressions
int a = 257;
//byte b = a; gives error
byte b = (byte)(a);
//System.out.println(b); // maximum value can be stored in byte is 256
// now it gives 257 % 256 = 1 so o/p is 1
byte a = 40;
byte b = 50;
byte c = 100;
byte d = a * b / c;
System.out.println(d);
// here o/p is 20  
// here intermediate term a * b ( byte * byte = byte ) is 2000 which exceeds the byte range 
// to handle this kind of prblm JAVA is automatically is promoting each byte or short to int when its in this exp

byte b = 50;
b = b * 2;
// here b * 2 is 50 ( integer by java) which gives an error as b is byte so we need to typecast as in line 23

// java follows a uni code principle i.e any lang statement can be printed like in hindi chinese...
int num = 'A';
System.out.println(A);// o/p is 65 

// rules 
// 

    }

    
}

