import java.util.*;

public class practice{

public static int fact(int n){
int result=1;

for (int i=1;i<=n;i++){
	result =result*i;
}
return result;
}

public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the number");
	int f=scan.nextInt();
	System.out.println(fact(f));
	scan.close();
	
}
}