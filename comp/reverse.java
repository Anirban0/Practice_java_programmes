package comp;
import java.util.*;

public class reverse
{

public static int rev(int n)
{
	int a;
	int result=0;
	while(n>0)
	{
		a=n%10;
		result=result*10+a;
		n=n/10;
	}
		return result;
	

}

public static void main(String[] args)
{
	Scanner scanw=new Scanner(System.in);
	

	int t;
	int choice;
	do{
		
		System.out.println("Enter the number:-");
		t=scanw.nextInt();
		System.out.println(rev(t));
		System.out.println("Do you want to continue:-y/n");
		choice=scanw.next().charAt(0);
	}while(choice=='y'||choice=='Y');

}
}