package LINKELIST;
import java.util.*;
class mergedlinklist {

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

	public void  merged_sorted_list(mergedlinklist other) throws Exception
	{               
        mergedlinklist m=new mergedlinklist();
        Node temp1=other.head;
        Node temp=head;
        while(temp!=null&&temp1!=null)
        {
        	if(temp.data<temp1.data)
        	{
        		m.addLast(temp.data);
        		temp=temp.next;
        	}
        	else
        	{
        		m.addLast(temp1.data);
        		temp1=temp1.next;
        	}
        }
        if(temp==null)
        {
        	while(temp1!=null)
        	{
        		m.addLast(temp1.data);
        		temp1=temp1.next;
        	}
        }
        if(temp1==null)
        {
        	while(temp!=null)
        	{
        		m.addLast(temp.data);
        		temp=temp.next;
        	}
        }
        m.display();
        
	}

	public void display() {

		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		    int t = scn.nextInt();
		    
		    while(t > 0){
			    mergedlinklist list1 = new mergedlinklist();
			    int n1 = scn.nextInt();
			    for (int j = 0; j < n1; j++) {
				 int item = scn.nextInt();
				    list1.addLast(item);
			}

                mergedlinklist list2 = new mergedlinklist();
			    int n2 = scn.nextInt();
			 
			    for (int j = 0; j < n2; j++) {
				    int item = scn.nextInt();
				    list2.addLast(item);
			}
			   list1.merged_sorted_list(list2);

            t--;
            }
		
	}
}
