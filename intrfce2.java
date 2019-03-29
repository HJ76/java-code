class intrfce2
{
	public static void main(String args[])
	{
		i obj = new i()
		{
			public void run()
			{
				System.out.println("hello");
			}	
		};
		obj.run();
	}
}
interface i
{
	void run();
}
