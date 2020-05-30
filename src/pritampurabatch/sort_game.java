package pritampurabatch;
import java.util.*;
public class sort_game {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[n];
		String s[]=new String[n]; 
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
					String t=s[j];
					s[j]=s[j+1];
					s[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
				     if(s[i].compareTo(s[j])>0)
				     {
					   String t=s[i];
					     s[i]=s[j];
					     s[j]=t;
				     }
				}
			}
		}
   for(int i=0;i<n;i++)
   {
	   if(a[i]>=x)
		   System.out.println(s[i]+" "+a[i]);
   }
	}

}
/*
 79
4
Eve 78
Bob 99
Suzy 86
Alice 100
 */
