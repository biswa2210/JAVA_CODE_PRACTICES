import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class Methods{
    void func(){
        System.out.print("Print func");
    }
    int func(int a){
        return a;
    }
    int func(int a,int b){
        return a;
    }
}

public class MethodOverloading {
 public  static  void  main(String[] args){
     Methods m = new Methods();
     m.func(5);
     LocalDateTime now = LocalDateTime.now();
     System.out.print(now);
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd//MM/yyyy HH:mm:ss");
     System.out.print("\n"+dtf.format(now));
 }
}
