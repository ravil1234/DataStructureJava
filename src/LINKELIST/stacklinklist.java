package LINKELIST;

public class stacklinklist {

 private ADDLAST stack;
 public stacklinklist()
 {
       this.stack=new ADDLAST();
 }
  public int size()
  {
	  return this.stack.size();
  }
  public boolean isempty()
  {
	  return this.stack.isempty();
  }
  public void push(int item)
  {
	  this.stack.addbegin(item);
  }
  public int  pop() throws Exception
  {
	 return this.stack.removefirst();
  }
  public int  top() throws Exception
  {
	return this.stack.getfirst();
  }
  public void display()
  {
	 this.stack.display();  
  }
	public static void main(String[] args) throws Exception {
		
		stacklinklist s=new stacklinklist();
		for(int i=1;i<=5;i++)
		{
			s.push(i);
		}
		s.display();
		//System.out.println(s.pop());
		for(int i=1;i<=5;i++)
		{
			System.out.println(s.top());
			s.pop();
			s.display();
		}
	   }

}
