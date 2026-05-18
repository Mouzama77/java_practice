class Indexx{
    int a,b;
    void setData(int c,int d){
        a=c;
        b=d;
    }
    void output(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args){
        Indexx m= new Indexx();
        m.setData(2,3);
        m.output();
}

}
