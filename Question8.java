import java.util.*;
import java.util.Scanner;

//8.  Create class named Takeinput2. Create 2 functions named takelowerlimit() and takeupperlimit(). Create 3 functions named takethreedigit(), takestring(), takearray(). Create object in main() and take the runtime  inputs and using takelowerlimt() and takeupperlimit() check buzz no., amstrong no., krishnamurti no. Check magic number using takethreedigit().Count vowels and consonents in a string using takestring(). Print reverse of an array using takearray(). There should not be extra classes except main and Takeinput2. Don’t use inheritance.
class Takeinput2{
    int takelowerlimit(){
        System.out.print("Enter the lowerlimit : ");
        int low;
        Scanner sc=new Scanner(System.in);
        low=sc.nextInt();
        return low;
    }
    int takeupperlimit(){
        System.out.print("Enter the upperlimit : ");
        int up;
        Scanner sc=new Scanner(System.in);
        up=sc.nextInt();
        return up;
    }
    int take3digit(int n){
        {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            return n;
        }
    }
    String takestring() {
        {
            Scanner sc = new Scanner(System.in);
            String s1;
            s1= sc.nextLine();
            return s1;
        }
    }
    int[] takearray(){
        int[] a = new int[5];
        int i,x;
        Scanner sc= new Scanner(System.in);
        for (i=0; i<a.length; i++)
        {
            x=sc.nextInt();
            a[i]=x;
        }
        return a;

    }
}
public class Question8 {

    public static void main (String[] args){
        Takeinput2 t= new Takeinput2();
        int up,low;
        up=t.takeupperlimit();
        low=t.takelowerlimit();

        for(int i=low;i<=up;i++)
        {
            if(isAmstrong(i)){
                System.out.println(i+" Armstrong No.");
            }
            if(issomman(i)){
                System.out.println(i+" Krishnamurti No.");
            }
            if (Buzznum(i)) {
                System.out.println(i+" Buzz No.");
            }
        }


    }
    static boolean isAmstrong(int n)//for checking if a number is amstrong or not
    {
        int a,rem,sum,t;
        t=n;
        a=t;
        sum=0;
        while(a!=0)
        {
            rem=a%10;
            sum=sum+(rem*rem*rem);
            a=a/10;
        }
        if (sum==t)

            return true;
        else
            return false;
    }
    static boolean Buzznum(int a){
        if(a % 7 == 0 || (a % 10) == 7)
            //System.out.println("The number is buzz number.");
            return true;
        else
            return false;
    }
    static boolean issomman(int n)//checking if a number is somman number
    {
        int a,rem,sum,t;
        t=n;
        a=t;
        sum=0;
        while(a!=0)
        {
            rem=a%10;
            sum=sum+(factorialof(rem));//func calling
            a=a/10;
        }
        if (sum==t)

            return true;
        else
            return false;
    }
    static int factorialof(int m){//calculating factorial of a number
        {
            int j,fact;
            fact=1;
            for(j=1;j<=m;j++)
            {
                fact=fact*j;
            }
            return fact;
        }
    }
}