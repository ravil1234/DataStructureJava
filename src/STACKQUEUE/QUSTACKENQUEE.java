package STACKQUEUE;
public class QUSTACKENQUEE {
	private dynamicstack primary;
	private dynamicstack secondary;
	public QUSTACKENQUEE() throws Exception
	{
		primary=new dynamicstack();
		secondary=new dynamicstack();
	}
	public int size()
	{
	    return primary.size();	
	}

	public boolean  isempty()
	{
		return primary.isempty();
	}
	public void push(int value) throws Exception
	{
		primary.push(value);
	}
	public int  pop() throws Exception
	{
		while(primary.size()!=1)
		{
			secondary.push(primary.pop());
		}
		int rv=primary.pop();
		while(!secondary.isempty())
		{
			primary.push(secondary.pop());
		}
		return rv;
	}
	public void display() throws Exception
	{
		reverse(primary,secondary,0);
		primary.display();
		reverse(primary,secondary,0);
		
	}
public static void reverse(dynamicstack s,dynamicstack res,int index) throws Exception
{
   while(s.isempty())
   {
	   return;
   }
   int item=s.pop();
   reverse(s,res,index+1);
   res.push(item);
   if(index==0)
   {
   while(!res.isempty())
   {
	   s.push(res.pop());
   }
   }
}
}
