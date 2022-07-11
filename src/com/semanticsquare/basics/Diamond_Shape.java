class diamondShape{
	void gendiamond(int n){
		int r;
		int space;
		if (n%2==0)
		{
			r=n/2;
			r++;
			space=r;
		}
		else
		{
			r=n/2;
			r+=2;
			space=r;
		}
		for(int i=1;i<=r;i++)
		{
		for(int c=1;c<=space;c++)
			System.out.print(" ");
		space--;
		for(int j=1;j<=i;j++)
		{
		System.out.print("* ");
		}
		System.out.println();
		}
		
		for(int i=r;i>1;i--)
		{
			System.out.print(" ");
		for(int c=1;c<=space;c++)
			System.out.print(" ");
		space++;
		for(int j=i;j>1;j--)
		{
		System.out.print(" *");
		}
		System.out.println();
		}
	}
}
public class Diamond_Shape{
	public static void main(String[] args){
		diamondShape s=new diamondShape();
		s.gendiamond(9);
	}
}