package pritampurabatch;
import java.util.Scanner;
public class patternrhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sp=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
			  System.out.print("	");
			}
			int g=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(g+"	");
				g++;
			}
			if(i!=1)
			{
			for(int k=g-2;k>=i;k--)
			{
				System.out.print(k+"	");
				
			}
			}
			sp=sp-1;
			System.out.println();
		}
		sp=sp+2;
		for(int i=n-1;i>0;i--)
		{
			for(int j=1;j<=sp;j++)
			{
			  System.out.print("	");	
			}
			int g=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(g+"	");
				g++;
			}
			if(i!=1)
			{
			for(int k=g-2;k>=i;k--)
			{
				System.out.print(k+"	");
				
			}
			}
			sp=sp+1;
			System.out.println();
			
		}
		
	}

}
