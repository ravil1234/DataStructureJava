package backtracking;
import java.util.*;
public class rat_cheese {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		char a[][]=new char[n][m];
		int ans[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			String str=sc.next();
			for(int j=0;j<str.length();j++)
			{
				a[i][j]=str.charAt(j);
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				ans[i][j]=0;
			}
		}
     if(rat(a,n-1,m-1,0,0,ans))
     {
    	 for(int i=0;i<n;i++)
    	 {
    		 for(int j=0;j<m;j++)
    		 {
    			 System.out.print(ans[i][j]+" ");
    		 }
    		 System.out.println();
    	 }	 
     }
     else
    	 System.out.println("NO PATH FOUND");
    	 
	}
public static boolean rat(char a[][],int n,int m,int i,int j,int ans[][])
{ 
	if(j>m||i>n)
    {
   	 return false;
    }
	if(ans[i][j]==1) {
		return false;
	}
	if(a[i][j]=='X')
    {
   	 return false;
    }
     if(i==n&&j==m)
     {
    	 if(a[n][m]=='X')
    	 {
    		 return false;
    	 }
    	 else
    	 {
    	ans[n][m]=1; 
    	 return true;
    	 }
     }
     ans[i][j]=1;
     
     if(rat(a,n,m,i,j+1,ans))
     {
    	 return true;
     }
     if(rat(a,n,m,i+1,j,ans))
     {
    	return true;
     }
     if(rat(a,n,m,i,j-1,ans))
     {
    	return true;
     }
     
     if(rat(a,n,m,i-1,j,ans))
     {
    	return true;
     }
     ans[i][j]=0;
    return false; 
   }
}









