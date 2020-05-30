package recursionques;
import java.util.*;
public class one_dqueen {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int tq=sc.nextInt();
	 boolean b[]=new boolean[n];
	 //queen(b,tq,0,"");
	 queencombination(b,tq,0,"",-1);

	}
public static void queen(boolean b[],int tq,int tqsf,String ans)
{
	if(tqsf==tq)
	{
		count++;
		System.out.println(count+"."+ans);
		return;
	}
	for(int i=0;i<b.length;i++)
	{
		
			b[i]=true;
			queen(b,tq,tqsf+1,ans+"q"+tqsf+"b"+i+" ");
			b[i]=false;
	}
}
public static void queencombination(boolean b[],int tq,int tqsf,String ans,int lastbox)
{
	if(tqsf==tq)
	{
		count++;
		System.out.println(count+"."+ans);
		return;
	}
	for(int i=lastbox+1;i<b.length;i++)
	{
		if(b[i]==false)
		{
			b[i]=true;
			queencombination(b,tq,tqsf+1,ans+"q"+tqsf+"b"+i+" ",i);
			b[i]=false;
		}
	}
}
}
