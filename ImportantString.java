public class ImportantString {
    public static void main(String[] args) {
        String series = "";
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            System.out.println(ch);// new string object is created for every iteration 
            // hence it is not optimal (wasteofspace)
            // so here it is O(n^2)
            series = series + ch;

    }
System.out.println(series);
}

    
}
