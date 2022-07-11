/*
Q.	Print Reverse of a number using inheritance.
*/
import java.util.Scanner;
class ManualInput {
    Scanner sc = new Scanner(System.in);
    int takeInput() {
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        return n;
    }
}
class ReverseNumber extends ManualInput{
    int convertReverseNumber(int n){
        int rem;
        int sum=0;
        while (n!=0){
            rem=n%10;
            sum=rem+(sum*10);
            n=n/10;
        }
        return sum;
    }

}
public class Question5{
    public static void main(String[] args){
        ReverseNumber rn = new ReverseNumber();
        int n;
        n=rn.takeInput();
        System.out.print(rn.convertReverseNumber(n));
    }
}
