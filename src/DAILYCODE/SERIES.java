     package DAILYCODE;
     import java.util.*;
     public class SERIES 
     {
	 public static void main(String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t!=0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int e=sc.nextInt();
			int f=sc.nextInt();
			float A=(a/2)-(1/2)+e;
			float B=(b-a+d);
			float C=a+c+f;
			float D=B*B-4*(A*C);
			if(D==0)
			{
				float x=-B/(2*A);
				System.out.printf("%.4f",x);
			}
			else if(D>0)
			{
			    float x=(float)(-B+Math.sqrt(D))/(2*A);
				System.out.printf("%.4f",x);
			}
			else 
			{
				System.out.print("Not Possible");
			}
			t--;
			System.out.println();
		}
	}
}
