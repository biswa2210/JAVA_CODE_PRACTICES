public class amrstrongnumber{
public static void main(String args[])
{	boolean isamsno=false;//by default
	int rem,s=0;
	int n=153;
	int temp=n;
	while(n!=0)
	{
		rem=n%10;
		s=s+(rem*rem*rem);
		n=n/10;
	}
	if(temp==s){
	isamsno=true;
	}
	if(isamsno)
	{
	System.out.println("ITS A amrstrongnumber");
	}
	else
	{
	System.out.println("ITS not A amrstrongnumber");

	}
}
}