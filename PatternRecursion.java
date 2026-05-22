
public class PatternRecursion {
    public static void main(String[] args) {
       
        star(4,0); 
        
    }
    static void star(int i,int j){
        if(i==0){
            return;
        }
        if(j<i){
            System.out.print('*');
            star(i,++j);
           
        }
        else{

        System.out.println();
         star(--i,0);}

    }
}
