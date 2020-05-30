package Hashmap;
public class genericlinklist {
	private class Node
	{
		int data;
		Node  next;
	}
    private int size=0;
    private Node head=null;
    private Node tail=null;
	public int size()
	{
		return this.size;
	}
	public boolean isempty()
	{
		return this.size==0;
	}
	public void addbegin(int item)
	{
		Node n=new Node();
		if(head==null)
		{
		   	n.data=item;
		   	n.next=null;
		   	head=n;
		   	tail=n;  	
		}
		else
		{
			n.data=item;
			n.next=head;
			head=n;
		}
	  this.size++;
	}
   public void addLast(int item)
   {
	   Node n=new Node();
	   if(head==null)
	   {
		   n.data=item;
		   n.next=null;
		   head=n;
		   tail=n;
	   }
	   else
	   {
		   n.data=item;
		   n.next=null;
		   tail.next=n;
	   }
	   this.size++;
   }
   /* */
   public Node  getNode(int index) throws Exception
   {
	   if(size==0)
	   {
		  throw new Exception("linklist is empty");
	   }
	   if(index<0||index>=size)
	   {
		   throw new Exception("invalid index");
	   }
	   Node temp=this.head;
	   for(int i=0;i<index;i++)
	   {
		   temp=temp.next;
	   }
	   return temp;
   }
   public int getvalue(int index) throws Exception
   {
	   Node temp =getNode(index);
	   return temp.data;
   }
   public void insertindex(int item,int position) throws Exception
   {
	   Node n=new Node();
	   Node temp=getNode(position-2);
	   n.data=item;
	   n.next=temp.next;
	   temp.next=n;
	   size++;
   }
   public int  removeAtbegin() throws Exception
   {
	   if(size==0)
	   {
		   throw new Exception("empty ll");
	   }
	   Node temp=this.head;
	   head=head.next;
	   size--;
	  return temp.data;
   }
   public int removeatend() throws Exception
   {
	   if(size==0)
		   throw new Exception("empty ll");
	   Node temp=this.head;
	   while(temp.next.next!=null)
	   {
		   temp=temp.next;
	   }
	   int  t=temp.next.data;
	   temp.next=null;
	   tail=temp;
	  return t;
   }
   
   public void display()
   {
    Node temp=this.head;
    while(temp!=null)
    {
    	System.out.print(temp.data+" ");
    	temp=temp.next;
    }
    System.out.println(size);
   }
   public static void main(String args[]) throws Exception
   {
	   genericlinklist l=new genericlinklist();
	   l.addbegin(20);
	   l.addbegin(30);
	   l.addbegin(40);
	   l.addLast(89);
	   l.display();
	   System.out.println(l.removeAtbegin());
	   System.out.println(l.removeatend());
	   l.display();
	   
   }
}
