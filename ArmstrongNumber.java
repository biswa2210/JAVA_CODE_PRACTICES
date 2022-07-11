import java.util.Scanner;
import java.lang.Math;

class CheckArmstrong{

    static int calculateDigits(int n){
        int rem;
        int c;
        c=0;
        while(n!=0){
            rem=n%10;
            n=n/10;
            c++;
        }
        return c;
    }

    boolean isCheck(int n){
        int temp,rem;
        double remd,sum;
        sum=0;
        temp=n;
        if(calculateDigits(n)==1){
            return false;
        }
        else {
            while (temp!=0){
                rem=temp%10;
                remd=rem;
                sum=sum+Math.pow(remd,(double) calculateDigits(n));
                temp=temp/10;
            }
            if(sum==n){
                return true;
            }
            else{
                return false;
            }
        }

    }
}
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int lowLMT,upLMT;
        System.out.print("Enter the lower limit : ");
        lowLMT=sc.nextInt();
        System.out.print("Enter the upper limit : ");
        upLMT=sc.nextInt();
        CheckArmstrong ca=new CheckArmstrong();
        for(int i = lowLMT;i<=upLMT;i++){
            if(ca.isCheck(i)){
                System.out.println(i+" It is Armstrong Number");
            }
        }
    }
}