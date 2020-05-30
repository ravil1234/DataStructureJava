package recursionques;
import java.util.*;
public class split_array {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		split(a,0,"","",0,0);
		System.out.println(count);
	}
public static void split(int a[],int i,String s1,String s2,int sum1,int sum2)
{
     if(a.length==i)
     {
    	 if(sum1==sum2)
    	 {
    		 System.out.println(s1+"and "+s2);
    		 count++;
    	 }
    	 return;
     }
     split(a,i+1,s1+a[i]+" ",s2,sum1+a[i],sum2);
     split(a,i+1,s1,s2+a[i]+" ",sum1,sum2+a[i]);
     
}
}
