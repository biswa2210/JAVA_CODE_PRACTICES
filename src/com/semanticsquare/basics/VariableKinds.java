 class variableseg{
	int i=10;
	float f=0.12f;
	short s=100;
	long l=1000000L;
	int ap=0x41;//hexadecimal integer
	int bi=0b00100001;//Binary integer
	char ch='b',c='a';
	int a=c,b=ch;
	void print()
	{
	System.out.println(i);
	System.out.println(l);
	System.out.println(ap);
	System.out.println(bi);
	System.out.println(s);
	System.out.println(f);
	System.out.println(c+"'s ascii value is = "+a);
	System.out.println(ch+"'s ascii value is = "+b);
	}
 }
 public class VariableKinds{
	public static void main(String args[])
	{
		variableseg vk = new variableseg();
		vk.print();
	}
 }