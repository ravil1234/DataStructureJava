package STACKQUEUE;
public class stackuqpush {
private dynamicq primary;
private dynamicq secondary;
public stackuqpush() throws Exception
{
	primary= new dynamicq();
	secondary=new dynamicq();
}
public int size()
{
	return primary.size;
}
public boolean isempty()
{
	return primary.isempty();
}
public void push(int value) throws Exception
{
   primary.push(value);
}
public int pop() throws Exception
{
	while(primary.size!=1)
	{
		secondary.push(primary.pop());
	}
	int rv=primary.pop();
	while(secondary.size()!=0)
	{
		primary.push(secondary.pop());
	}
	return rv;
}
public int peek() throws Exception
{
	while(primary.size!=1)
	{
		secondary.push(primary.pop());
	}
	int rv=primary.pop();
	secondary.push(rv);
	while(secondary.size!=0)
	{
		primary.push(secondary.pop());
	}
	return rv;
}
public void display() throws Exception
{
     reverseq(primary);
	primary.display();
    reverseq(primary);
}

public static void reverseq(dynamicq q) throws Exception
{
  if(q.isempty())
  {
	  return;
  }
  int item=q.pop();
  reverseq(q);
  q.push(item);
	
}

}
