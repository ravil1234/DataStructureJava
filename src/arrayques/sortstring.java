package arrayques;
import java.util.*;
public class sortstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a[]=new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		String temp;
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				count=0;
				int max;
				if(a[i].length()>a[j].length())
					max=a[j].length();
				else
				max=a[i].length();
				for(int k=0;k<max;k++)
				{
					char ch1=a[i].charAt(k);
					char ch2=a[j].charAt(k);
					if(ch1>ch2)
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						break;
					}
					else if(ch1==ch2)
					{
						count++;
						if(count==max&&a[i].length()==max)
						{
					    	    temp=a[i];
								a[i]=a[j];
								a[j]=temp;
								break;  
						}
					}
					else
						break;
					
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
           
	}

}
