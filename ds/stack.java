//author : @anirban

package ds;
import java.util.*;

public class stack
{	
	
	int[] stack_array;
	int top;
	
	
	public stack(int size) 
	{
		this.stack_array = new int[size];
		this.top = -1;
		System.out.println("Successfully created an empty Stack of Size: "+size);
	}
	void peek()
	{
		if (top==-1)
			System.out.println("stack is empty!!!");
		else
		{
			System.out.println("Top element is:-"+stack_array[top]);
		}
	}
	void delete(int size)
	{
		
			stack_array = null;
		System.out.println("Stack is successfully deleted");
		top=-1;
		this.stack_array = new int[size];
		
		
	}
	void show(){
		if(top==-1)
		{
			System.out.println("Stack is empty!!!");
		}
		else
		{
			System.out.println("Elements are:-");
		
			for(int i=0;i<=top;i++)
				System.out.println(stack_array[i]);
		} 
		
	}
	void push(int a)
	{
		if(top==stack_array.length-1)
			System.out.println("Stack overflow!!!");
		
		else
		{	
			top++;
			stack_array[top]=a;
			System.out.println("Pushed succesfully");
		}
	}
	
	void pop()
	{
		if(top==-1)
			System.out.println("Stack is empty!!!");
		else
		{
		System.out.println("Popped value is "+stack_array[top]);
		top--;
		}
	}
	
	void isempty()
	{
		if(top==-1)
			System.out.println("Stack is empty!!!");
		else
			System.out.println("Stack is not empty.");
	}
	
	void isfull()
	{
			
			if(top==stack_array.length-1)
				System.out.println("Stack is full.");
			
			
			else
				System.out.println("Stack is not full.");	
	}
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int operation;
		int p;
		System.out.println("Enter size of the stack:-");
		int size=scan.nextInt();
		stack s=new stack(size);
		do{
			System.out.println("");
			System.out.println("Enter the operation:-");
			System.out.println("1:push 2:pop 3:isempty 4:isfull 5:ShowStack 6:peek 7:deleteStack 0:exit stack operation");
			operation=scan.nextInt();
			
			if(operation==1)
			{	
				System.out.println("Enter a number to push");
				
					p=scan.nextInt();
					s.push(p);
				
			}
			else if(operation==2)
			{
				s.pop();
			}
			else if(operation==3)
			{
				s.isempty();
			}
			else if(operation==4)
			{
				s.isfull();
			}
			else if(operation==5)
			{
				s.show();
			}
			else if(operation==6)
			{
				s.peek();
			}
			else if(operation==7)
			{
				s.delete(size);
			}
			
			
		}while(operation!=0);
		
		System.out.println("Thank you :-)");
		
	}
}