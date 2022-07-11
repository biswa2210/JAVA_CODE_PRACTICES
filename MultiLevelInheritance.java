class A {
    static String helloPrint(){
        return "Hello";
    }
}
class B extends A{
    static  String IPrint(){
        return helloPrint()+",I";//"Hello,I
    }
}
class C extends  B{
    static  String AmPrint(){
        return IPrint()+" Am ";//"Hello,I Am
    }
}
class D extends C{
     static String BiswaPrint(){
        return AmPrint()+"Biswarup Bhattacharjee";//"Hello,I Am Biswarup Bhattacharjee
    }
}
public class MultiLevelInheritance extends D{
    public static void main(String[] args){
        System.out.print(BiswaPrint());
    }
}
