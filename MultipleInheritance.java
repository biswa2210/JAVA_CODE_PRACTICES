/*
class grandParentForMI {
    void fun() {
        System.out.println("Parent of parent1 & parent2");
    }
}
class Parent1 extends grandParentForMI {


    void fun() {

        System.out.println("Parent1");
    }
}

class Parent2 extends grandParentForMI {


    void fun() {

        System.out.println("Parent2");
    }
}

public class MultipleInheritance extends Parent1, Parent2 {
    public static void main(String args[]) {


        MultipleInheritance t = new MultipleInheritance();

        t.fun();
    }
}
*/
interface PARENT1{
    default void pok1(){
        System.out.println("Parent-1");
    }
}
interface PARENT2{
    default void pok2(){
        System.out.println("Parent-2");
    }
    default void pok3(){
        System.out.println("Parent-2");
    }
}
public class MultipleInheritance implements  PARENT1,PARENT2{ //implements---->extends
    public static void main(String[] args){
        MultipleInheritance o = new MultipleInheritance();
        o.pok2();
        o.pok3();
        o.pok1();
    }
}
