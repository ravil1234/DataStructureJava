package LINKELIST;
public class ADDLAST {
/* 0.new node created*/
 private class node
 {
	 int data;
	 node next;
 }
 private int size=0;
 private node head=null;
 private node tail=null;
 
 public int size()
 {
	 return size;
 }
 public boolean isempty()
 {
	 return size()==0;
 }
 /*1. insertion at beginning*/
 
 public void addbegin(int item)
 {
	 node nn=new node();
	 if(size==0)
	 {
		 nn.data=item;
		 head=nn;
		 tail=nn;
		 size++;
	 }
	 else
	 {
		 nn.data=item;
		 nn.next=head;
		 head=nn;
		 size++;
	 }
 }
 
 /*2. insertion at end */
 
public  void addlast(int item)
 {
	 node nn=new node();
	 
	 if(size==0)
	 {
		 nn.data=item;
		 head=nn;
		 tail=nn;
		 size++;
	 }
	 else
	 {
		 nn.data=item;
		 tail.next=nn;
		 tail=nn; 
		 size++;
	 }
 }

/*3. GETTING NODE AT REQUIRED INDEX*/

private node getnode(int index) throws Exception
{
	node temp=head;
	if(size==0)
	{
		throw new Exception("linkedlist empty");
	}
	if(index<0||index>size)
	{
		throw new Exception("invalid index number");
	}
	for(int i=1;i<index;i++)
	{
		temp=temp.next;
	}
	return temp;
		
}
public int getatvalue(int index) throws Exception
{
	node nn1=getnode(index);
	return nn1.data;
}

/* 4.getting first node of LL*/

public int getfirst() throws Exception
{
	 if(size==0)
	 {
		 throw new Exception("linkedlist empty");
	 }
	return head.data;
}

/* 5.getting LAST node of LL*/

public int getlast() throws Exception
{
	if(size==0)
	{
		throw new Exception("linkedlist empty");
	}
	return tail.data;
}

/*6. remove first element of linked list*/
public int removefirst()throws Exception
{
	node nn=head;
	if(size==0)
	{
		throw new Exception("link list is empty");
	}
	int rv=head.data;
	head=nn.next;
	this.size--;
	return rv;
}
/*7. remove last element of linked list*/
public void removelast()throws Exception
{
	node nn=head;
	if(size==0)
	{
		throw new Exception("link list is empty");
	}
	for(int i=0;i<size-2;i++)
	{
		nn=nn.next;
	}
	nn.next=null;
	this.size--;
}
/*8. REMOVE ITEM AT GIVEN POSITION*/

public void  removeat(int p) throws Exception
{
	int temp= getatvalue(p);
	System.out.println(temp);
	node nn=head;
	for(int i=1;i<p-1;i++)
	{
		nn=nn.next;
	}
	nn.next=nn.next.next;
	this.size--;
}
/*9. REVERSE THE DATA IN LL*/

public void reversedata() throws Exception
{
	int left=1;
	int right=size;
	while(left<right)
	{
		node r=getnode(left);
		node r1=getnode(right);
		int temp=r.data;
		r.data=r1.data;
		r1.data=temp;
		left++;
		right--;
	}
}
/* 10.REVERSE THE POINTERS IN LL*/
public void reverseptr()
{
	node prev=head;
	node curr=prev.next;
	while(curr!=null)
	{
		node ahead=curr.next;
		curr.next=prev;
		prev=curr;
		curr=ahead;
	}
	//swap head and tail.
	node t=head;
	head=tail;
	tail=t;
	tail.next=null;
}
/*11. find middle node without knowing size*/

public int midnode()
{
	node temp1=head;
	node temp2=head;
	while(temp2.next!=null)
	{
		if(temp2.next.next==null)
		{
			break;
		}
		temp1=temp1.next;
		temp2=temp2.next.next;
		
	}
	/*  or we can write
        	while(temp2.next!=null&& temp2.next.next!=null)
        	{
        	temp1=temp1.next;
        	temp2=temp2.next.next;
        	} 
	 */
	return temp1.data;
}
/*12. DISPALY THE LINKED LIST*/

  public void display()
 {
	 node temp=head;
	 while(temp!=null)
	 {
		 System.out.print(temp.data+"->");
		 temp=temp.next;
	 }
	 System.out.println("end");
	 }
 }
 
