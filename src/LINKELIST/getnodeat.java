package LINKELIST;
public class getnodeat {
	private class node
	{
		 int data;
		 node next;
	}
    private int size=0;
    private node head=null;
    private node tail=null;
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
