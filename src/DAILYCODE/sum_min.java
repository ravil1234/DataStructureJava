package DAILYCODE;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class sum_min {
	public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			while(t!=0)
			{
				int k=sc.nextInt();
			String str=sc.next();
			int a[]=new int[4];
			int c;
			int j=0;
		for(char ch='a';ch<='z';ch++)
		{
		 c=0;
		for(int i=0;i<str.length();i++)
		{
			char ch2=str.charAt(i);
			if(ch==ch2)
				c++;
		}
		if(c>0)
		{
			a[j]=c;
		     j++;
		 }
      }
	   Arrays.sort(a);
			for(int i=a.length-1;i>=0;i--)
			{
		      	while(k!=0)
		      	{
		      		if(a[i]<a[i-1])
		      		{
		      			break;
		      		}
		      		else
		      		{
		      			a[i]=a[i]-1;
		      			k--;
		      		}
		      	}
		      	if(k==0)
		      		break;
			}
		int sum=0;
		for(int i=0;i<j;i++)
		{
			sum=sum+(int)Math.pow(a[i], 2);
		}
		System.out.println(sum);
		t--;
    }
			
 }
	/*
	public static void max(int a[])
	{
		int max=0,j=0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i]&&a[i]!=0)
			{
				max=a[i];
				 j=i;
			}
		}
		a[j]=max-1;
	}
	*/
}
