package arrayques;
import java.util.*;
public class quadratic_eqn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=(b*b)-(4*a*c);
		if(d>0)
		{
			System.out.println("Real and Distinct");
			int r1=(-b+((int)Math.sqrt(d)))/(2*a);
			int r2=(-b-((int)Math.sqrt(d)))/(2*a);
			if(r1>r2)
			{
				System.out.print(r2+" "+r1);
			}
			else
			{
				System.out.print(r1+" "+r2);
			}
		}
		if(d==0)
		{
			System.out.println("Real and Equal");
			int r=-b/(2*a);
			System.out.println(r+" "+r);
		}
		if(d<0)
		{
			System.out.println("Imaginary");
		}
        
	}

}
