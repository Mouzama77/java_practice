public class RecursionRotatedBinarySearch {
    public static void main(String[] args) {
        int[] a = {5,6,7,8,1,2,3};
       int m = check(a,0,2,a.length-1);
        System.out.println(m);
    }
    public static int check(int a[],int s,int key,int e){
        int mid = (s+e)/2;
        if(s>e){
            return -1;
        }
        if(a[mid]==key){
            return mid;
        }
        if(a[s]<=a[mid]){
            if(a[s]<=key && a[mid]>=key){

            return check(a,s,key,mid-1);
           }
            else{
               return check(a,mid+1,key,e);
            }}
        
        if(a[mid]<=key && a[e]>= key){
            return check(a,mid+1,key,e);
            }
         
                 return check(a,s,key,mid-1);
    }
    }
    


