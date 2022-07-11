class calculator{
	int x=3;
	int a=5,b=5;
    void calc(){
		System.out.println("a's value is 5 and b's value is 5");
	System.out.println("1----------->+\n2----------->-\n3----------->*\n4----------->/\n5----------->%\n");
	switch(x)
	{
	case 1: System.out.println(a+b);
			break;
	case 2:System.out.println(a-b);
			break;
	case 3:System.out.println(a*b);
			break;
	case 4:System.out.println(a/b);
			break;
	case 5:System.out.println(a%b);
			break;
	default:System.out.println("POK POK");
	}
	}
}
public class calcu{
public static void main(String args[]){
calculator cc=new calculator();
cc.calc();
}
}