package comp;
import java.util.*;

public class sumofdigits{

public static int sum(int n){
	
	int result=0;
	int a;
	while(n>0)
	{
		a=n%10;
		result=result+a;
		n=n/10;
	}
	return result;
}
public static void main(String[] args){
	Scanner scane=new Scanner(System.in);
	int t;
	int choice;
	do{
		System.out.println("Enter the number:-");
		t=scane.nextInt();
		System.out.println(sum(t));
		System.out.println("Do yoiu want to continue:-y/n");
		choice=scane.next().charAt(0);
	}while(choice=='y'||choice=='Y');
	
}
}
		