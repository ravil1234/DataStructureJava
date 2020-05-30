import java.io.IOException;
public class exceptionpropagation {

	void p() throws IOException
	{
		int m1=50/0;
		throw new IOException("ERROR OCCCURED");
	}
	void n() throws IOException
	{
		p();
	}
	void m()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println("caught the exception");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exceptionpropagation e=new exceptionpropagation();
		e.m();

	}

}
