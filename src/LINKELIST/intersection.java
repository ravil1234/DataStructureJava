package LINKELIST;
import java.util.Scanner;
public class intersection {
	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return tail.data;
	}

	public void addLast(int item) {
		// create a new node
		Node nn = new Node();

		nn.data = item;
		nn.next = null;

		// update summary
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else

		{
			this.tail.next = nn;
			this.tail = nn;

			size++;
		}

	}

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else {
			nn.next = this.head;
			this.head = nn;
			size++;
		}

	}

	public int removeFirst() throws Exception {
		Node fn = this.head;

		if (this.size == 0)
			throw new Exception("linked list is empty");

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			size = 0;
		} else {
			Node np1 = this.head.next;
			this.head = np1;
			size--;
		}

		return fn.data;
	}

	
	public void display() {

		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}
	public int intersection1(intersection other)
	{
		Node temp1=head;
		int t=-1;
		while(temp1!=null)
		{
			int c=0;
			Node otemp=other.head;
			while(otemp!=null)
			{
			if(temp1.data==otemp.data)
			{
				c=1;
				t=temp1.data;
				break;
			}
			otemp=otemp.next;
		}
		if(c==1)
		 break;	
		temp1=temp1.next;
		}		
		return t;
	}
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		
			    intersection list1 = new intersection();
			    int n1 = scn.nextInt();
			 
			    for (int j = 0; j < n1; j++) {
				    int item = scn.nextInt();
				    list1.addLast(item);
			}

			    intersection list2 = new intersection();
			    int n2 = scn.nextInt();
			    for (int j = 0; j < n2; j++) {
				    int item = scn.nextInt();
				    list2.addLast(item);
			}
			   System.out.print(list1.intersection1(list2));	
	}

}
