class Romi{
    int R(int a){
        return a;
    }
}
class Rumi extends Romi{
    int R(int a){
        return  a+2;
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        Romi r = new  Romi();
        System.out.print(r.R(5));
    }
}
