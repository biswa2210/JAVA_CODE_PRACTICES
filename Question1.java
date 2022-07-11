/*
Q. Create a class TakeInput. Then create 2 functions in this class. takelowerlimit and takeupperlimit.
   Create another class Logic. Then create 2 functions in this class. CheckPrime and CheckAmstrong.
   Create another class Printing. Then create 2 functions in this class. PrimeDisplay and AmstrongDisplay.
   Print all these things using object creation method in the main function.
*/
import java.util.Scanner;
import java.lang.Math;
class TakeInput{
    Scanner sc = new Scanner(System.in);
    int lowerlimit;
    int upperlimit;
    int takeLowerLimit(){
        System.out.print("Enter the lower limit :: ");
        lowerlimit=sc.nextInt();
        return  lowerlimit;
    }
    int takeUpperLimit(){
        System.out.print("Enter the lower limit :: ");
        upperlimit=sc.nextInt();
        return  upperlimit;
    }
}
class Logic{

    boolean checkPrime(int n,int i){
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return checkPrime(n, i + 1);
    }
    boolean checkArmstrong(int num){
        int sum=0,rem;
        int n=num;
        while (n!=0){
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(sum==num){
            return true;
        }else {
            return  false;
        }
    }

}
public class Question1 {
    public static void main(String[] args){
            int ll,ul;
            TakeInput takeInput = new TakeInput();
            ll=takeInput.takeLowerLimit();
            ul=takeInput.takeUpperLimit();
            Logic logic=new Logic();
            for(int i=ll;i<=ul;i++){
              if(logic.checkArmstrong(i)){
                  System.out.println(i+" it is Armstrong Strong");
              }if (logic.checkPrime(i,2)){
                  System.out.println(i+" it is Prime Strong");
              }
            }

    }
}
