class intrfce3
{
	public static void main(String args[])
	{
		i obj = () -> System.out.println("hello");
		obj.run();
	}
}
interface i
{
	void run();
}
