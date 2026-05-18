public class Factors {

    public static void main(String[] args) {
        //O(n)
     /*    int n = 20;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }*/
       //time cmpx: O(sqrt(n))
       int n = 17;
       for(int i=1;i*i<=n;i++)
       {
        if(n%i==0)
        {
            System.out.println(i);
            System.out.println(n/i);
        }
       }
        
    }
}
