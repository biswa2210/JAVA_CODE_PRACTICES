class foreachloop_concept{
	public static void  main(String[] args){
		int[][] s=new int[2][2];
		int ing=0;
		for(int i=0;i<2;i++)
		{
		for(int j=0;j<2;j++)
		{
		s[i][j]=ing;
		ing++;
		}
		}
		for(int a[] : s)
		{
		for(int pok : a)
		{
		System.out.println("INTEGER :"+pok);
		}
		}
	}
}