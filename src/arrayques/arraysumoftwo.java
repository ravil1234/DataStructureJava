package arrayques;
import java.util.*;
public class arraysumoftwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int a[]=new int[n];
          String str1="",str2="";
          for(int i=0;i<n;i++)
          {
        	  a[i]=sc.nextInt();
        	  str1=str1+a[i];
          }
          int m=sc.nextInt();
          int b[]=new int[m];
          for(int i=0;i<m;i++)
          {
        	  b[i]=sc.nextInt();
        	  str2=str2+b[i];
          }
          int sum1=Integer.parseInt(str1);
          int sum2=Integer.parseInt(str2);
          int res=sum1+sum2;
          int c[]=new int[100];
          int k=0;
          while(res!=0)
          {
        	  int r=res%10;
        	  c[k]=r;
        	  res=res/10;
        	  k++;
          }
          for(int j=k-1;j>=0;j--)
          {
        	  System.out.print(c[j]+", ");
          }
          System.out.print("END");
          
	}

}
