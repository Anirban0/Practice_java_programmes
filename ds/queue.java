//Author @anirban
//linear queue with shifting values
package ds;
import java.util.*;
public class queue
{
	
	int beg;
	int end;
	int[] queue_array;
	
	public queue(int size)
	{
		 this.queue_array=new int[size];
		 this.beg=-1;
		 this.end=-1;
		 System.out.println("Successfully created an empty queue of Size: "+size);
	}
	
	void enQueue(int value)
	{
		if(beg==queue_array.length-1)
		{
			System.out.println("queue is full!!");
		}
		else
		{
			if(end==-1)
				end++;
			beg++;
			queue_array[beg]=value;
			System.out.println("enQueueed successfully.");
		}
			
	}
	void deQueue()
	{
		if(end==-1)
			System.out.println("Queue is empty!!!");
		
		else
		{
			System.out.println("deQueued element:-"+queue_array[end]);
			for(int i=1;i<=beg;i++)
			{
				queue_array[i-1]=queue_array[i]; //shifting each element to previous index
			}
			beg--;
			if(beg==-1)
				end=-1;//reset queue.
		}
		
	}
	void peek()
	{
		if(end==-1)
			System.out.println("Queue is empty!!!");
		else
			System.out.println("End element:-"+queue_array[end]);
	}
	void isEmpty()
	{
		if(end==-1)
			System.out.println("Queue is empty!!!");
		else
			System.out.println("Queue is not empty.");
	}
	void isFull()
	{
		if(beg==queue_array.length-1)
			System.out.println("queue is full!!");
		else
			System.out.println("Queue is not full.");
	}
	void delete(int size)
	{
		System.out.println("Queue is successfully deleted.");
		queue_array=null;
		this.queue_array=new int[size];
	}
	
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		int size;
		int operation;
		int v;
		System.out.println("Enter the size of the queue:-");
		size =scan.nextInt();
		queue q =new queue(size);
		
		do{
			System.out.println("");
			System.out.println("Enter the operation");
			System.out.println("1:enQueue 2:deQueue 3:peek 4:isEmpty 5:isFull 6:delete 0:exit queue operation");
			
			operation=scan.nextInt();
			
			if(operation==1)
			{
				System.out.println("Enter the value:-");
				v=scan.nextInt();
				q.enQueue(v);
			}
			
			else if(operation==2)
				q.deQueue();
			else if(operation==3)
				q.peek();
			else if(operation==4)
				q.isEmpty();
			else if(operation==5)
				q.isFull();
			else if(operation==6)
				q.delete(size);
		}
		while(operation!=0);
		System.out.println("Thank you:-)");
	}
}