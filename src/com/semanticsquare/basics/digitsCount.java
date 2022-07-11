package src.com.semanticsquare.basics;
public class digitsCount{
	
	public void digitsCountinStr(String strr){
	int i;
	int[] arr=new int[10];
	for(i=0;i<10;i++)
	{
		arr[i]=0;
	}
		for(i=0;i<strr.length();i++)
		{
			if(strr.charAt(i)>'0' || strr.charAt(i)<'9'){
				arr[(int)strr.charAt(i)-'0']++;
			}
		}
	for(i=0;i<10;i++)
	{
		System.out.println(i+" ---> "+arr[i]+"times");
	}
		
	}
}