class pattern1
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			int k=i;
			for(int j=0;j<4;j++)
			{
				System.out.print(k);
				if(k==4)
				{
					k=1;
				}
				else
				{
					k++;
				}	
			}
			System.out.println("");
		}
	}	
}