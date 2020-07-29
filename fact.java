import java.util.*;

public class fact
{
	public int fact_ret(int n)
	{	
		int m=n;
		while(n>1)
		{
			m=m*(n-1);
			n--;
		}
		return m;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:-");
		int n=scan.nextInt();
		fact f=new fact();
		
		System.out.println("factorial of "+n+" is:- "+f.fact_ret(n));
		scan.close();
		
	}
}