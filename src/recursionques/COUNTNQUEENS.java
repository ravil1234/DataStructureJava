package recursionques;
import java.util.*;
public class COUNTNQUEENS {
	static int c=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean b[][]=new boolean[4][4];
		System.out.println(nqueen(b,0));
		printqueen(b,0,"");
	}
	public static int nqueen(boolean b[][],int row)
	{
		if(row==b.length)
		{
		   return 1;
		}
		int count=0;
		for(int col=0;col<b[row].length;col++)
		{
			if(issafe(b,row,col))
			{
				b[row][col]=true;
				count+=nqueen(b,row+1);
				b[row][col]=false;
			}
		}
		return count;
	 }
	public static void printqueen(boolean b[][],int row,String result)
	{
		if(row==b.length)
		{
			c++;
			System.out.print(result+" ");
		   return;
		}
		for(int col=0;col<b[row].length;col++)
		{
			if(issafe(b,row,col))
			{
				b[row][col]=true;
				printqueen(b,row+1,result+"{"+(row+1)+"-"+(col+1)+"} ");
				b[row][col]=false;
			}
		}
	}
	private static boolean issafe(boolean b[][],int row,int col)
	{
		for(int i=row;i>=0;i--)
		{
			if(b[i][col])
			{
				return false;
			}
		}
		for(int i=row,j=col;i>=0&&j>=0;i--,j--)
		{
			if(b[i][j])
			{
				return false;
			}
		}
		for(int i=row,j=col;i>=0&&j<b.length;i--,j++)
		{
			if(b[i][j])
			{
				return false;
			}
		}
		return true;
	}
}
