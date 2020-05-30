package STACKQUEUE;
public class QUSTACKDEQE {
	private dynamicstack primary;
	private dynamicstack secondary;
	public QUSTACKDEQE() throws Exception
	{
         primary=new dynamicstack();
         secondary=new dynamicstack();
	}
	public int size()
	{
		return primary.size();
	}
	public boolean isempty()
	{
		return primary.isempty();
	}
	public void push(int value) throws Exception
	{
		while(primary.size()!=0)
		{
			secondary.push(primary.pop());
		}
		primary.push(value);
		while(!secondary.isempty())
		{
			primary.push(secondary.pop());
		}
	}
	public int pop() throws Exception
	{
		int rv=primary.pop();
		return rv;
	}
	public void display() throws Exception
	{
		primary.display();
	}
	

}
