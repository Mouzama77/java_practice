public class squareRoot {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;

        System.out.printf("%.3f",sqrt(n,p));
        //time compx is O(log(N))
    }


    static double sqrt(int n,int p){
        
        int low = 0;
        int high = n;
        double root = 0.0;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(mid*mid==n)
            {
                return mid;
            }
            if(mid*mid>n)
            {
                high = mid - 1;

            }
            else{
                low = mid + 1;
            }
            double inc = 0.1;
            for(int i=0;i<p;i++)
            {
               while(root*root<= n)
               {
                root += inc;
               }
               root -= inc;
               inc /= 10; 

            }
            

            }

            return root;
        }
    
    
}
