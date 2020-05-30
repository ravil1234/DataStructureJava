
public class throwexp {

	public static void vali(int a)
	{
		if(a<18)
		{
			throw new ArithmeticException("not a valid");
		}
		else
		{
			System.out.println("welcome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vali(13);
		System.out.println("hello");
       
	}

}
