package aug_PRACTICE;
import java.util.*;

class linklist
{
	public static void main(String[] args) throws Exception {
		
	String str="7012030423032";
	int[] arr=new int[str.length()];
	for(int i=0;i<str.length();i++)
	{
		arr[i]=str.charAt(i)-'0';
	}
	int limit=4;
	int result=FIFO(arr, limit);
	System.out.println(result);

	
}
	public static int FIFO(int[] arr,int limit) throws Exception
	{
		linklist q=new linklist(null,null,limit);
		int count=0;
		boolean c=false;
		for(int i=0;i<arr.length;i++)
		{
			if(limit>q.size())
			{
				 c=check(q,arr[i],q.size());
				if(c==false)
				{
					q.addLast(arr[i]);
					count++;
				}
				
			}
			else
			{
				c=check(q,arr[i],q.size());
				if(c==false)
				{
					
					q.removeFirst();
					q.addLast(arr[i]);
					count++;
				}
			}
		}
		return count;
	}
	public static boolean check(linklist q,int number,int n) throws Exception
	{
		int[] arr=new int[n];
		int i=0;
		boolean check=false;
		System.out.println(q.size()+" hello");
		while(q.size()>1)
		{
			//System.out.println(arr[i]);
			System.out.println(q.size());
			q.removeFirst();	
			i++;
			}
		for(int j=n-1;j>=0;j--)
		{
			q.addLast(arr[j]);
		}
		for(int val: arr)
		{
			if(val==number)
				return true;
		}
			return false;
		
	}
	private class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	private Node head;
	private Node tail;
	private int size;

	public linklist() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public linklist(Node head, Node tail, int size) {
		this.head = head;
		this.tail = tail;
		this.size = size;
	}
	public int size() {
		return this.size;
	}

	
	public boolean isEmpty() {
		return this.size() == 0;
	}
	public void addLast(int data) {
		Node node = new Node(data, null);

		if (this.size() == 0) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}

		this.size++;
	}
	public int removeFirst() throws Exception {
//		if (this.isEmpty()|| this.size()<=0) {
//			throw new Exception("List is empty");
//		}
	
		int retVal = this.head.data;
		if (this.size() == 1) 
		{
			this.head = null;
			this.tail = null;
		} 
		else 
		{
			this.head = this.head.next;
		}

		this.size--;
		return retVal;
	}
}