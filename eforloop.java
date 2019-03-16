class eforloop
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		for(int k=0;k<5;k++)
		{
			a[k]=k+1;
		}
		for(int i :a)
		{
			System.out.println(i);
		}
	}
}