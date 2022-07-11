/*
Q.	Create an abstract classEvenOddCheck.
    Create an abstract function in this abstract class named Logic.
    Here the logic of even odd checking will be kept. Then create another class PrintEvenOdd.
    This class will inherit the previous class. At last, create main function to check even odd.
*/
import java.util.Scanner;
abstract class EvenOddCheck{
    abstract void Logic(int n);
}
class PrintEvenOdd extends EvenOddCheck{
    void Logic(int n){
        if(n%2==0){
            System.out.print(n+" it is a even number");
        }
        else {
            System.out.print(n+" it is a odd number");
        }
    }
}
public class Question2 {
    public static void main(String[] args){
        PrintEvenOdd printEvenOdd =new PrintEvenOdd();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n;
        n= sc.nextInt();
        printEvenOdd.Logic(n);
    }
}
