//Author @anirban
//circular queue
package ds;
import java.util.*;
public class cir_queue
{
	
	int ins;
	int del;
	int[] queue_array;
	
	public cir_queue(int size)
	{
		 this.queue_array=new int[size];
		 this.ins=-1;
		 this.del=-1;
		 System.out.println("Successfully created an empty queue of Size: "+size);
	}
	
	
	
	void enQueue(int value)
	{
			if (isFull()==true)
				System.out.println("Queue is full!!!");
			else
                {
                            
                    if(ins==queue_array.length-1)
                        {
                                ins=0;
                                queue_array[ins]=value;
								System.out.println("enQueueed successfully.");
                        }
                    else
                        {
                                if(del==-1)
                                    del++;
                                ins++;
                                queue_array[ins]=value;
								System.out.println("enQueueed successfully.");
                        }
                }       		
        }
	void deQueue()
	{
            if(isEmpty()==true)
                System.out.println("Queue is empty!!!");
            else
            {
                System.out.println("deQueued element is:-"+queue_array[del]);
                if(del==queue_array.length-1)
				{
					if(del==ins)
					{
						del=-1;
						ins=-1;
					}   
					else
					{
						del=0;
					}
				}
				else if(del==ins)
					{
						del=-1;
						ins=-1;
					}
                else
                    del++;
            }
		
		
	}
	void peek()
	{
		if(del==-1)
			System.out.println("Queue is empty!!!");
		else
			System.out.println("End element is:-"+queue_array[del]);
	}
	
	boolean isEmpty()
	{
		if(del==-1)
            return true;
                
        else
            return false;
                
	}
	
	boolean isFull()
	{
            if(ins+1==del)
                return true;
            else if(del==0&&ins==queue_array.length-1)
                return true;
            else
                return false;
                
            
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
		cir_queue q =new cir_queue(size);
		
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
                        {   
                            if(q.isEmpty()==true)
                                System.out.println("Queue is empty");
                            else
                                System.out.println("Queue is not empty");
				
                        }
			else if(operation==5)
                        {	if(q.isFull()==true)
                                    System.out.println("Queue is full");
                                else
                                    System.out.println("Queue is not full");
            
                        
                        }
			else if(operation==6)
				q.delete(size);
		}
		while(operation!=0);
		System.out.println("Thank you:-)");
	}
}