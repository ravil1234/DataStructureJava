package recursionques;
import java.util.*;
public class pattern {
	public static void main(String[] args) {
		int n,row=0,col=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter n no.of pattern");
		n=sc.nextInt();
		patter(n,row,col);
	}
public static void patter(int n,int row,int col)
{
	if(row==n)
	{
		return ;
	}
	if(col<=row)
	{
	System.out.print("*");
	patter(n,row,col+1);
	}
	else
	{
		System.out.println();
		patter(n,row+1,0);	
	}
  }
}
