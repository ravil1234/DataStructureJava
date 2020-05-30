package SEP_PRACTICE;
import java.util.*;
public class football {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			int pa=-1,pb=-1;
			int c=0;
			while(n!=0)
			{
				int q=sc.nextInt();
				
				if(q==1)
				{
					int a=sc.nextInt();
					int b=sc.nextInt();
			     	 pa=a;
				     pb=b;
				     c=0;
					System.out.println("YES");
				}
				else
				{
				  int a=sc.nextInt();
				  int b=sc.nextInt();
				  if(a==b)
				  {
					  System.out.println("YES");   
				  }
				  else if(pa==-1&&pb==-1)
				  {
					  System.out.println("NO");   
				  }
				  else if(pa>=a&&pb>=b&&c==0)
				  {
					  
				  	   System.out.println("YES");   
				  }
				  else if(pa>pb&&pa<=b&&pb<=a&&c==0)
				  {
				        c=1;
				  	   System.out.println("YES");   
				  }
				  else
				  {
					  System.out.println("NO");   
				  }
				  pa=-1;
				  pb=-1;
				}
				n--;
			}
			t--;
		}

	}

}
/*
if(a==b)
{
	   pa=a;
	   pb=b;
	   System.out.println("YES");
}
else if(pa>=a&&pb>=b&&c==0)
{
	   pa=a;
	   pb=b;
	   System.out.println("YES");   
}
else if(pa>pb&&pa<=b&&pb<=a&&c==0)
{
	   pb=a;
	   pa=b;
    c=1;
	   System.out.println("YES");   
}
else
{
	   System.out.println("NO");
}
*/
