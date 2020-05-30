package LINKELIST;
public class queuelinklist {
	private class node
	{
	  int data;
	  node next;
	}
	private int size=0;
	private node front=null;
	private node tail=null;
	
	public int size()
	{
		return size;
	}
	public boolean isempty()
	{
		return size()==0;
	}
	public void enqueue(int item)
	{
		node n=new node();
		if(size==0)
		{
			n.data=item;
			front=n;
			tail=n;
			size++;
		}
		else
		{
			n.data=item;
			tail.next=n;
			tail=n;
			size++;
		}
	}
	public int dequeue() throws Exception
	{
		if(size()==0)
		{
			throw new Exception("queue empty");
		}
		node nn=front.next;
		int rv=front.data;
		front=nn;
		size--;
		return rv;
	}
	public int frontn()
	{
		return front.data;
	}
	public void display()
	{
		node temp=front;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println( "END");
	}
public static void main(String args[]) throws Exception
{
	queuelinklist q=new queuelinklist();
	for(int i=1;i<=5;i++)
	{
		q.enqueue(i);
	}
	q.display();
	System.out.println(q.dequeue());
	System.out.println(q.frontn());
	for(int i=1;i<=5;i++)
	{
		q.dequeue();
		q.display();
	}
}
}
