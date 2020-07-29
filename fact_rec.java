import java.util.*;


public class fact_rec{

static int fact(int n){
	
	if(n>0)
		n=n*fact(n-1);
	return n;
	}
	


public static void main(String[] args)
{
	int f;
	Scanner scan= new Scanner(System.in);
	
	System.out.println("Enter a number:-");
	f=scan.nextInt();
	
	System.out.println(fact(f));
	scan.close();
	
}}
	