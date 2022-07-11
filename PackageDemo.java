import src.com.semanticsquare.basics.digitsCount;
import java.util.Scanner;
public class PackageDemo{
	public static void main(String[] args)
	{
		Scanner str=new Scanner(System.in);
		String strrr=str.nextLine();
		digitsCount s1=new digitsCount();
		s1.digitsCountinStr(strrr);
	}
}