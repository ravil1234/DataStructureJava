package DynamicProgramming;
import java.util.*;
public class BINARY_STRING {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(binarystring(n));
	}
public static int binarystring(int n)
{
	int zero[]=new int[n];
	int one[]=new int[n];
	zero[0]=1;
	one[0]=1;
	for(int i=1;i<n;i++)
	{
		zero[i]=zero[i-1]+one[i-1];
		one[i]=zero[i-1];
	}
	return zero[n-1]+one[n-1];
  }
}
