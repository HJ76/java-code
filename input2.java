import java.io.BufferedReader;
import java.io.InputStreamReader;
class input2
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		//int n=Integer.parseInt(br.readLine());
		String n=br.readLine();
		System.out.println(n);
	}
}
