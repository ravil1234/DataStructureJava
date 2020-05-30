package STACKQUEUE;
public class reversestack {
	protected int data[];
	  protected  int top;
	public static  final int default_capacity=10;
	public reversestack() throws Exception
	{
		this(default_capacity);
	}
	public reversestack(int capacity) throws Exception
	{
			 if(capacity<1)
			 {
				 throw new Exception("invalid capacity");
			 }
			 this.data= new int[capacity];
			 this.top=-1;	 
	}
	public int size()
	{
		return this.top+1;
	}
	public boolean isempty()
	{
		return this.size()==0;
	}
	public void push(int value) throws Exception
	{
		if(this.size()==this.data.length)
		{
			throw new Exception("stack is full");
		}
		
		this.data[++this.top]=value;	
	}
	public int  pop() throws Exception
	{
		if(this.size()==0)
		{
			throw new Exception("stack is empty");
		}
		int p=this.data[this.top];
		this.data[this.top]=0;
		this.top--;
		return p;
	}
	public void display()
	{
		for(int i=this.top;i>=0;i--)
		{
			System.out.print(this.data[i]+"->");
		}
		System.out.println("end");
	}
}
