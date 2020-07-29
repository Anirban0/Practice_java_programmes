import comp.*;
import java.util.*;

public class main{
		public static void main(String[] args){
			
			Scanner scan =new Scanner(System.in);
			int operation; 
			int choice;
			
			do{
				System.out.println("Enter the operation:-");
				System.out.println("1:factorial.");
				System.out.println("2:sum of digits.");
				System.out.println("3:reverse a number.");
				operation=scan.nextInt();
				
				if(operation==1)
					factorial.main(null);
				else if(operation==2)
					sumofdigits.main(null);				
				else if(operation==3)
					reverse.main(null);				
				else
					System.out.println("Wrong command!!!");
				
			System.out.println("Do you want to continue to another operation?y/n");
			choice=scan.next().charAt(0);
			
			}while(choice=='y'||choice=='Y');
				
			System.out.println("Thank you :-)");
			scan.close();
		}
}