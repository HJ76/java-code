class swap
{
	public static void main(String args[])
	{
		int a=5;
		int b=8;
		b=a+b-(a=b);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
