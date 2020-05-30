package backtracking;
import java.util.*;
public class chess_board2 {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 
		 boolean p[]=seive(n*n);
		 char ch[]=new char[p.length];
		 int k=0;
		 for(int i=0;i<p.length;i++)
		 {
			 if(p[i]==true)
			 {
				 if(k%2==0)
				 {
					 ch[i]='M';
					 
				 }
				 else
				 {
					 ch[i]='P';
				 }
				 k++;
			 }
		 }
       
       chess(n,ch,0,0,"");
       System.out.println();
       System.out.println(count);
	}
	public static void chess(int n,char ch[],int i,int j,String s)
	  {
		if(i==n-1&&j==n-1)
		{
			count++;
			System.out.print(s+"{"+i+"-"+j+"} ");
			return;
		}
		if(i>=n||j>=n)
		{
			return;
		}

		int val = i*n + j+1;

		if (ch[val] =='M') {
			return ;
		} 
		else if(ch[val]=='P')
		{
	chess(n,ch, n-1, n-1,  s+ "{" + i + "-" + j + "}P");
		}
			  chess(n,ch,i+2,j+1,s+"{"+i+"-"+j+"}K");
			  chess(n,ch,i+1,j+2,s+"{"+i+"-"+j+"}K");
		  if(i==0||i==n-1||j==0||j==n-1)
		  {
			  int l=1;
			   while(l+j<n)
			   {
			  chess(n,ch,i,j+l,s+"{"+i+"-"+j+"}R");
			    l++;
			   }
		  }
		  if(i==0||i==n-1||j==0||j==n-1)
		  {
			  int l=1;
			   while(l+i<n)
			   {
			  chess(n,ch,i+l,j,s+"{"+i+"-"+j+"}R");
			  l++;
			   }
		  }
		  if(i==j||(i+j)==n-1)
		  {
			  int l=1;
			  while(l+i<n&&l+j<n)
			  {
			  chess(n,ch,i+l,j+l,s+"{"+i+"-"+j+"}B");
			  l++;
			  }
		  }
		
	  }
public static boolean[] seive(int n)
{
	boolean b[]=new boolean[n+1];
	Arrays.fill(b, true);
	b[0]=false;
	b[1]=false;
	for(int i=2;i*i<=n;i++)
	{
		if(b[i])
		{
		for(int j=i*2;j<=n;j=j+i)
		{
			b[j]=false;
		}
		}
	}
	return b;
  }
}
