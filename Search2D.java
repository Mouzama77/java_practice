import java.util.Arrays;
public class Search2D {
    public static void main(String[] args) {
        int[][] a = { {1 , 2, 3},{4,56},{7}};
        int target = 56;
        int[] result = search(a,target);
        System.out.println(Arrays.toString(result));
        
        
    }
    static int[] search(int[][] a,int target)
    {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]==target)
                { 
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    
}
