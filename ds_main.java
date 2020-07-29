//Author @anirban
import ds.*;
import java.util.*;

public class ds_main{
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int operation;
		int choice;

		do{	
			System.out.println("Enter the operaton:-");
			System.out.println("1:stack");
			System.out.println("2:queue");
			System.out.println("3:linked list");
			System.out.println("4:tree");
			System.out.println("5:graph");
			System.out.println("0:exit programme");
			operation=scan.nextInt();
			
			if(operation==1)
				ds.stack.main(null);
			else if(operation==2)
				ds.cir_queue.main(null);
			else if(operation ==3)
				ds.single_LL.main(null);
			
		}while(operation!=0);
		System.out.println("Thank you");
		
		scan.close();
		
	}
}