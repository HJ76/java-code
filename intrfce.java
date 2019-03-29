class intrfce
{
	public static void main(String args[])
	{
		j obj = new j();
		obj.run();
	}
}
interface i
{
	void run();
}
class j implements i
{
	public void run()
	{
		System.out.println("hello");
	}
}



