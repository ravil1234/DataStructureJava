package aug_challenge;
import java.util.*;
public class eidi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int a[]=new int[3];
			int c[]=new int[3];
			for(int i=0;i<3;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0;i<3;i++)
			{
				c[i]=sc.nextInt();
			}
			
			for(int i=0;i<2;i++)
			{
				int temp;
				for(int j=0;j<3-i-1;j++)
				{
					if(a[j]>a[j+1])
					{
						temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
						temp=c[j];
						c[j]=c[j+1];
						c[j+1]=temp;
					}
				}
					
			}
			int count=0;
		 for(int i=1;i<3;i++)
		 {
			 if((a[i-1]==a[i]&&c[i-1]!=c[i])||(a[i-1]!=a[i]&&c[i-1]==c[i]))
			 {
				 count=1;
				 System.out.println("NOT FAIR");
				 break;
			 }
			 else if(c[i-1]>c[i])
			 {
				 count=1;
				 System.out.println("NOT FAIR");
				 break;
			 }
		 }
		 if(count==0)
		 System.out.println("FAIR");
		 t--;
		}

	}

}
