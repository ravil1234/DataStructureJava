package backtracking;
import java.util.*;
public class knight_move {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean a[][]=new boolean[n][n];
		knight(a,0,0,0,"");
	}
	public static void knight(boolean a[][],int row,int col,int k,String s)
	{
		if(k==a.length)
		{
			System.out.print(s+" ");
			return;
		}
		if(col==a.length)
		{
			row=row+1;
			col=0;
		}
		if(row==a.length)
		{
			return;
		}
		
			if(issafe(a,row,col))
			{
				a[row][col]=true;
				knight(a,row,col+1,k+1,s+"{"+(row)+"-"+(col)+"} ");
				a[row][col]=false;
			}
			knight(a,row,col+1,k,s);
		
	}
public static boolean issafe(boolean a[][],int i,int j)
{
	
 if(i+2<a.length&&j+1<a[i].length&&a[i+2][j+1])
 {
	 return false;
 }
 else if(i+2<a.length&&j-1>0&&a[i+2][j-1])
 {
	 return false;
 }
 else if(j+2<a[i].length&&i+1<a.length&&a[i+1][j+2])
 {
	 return false;
 }
 else if(j+2<a[i].length&&i-1>=0&&a[i-1][j+2])
 {
	 return false;
 }
 else if(i-2>=0&&j+1<a[i].length&&a[i-2][j+1])
 {
	 return false;
 }
 else if(i-2>=0&&j-1>=0&&a[i-2][j-1])
 {
	 return false;
 }
 else if(j-2>=0&&i+1<a.length&&a[i+1][j-2])
 {
	 return false;
 }
 else if(j-2>=0&&i-1>=0&&a[i-1][j-2])
 {
	 return false;
 }
 return true;
}
}
