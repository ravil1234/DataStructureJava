package aug_challenge;
import java.util.*;
class check {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		 int n=sc.nextInt();
		 int a[]=new int[n];
		 int b[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 for(int i=0;i<n;i++)
		 {
			 b[i]=sc.nextInt();
		 }
		Arrays.sort(b);
		long sum=0;
		 for(int i=0;i<n;i++)
		 {
			 if(a[i]<b[i])
				 sum+=a[i];
			 else
				 sum+=b[i];
				 
		 }
		 System.out.println(sum);
		 t--;
		}
	}
}
