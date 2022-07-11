package src.com.semanticsquare.basics;
public class ArithOps{
	/*	public  static void main(String[] args)
	{
		System.out.println("SUBSTRACTION : "+subs(7,3));
	sub(42,40);
	}*/
	static void sub(int p,int q)
	{
	int a=p;
	int b=q;
	System.out.println("SUBSTRACTION : "+subs(a,b));
	}
	private	static int subs(int a,int b){
		if(b==0)
		{
			return a;
		}
		return subs(a-1,b-1);
		}
	public	int hcf(int a,int b){
		if(b!=0)
		return hcf(b,a%b);
		else
		return a;
		}
	protected int add(int a,int b){
		if(b==0)
			return a;
		int y=add(a,b-1)+1;
		return y;
	}
	
}
