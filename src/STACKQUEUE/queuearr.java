package STACKQUEUE;
public class queuearr {
	protected  int data[];
	protected int front;
	protected int size;
	public static final int default_capacity=10;
	public queuearr() throws Exception
	{
	 this(default_capacity);	
	}
	public queuearr(int capacity) throws Exception
	{
		if(capacity<1)
		{
			throw new Exception("invalid capacity");
		}
		this.data=new int[capacity];
		this.front=0;
		this.size=0;
	}
	public int size()
	{
		return this.size;
	}
	public boolean isempty()
	{
		return this.size()==0;
	}
	public void push(int value) throws Exception
	{
		if(this.size()==this.data.length)
		{
			throw new Exception("queue is full");
		}
		int a=(this.front+this.size)%this.data.length;
		this.data[a]=value;
		this.size++;
	}
	public int pop() throws Exception
	{
		if(this.size==0)
		{
			throw new Exception("queue is empty");
		}
		int rv=this.data[this.front];
		this.data[this.front]=0;
		this.front=(this.front+1)%this.data.length;
		this.size--;
		return rv;	
	}
	public int front()
	{
		return this.data[this.front];
	}
	public void display()
	{
		for(int i=0;i<this.size;i++)
		{
			int a=(this.front+i)%this.data.length;
			System.out.print(this.data[a]+"->");
		}
		System.out.println("end");
	}
}
