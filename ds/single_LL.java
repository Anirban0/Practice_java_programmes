//@ Created by Anirban
package ds;
import java.util.*;
	
public class single_LL  
{

		public class node //.........................................NODE
	{
		int data;
		node next;
	}
	
	node head;
	node tail;
	int size;
	
	void create_new_ll(int value)//.................................CREATE NEW LINKED LIST
	{
			head = new node();
			node node = new node();
			node.data = value;
			node.next = null;
			head = node;
			tail = node;
			this.size = 1 ;
			System.out.println("Node created successfully of value:-"+value);
	}
	
	public boolean isLLexist()//....................................IS LL EXISTS
	{
		return head != null;// it will return true if head is not null
	}
	
	
	void insert(int value,int location)//...........................INSERTION
	{
		node node = new node();
		node.data = value; 
		
		if(isLLexist() == false)//...if linked list does not exist
		{
			System.out.println("Linked list doesnot exist!!! Create a new first.");
		}
		else if(location == 1)//....first node
		{
			node.next = head; //....node pointing to previous head node.
			head = node;  //.......making it head node.
		}
		else if(location >= size)//..last node.
		{	
			tail.next = node; //....prevoius tail node pointing to new node.
			node.next = null; //..new node pointing to null because its last node.
			tail = node; //.........making it tail node.
		}
		else
		{
			node tmp = head;
			int index = 1;
			while(index < location - 1)//..tmp index will point to previous node of desired location
				{
					tmp = tmp.next;
					index++;
				}
			node.next = tmp.next;
			tmp.next = node;
		}
		System.out.println("Node created successfully of value:-"+value);
		size++;
	}
	
	
	void show()//...................................................TRAVERSAL
	{
		if(head!=null)
		{
			if(head.next==null)// if ll has only one node ie head node
				System.out.println("Value is:-"+head.data);
			else
			{
				node tmp=head;
				for(int i = 0;i < size;i++)// traverse till last node
				{
					System.out.println("Value is :-"+tmp.data);
					tmp=tmp.next;
				}
			}
		}
		else
			System.out.println("Linked list does not Exists.");
	}
	
	void search(int value)//........................................SEARCHING
	{
		if (head!=null)
		{
			node tmp=head;
			int index=1;
			for(index=1;index<=size;index++)// traverse ll to find value
			{
				if(value==tmp.data)
				{	System.out.println("Entered value found in node no:-"+index);
					break;
				}
				else
					tmp=tmp.next;	
			}
			if(index>size)
				System.out.println("Not found");
		}
		else 
			System.out.println("Linked list does not exist.");
	}
	void delete_node(int location)//................................DELETE NODE 
	{
		if(head==null)//..........if ll does not exist error massage.
		{
				System.out.println("Linked list doesnot exist!!!");
		}
		else if(location==1)//......delete first node or head node.
		{
			head=head.next;//......head pointing to next node.
			size--;
			if(size==0)//............set tail to null if last node is deleted.
				tail=null;
			System.out.println("Deleted first node");
		}
		else if(location>=size)//.delete last node
		{
			
			node tmp=head;
			for(int index = 1; index < size - 1; index ++)//...traverse to second last node of ll.
				tmp=tmp.next;
			
			tmp.next=null;//second last node pointing to null
			tail=tmp;//....make it tail node
			size--;
			System.out.println("Deleted last node");
		}
		else//................delete from middle of the linked list.
		{
			
			node tmp=head;
			for (int index=1;index<location-1;index++)//..traverse to previous node of location node.
				tmp=tmp.next;
			tmp.next=tmp.next.next;//...prevoius node pointing to 2nd next node.
			size--;
			System.out.println("Deleted node of number:-"+location);
		}
		
	}
	void delete_ll()//..............................................DELETE LINKED LIST
	{
		head=null;
		tail=null;// reseting head and tail node
		System.out.println("Linked list deleted successufully");
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		single_LL s=new single_LL();
		int operation;
		int value;
		int location;
		do{
			System.out.println("");
			System.out.println("Enter the operation:-");
			System.out.println("1:create new ll 2:insert_node 3:Traversal 4:Search 5:delete_node  6:deleteLL 7:default 0:exit Linked List");
			operation=scan.nextInt();
			
			if(operation == 1)//create new operation.
			{
				System.out.println("Enter node data:-");
				value=scan.nextInt();
				s.create_new_ll(value);
			}
			else if(operation==2) //insert operation. 
			{	
				System.out.println("Enter a number to push:-");
				value=scan.nextInt();
				System.out.println("Enter the node number:-");
				location=scan.nextInt();
				s.insert(value,location);
			}
			else if(operation==3)//traversal.
			{
				s.show();
			}
			
			else if(operation==4)//search.
			{	
				System.out.println("Enter the node number:-");
				value=scan.nextInt();
				s.search(value);
			}
			else if(operation==5)//delete node.
			{
				System.out.println("Enter the node number:-");
				location=scan.nextInt();
				s.delete_node(location);
			}
			
			else if(operation==6)//delete linked list.
			{
				s.delete_ll();
			}
			else if(operation==7)//insert default values.
			{
				s.create_new_ll(1);
				s.insert(2,2);
				s.insert(3,3);
				s.insert(4,4);
				s.insert(5,5);
			}
		}while(operation!=0);
		System.out.println("Thank you :-)");
	}// end of main method.
}//end of class.