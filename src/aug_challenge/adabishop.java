package aug_challenge;
import java.util.*;
public class adabishop 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int c=sc.nextInt();
			int r=sc.nextInt();
			int count1=0;
			if(r==c&&r!=1&&c!=1)
			{
				System.out.println(1+" "+1);
				count1++;
			}
			else if(r!=c)
			{
			    while(r!=c)
			    {
			    	if(r>c)
			    	{
			    		 r--;
				    	 c++;	
			    	}
			    	else
			    	{
			    		c--;
			    		r++;
			    	}
			    }
			    
			    count1+=2;
			}
			System.out.println((55+count1));
			if(count1==1)
		   System.out.println(1+" "+1);
			else if(count1==2)
			{
				System.out.println(r+" "+c);
			    System.out.println(1+" "+1);
			}
			int count=4;
			int total=1;
			for(int i=2;i<=7;i++)
			{
				System.out.println(i+" "+i);
				total+=1;
				int j=1;
				int k=i;
				if(i>4)
				{
					k=count;
					count--;
				}
				int co=0;
			    while(j<k)
			    {
			        System.out.println((i-j)+" "+(i+j));
			        System.out.println(i+" "+i);
			        System.out.println((i+j)+" "+(i-j));
			        System.out.println(i+" "+i);
			        co+=2;
			        j++;
			    } 
			    total+=2*co; 
			}
			 System.out.println(8+" "+8);
			 t--;
		}
	}
}
