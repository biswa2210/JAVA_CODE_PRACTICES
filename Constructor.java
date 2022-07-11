//Constuctor  must not be return type and it has not any datatype also...
class Suyor{
    Suyor(int a){
        System.out.println(a);
    }
   Suyor(int a,int b){
        System.out.println(a+b);
    }

    /*Suyor(){

    }*/
}
class Harami{
    Harami(int a){
        System.out.println(a);
    }
    /*
    Harami(){
    }
    */
}
public class Constructor {
    public static void  main(String[] args){
        Suyor s = new Suyor(5,6);//Reference Variable is s
        Harami h =new Harami(5);//Reference Variable is h
    }
}
