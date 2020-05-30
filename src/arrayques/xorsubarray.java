package arrayques;
import java.util.*;
public class xorsubarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n]; 
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int g=0;
		for(int i=0;i<n;i++)
		{
			if(i<n-1)
				g=i+1;
			for(int j=i+1;j<n;j++)
			{
				if(g==n-1)
				{
					break;
				}
				
				
			}
		}

	}

}
