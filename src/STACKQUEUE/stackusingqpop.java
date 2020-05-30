package STACKQUEUE;
public class stackusingqpop {
private dynamicq primary;
private dynamicq secondary;
public stackusingqpop() throws Exception
{
	primary=new dynamicq();
	secondary=new dynamicq();
	
}
public int size()
{
	return primary.size();
}
public boolean isempty()
{
	return primary.isempty();
}

public void push(int value)throws Exception
{
	while(!primary.isempty())
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
public int top()
{
	return primary.front();
}
public void display()
{
	primary.display();
}
}
