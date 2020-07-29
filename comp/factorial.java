package comp;
import java.util.*;

public class factorial{

public static int fact(int n){
int result=1;

for (int i=1;i<=n;i++){
	result =result*i;
}
return result;
}

public static void main(String[] args){
	
	Scanner scanq=new Scanner(System.in);
	
	
	int choice;
	
	do{
		System.out.println("Enter the number");
		int f=scanq.nextInt();
		System.out.println(fact(f));
		System.out.println("Do you want to continue:-y/n");
		choice=scanq.next().charAt(0);
		
	}while(choice=='y');
	
	
}
}