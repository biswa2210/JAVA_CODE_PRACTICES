/* (a+2^0*b)+(a+2^0*b+2^1*b)+(a+2^0*b+2^1*b+2^2*b)+...........(a+2^0*b+2^1*b+2^2*b+...+2^(n-1)*b) */
import java.util.Scanner;
public class SpecialProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases : ");
        int testCases = sc.nextInt();
        System.out.println("---------------------------------------------------------------------------");
        for (int i = 1; i <=testCases; i++) {
            System.out.println("Take Inputs of Test Case - "+i);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;
            System.out.println("Producing Series of Test Case - "+i);
            for (int j = 0; j < n; j++) {
                sum += b * Math.pow(2, j);
                System.out.print(sum + " ");
            }
            System.out.println();
            System.out.print("---------------------------------------------------------------------------");
            System.out.println();
        }
    }
}
