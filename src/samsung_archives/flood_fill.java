package samsung_archives;
import java.util.*;
public class flood_fill 
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
  int x=0,y=0;
  while(t!=0)
  {
	  int n=sc.nextInt();
	  int a[][]=new int[n][n];
	  for(int i=0;i<n;i++)
	  {
		  for(int j=0;j<n;j++)
		  {
			  a[i][j]=sc.nextInt();
			  if(a[i][j]==1)
			  {
				  x=i;
				  y=j;
			  }
		  }
	  }
	  int dp[][]=new int[n][n];
	  if(path(x,y,a,n,dp))
		  System.out.println(1);
	  else
		  System.out.println(0);
	  t--;
  }
}
public static boolean path(int i,int j,int a[][],int n,int dp[][])
{
	if(i>=n||j>=n||i<0||j<0)
	  return false;	  
	dp[i][j]=1;	
	if(i+1<n&&a[i+1][j]==2)
		return true;
	if(j+1<n&&a[i][j+1]==2)
		return true;
	if(i-1>=0&&a[i-1][j]==2)
		return true;
	if(j-1>=0&&a[i][j-1]==2)
		return true;		
	if(i+1<n && (a[i+1][j]==3)&&(dp[i+1][j]!=1) &&path(i+1,j,a,n,dp))
	  return true;
	if(j+1<n&&(a[i][j+1]==3) && (dp[i][j+1]!=1) &&path(i,j+1,a,n,dp))
	  return true;
	if(i-1>=0&&(a[i-1][j]==3) && (dp[i-1][j]!=1) &&path(i-1,j,a,n,dp))
	   return true;
	if(j-1>=0&&(a[i][j-1]==3) && (dp[i][j-1]!=1) && path(i,j-1,a,n,dp))
	 return true;

	return false;
  }
}
