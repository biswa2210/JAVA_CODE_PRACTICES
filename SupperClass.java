class Rahul{
   Rahul(int a){
        System.out.println("Boom : " + a);
    }
}
class RahulSubClass1 extends  Rahul{
     RahulSubClass1(){
         super(8);

    }
}
class RahulSubClass2 extends  Rahul{
    RahulSubClass2(){
        super(9);
    }
}
public class SupperClass {
public static void  main (String[] args){
    Rahul r= new RahulSubClass1();
}
}
