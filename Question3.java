/*
Q. Print Fibonacci Numbers/Series using simple class object concept.
*/

import java.util.Scanner;
class Fibonacci{
    int calculateSeries(int n){
        if(n<=1){
            return 1;
        }
        else {
            return (calculateSeries(n-1)+calculateSeries(n-2));
        }
    }
}
public class Question3 {
    public static void main(String[] args){
        Fibonacci fib=new Fibonacci();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of Terms : ");
        int n;
        n= sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.print(fib.calculateSeries(i)+",");
        }

    }
}
