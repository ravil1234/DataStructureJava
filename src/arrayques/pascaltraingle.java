package arrayques;
import java.util.Scanner;
public class pascaltraingle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int n=sc.nextInt(); 
		int sp=n-1;
		int c=0;
		for(int i=1;i<=n;i++)
		{
			c=1;
		for(int j=1;j<=i;j++)
		{
			System.out.print(c+"	");
			c=c*(i-j)/j;
		}
			System.out.println();
			sp--;
		}
	}

}
