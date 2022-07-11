import java.util.Scanner;
import java.lang.*;
import java.util.*;
class calc{
	void calculations(int op,int a,int b){
	switch(op)
	{
		case 1:System.out.println("Addition Result :: "+(a+b));
				break;
		case 2:System.out.println("Substraction Result :: "+(a-b));
				break;
		case 3:System.out.println("Multiplication Result :: "+(a*b));
				break;
		case 4:System.out.println("Division Result :: "+(a/b));
				break;
		case 5:System.exit(0);
				break;
		default:System.out.println("THIS IS INVALID CHOICE");
	}
	}
}
public class simple_calc{
	public static void main(String[] args){
	int choice;
			Scanner s = new Scanner(System.in);
		System.out.println("Enter your 1st number :: ");
		int a=s.nextInt();
		System.out.println("Enter your 2nd number :: ");
		int b=s.nextInt();
	do{
	System.out.println("**********MENU**********");
	System.out.println("1.ADD");
	System.out.println("2.MINUS");
	System.out.println("3.MULTIPLICATION");
	System.out.println("4.DIVISION");
	System.out.println("5.Exit");
	System.out.println("************************");
	System.out.println("Enter your choice :: ");
	Scanner obj=new Scanner(System.in);
	choice=obj.nextInt();
	System.out.println("************************");
	calc myobj=new calc();
	myobj.calculations(choice,a,b);
	}while(choice>=1 || choice<=5);
	
	}
}