import java.util.Scanner;
public class KrishnaMurtiRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit :: ");
        int a;
        a = sc.nextInt();
        System.out.print("Enter the Upper limit :: ");
        int b;
        b = sc.nextInt();
        for(int i = a;i<=b;i++){
            if(isKrishnomurti(i)){
                System.out.println(i+" it is KrishnaMurti Number");
            }
            /*else {
                System.out.println(i+" it is not KrishnaMurti Number");
            }*/
        }
    }
    static boolean isKrishnomurti(int num){
        int rem,sum,n;
        sum=0;
        n=num;
        while (n!=0){
            rem=n%10;
            sum=sum+fact(rem);
            n=n/10;
        }
        if(num==sum){
            return true;
        }
        else {
            return false;
        }
    }
     static int fact(int n){
        if(n<1){
            return 1;
        }
        else {
            return n*fact(n-1);
        }
    }
}
