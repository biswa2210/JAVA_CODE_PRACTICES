//WRITE A PROGRAM IN JAVA TO FIND FACTORIAL OF A NUMBER
import java.util.Scanner;
class factorial_no{
	int fact(int n){
		if (n==0){
			return 1;
		}
		
			return n*fact(n-1);
		
	}
}
public class Fact_num{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	factorial_no obj=new factorial_no();
	int num,factofnum;
	System.out.println("Enter the number :: ");
	num=s.nextInt(); 	
	factofnum=obj.fact(num);
	System.out.println(num+"!="+factofnum);
	}
}