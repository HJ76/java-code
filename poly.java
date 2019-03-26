//next day puzzle
class poly
{
	public static void main(String args[])
	{
		child c = new child(5);
	}
}
class parent
{
	parent()
	{
		System.out.println("parent constructor");
	}
	parent(int a)
	{
		System.out.println("parent constructor "+a);
	}
}
class child extends parent
{
	child()
	{
		System.out.println("child constructor");
	}
	child(int a)
	{
		System.out.println("child constructor "+a);
	}
}