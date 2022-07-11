import java.util.Scanner;
public class StaticInitializer {
    static boolean flag;
     static int n;
    static {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        n= sc.nextInt();
        if(n%2==0){
            flag=true;
        }
        else {
            flag=false;
        }
    }
    public static void main(String[] args){
        if(flag){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
