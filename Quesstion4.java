/*
Q.	Print Fibonacci Numbers/Series using abstraction.
*/
import java.util.Scanner;
abstract class FibonacciSi{
    abstract void fibonacciSeries(int n);
}
class FiboCore extends FibonacciSi{
     void fibonacciSeries(int n){
         int s=1,f=1,ans;
         for(int i=0;i<n;i++){
             if(i<=1){
                 ans=1;
             }
             else {
                 ans=s+f;
                 f=s;
                 s=ans;
             }
             System.out.print(ans+",");
         }
     }
}
public class Quesstion4 {
    public static void main(String[] args){
            int n;
            System.out.print("Enter number of terms : ");
            Scanner sc = new Scanner(System.in);
            n= sc.nextInt();
            FiboCore fibc=new FiboCore();
            fibc.fibonacciSeries(n);
    }
}
