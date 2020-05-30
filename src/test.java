class test
{
	public static void main(String args[])
	{
		c a=new c();
	    a.show();
	    a.input();
	    a.bye();
	    a.msg();
	    a.km();
	    System.out.println(A0.cube(6));
	}
}
class B implements A0
{
	public void show()
	{
		System.out.println("hello a");
	}
	public void input()
	{
	  int x=5;
	  System.out.println(x);
	}
	
}
class c extends B
{
	public void bye()
	{
		System.out.println("all of them done");
	}
}