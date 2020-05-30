package backtracking;
import java.util.*;
public class chessboard {
	static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean a[][] =new boolean[n][n];
		chess(a,0,0,"");
		System.out.println();
		System.out.println(count);
	}
  public static void chess(boolean a[][],int i,int j,String s)
  {
	if(i==a.length-1&&j==a.length-1)
	{
		count++;
		System.out.print(s+"{"+i+"-"+j+"} ");
		return;
	}
	if(i>=a.length||j>=a.length)
	{
		return;
	}
	 
		  chess(a,i+2,j+1,s+"{"+i+"-"+j+"}K");
		  chess(a,i+1,j+2,s+"{"+i+"-"+j+"}K");
	  if(i==0||i==a.length-1||j==0||j==a.length-1)
	  {
		  int l=1;
		   while(l+j<a.length)
		   {
		  chess(a,i,j+l,s+"{"+i+"-"+j+"}R");
		    l++;
		   }
	  }
	  if(i==0||i==a.length-1||j==0||j==a.length-1)
	  {
		  //a[i][j]=true;
		  int l=1;
		   while(l+i<a.length)
		   {
		  chess(a,i+l,j,s+"{"+i+"-"+j+"}R");
		  l++;
		   }
	  }
	  if(i==j||(i+j)==a.length-1)
	  {
		 // a[i][j]=true;
		  int l=1;
		  while(l+i<a.length&&l+j<a.length)
		  {
		  chess(a,i+l,j+l,s+"{"+i+"-"+j+"}B");
		  l++;
		  }
	  }
  }
}
//{0-0}K{2-1}R{2-2} {0-0}K{1-2}R{2-2} {0-0}R{0-1}K{2-2} {0-0}R{0-1}R{0-2}R{1-2}R{2-2} {0-0}R{0-1}R{0-2}R{2-2} {0-0}R{0-1}R{1-1}B{2-2} {0-0}R{0-1}R{2-1}R{2-2} {0-0}R{0-2}R{1-2}R{2-2} {0-0}R{0-2}R{2-2} {0-0}R{1-0}K{2-2} {0-0}R{1-0}R{1-1}B{2-2} {0-0}R{1-0}R{1-2}R{2-2} {0-0}R{1-0}R{2-0}R{2-1}R{2-2} {0-0}R{1-0}R{2-0}R{2-2} {0-0}R{2-0}R{2-1}R{2-2} {0-0}R{2-0}R{2-2} {0-0}B{1-1}B{2-2} {0-0}B{2-2}

