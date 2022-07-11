class Global{
    boolean t=true;
    void p(){
        t=false;
    }
}
public class Variables {
    public static void main(String[] args){
        Global g = new Global();
        System.out.println(g.t);
        g.p();
        System.out.println(g.t);
    }
}
