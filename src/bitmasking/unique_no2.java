package bitmasking;
import java.util.*;
public class unique_no2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int xor=a[0];
		for(int i=1;i<n;i++)
		{
			xor=xor^a[i];
		}
		int set_no=xor&(~(xor-1));
		int first=0;
		int second=0;
		for(int i=0;i<n;i++)
		{
			
			if((a[i]&set_no)>0)
			{
				first=first^a[i];
			}
			else
			{
				second =second^a[i];
			}
		}
		System.out.println(second+" "+first);

	}

}
