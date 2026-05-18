import java.util.Arrays;
public class StringsSearch{
    public static void main(String[] args) {
    String name = "Mahenoor";
    char target = 'o';
    System.out.println(search(name,target)); 
    //Sop(Arrays.toString(name.toCharArray()));  
}
static boolean search(String str,char target)
{
    if(str.length()==0)
    {
        return false;
    }
    for(int i=0;i<str.length();i++)
        //for(char ch:str.toCharArray())
    {
        if(target == str.charAt(i))
            //if(ch == target)
            return true;
    }
    return false;
}}
