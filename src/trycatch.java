
public class trycatch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=2)
		{
			int a[]=new int[10];
		try
		{
			
			a[6]=10/0;
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index exception");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic  exception");
			try
			{
			System.out.println(a[19]);
			}
			catch(ArrayIndexOutOfBoundsException g)
			{
				System.out.println("array index exception");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("exception class!");
		}
		finally
		{
			System.out.println("it is alwYS EXECTUTED");
		}
		i++;
		}
	}

}
