package recursionques;
import java.util.*;
public class coinchange {
	static int count=0,count1=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int amt=sc.nextInt();
		int dem[]= {2,1,3};
		coincombi(dem,amt,"",0);
		System.out.println();
		System.out.println(count1);
		/*
		coinpermu(dem,amt,"");
		System.out.println();
		System.out.println(count);
		*/
	}
public static void coincombi(int dem[],int amt,String ans,int lastdenm)
{
	if(amt==0)
	{
		count1++;
		System.out.print(ans+" ");
		return;
	}
	for(int i=lastdenm;i<dem.length;i++)
	{
		if(amt>=dem[i])
		{
			coincombi(dem,amt-dem[i],ans+dem[i],i);
		}
	}
}
public static void coinpermu(int dem[],int amt,String ans)
{
	if(amt==0)
	{
		count++;
		System.out.print(ans+" ");
		return;
	}
	for(int i=0;i<dem.length;i++)
	{
		if(amt>=dem[i])
		{
			coinpermu(dem,amt-dem[i],ans+dem[i]);
		}
	}
}
}
