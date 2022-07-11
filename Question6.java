//Use 5 interfaces and print a statement in 2 lines using multiple inheritance.
interface A1{
    default void m1(){
        System.out.print("I am ");
    }
}
interface A2{
    default void m2(){
        System.out.print("Biswa ");
    }
}
interface A3{
    default void m3(){
        System.out.print("Sikder, studying ");
    }
}
interface A4{
    default void m4(){
        System.out.println("BTECH in CSIT ");
    }
}
interface A5{
    default void m5(){
        System.out.println("in UEMK.");
    }
}
public class Question6 implements A1,A2,A3,A4,A5{ //implements---->extends
    public static void main(String[] args){
        Question6 o = new Question6();
        o.m1();
        o.m2();
        o.m3();
        o.m4();
        o.m5();
    }
}