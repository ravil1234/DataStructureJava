package pritampurabatch;
import java.util.*;
public class anytoany {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sb=sc.nextInt();
		int db=sc.nextInt();
		int n=sc.nextInt();
		int sum=anytodecimal(sb,n);
		decimaltoany(db,sum);
	}
public static int anytodecimal(int sb,int n)
{
     int sum=0;
     int i=0;
     while(n!=0)
     {
    	 int r=n%10;
    	 sum=sum+r*(int)Math.pow(sb, i);
    	 i++;
    	 n=n/10;
     }
     return sum;
}
public static void decimaltoany(int db,int sum)
{
	String str="";
	while(sum!=0)
	{
	int r=sum%db;
	str=r+str;
	sum=sum/db;
	}
	System.out.println(str);
}
public static void decimaltooct(int sum)
{
	String str="";
	while(sum!=0)
	{
	int r=sum%8;
	str=r+str;
	sum=sum/8;
	}
	System.out.println(str);
}
public static int binarytodecimal(int n)
{
     int sum=0;
     int i=0;
     while(n!=0)
     {
    	 int r=n%10;
    	 sum=sum+r*(int)Math.pow(2, i);
    	 i++;
    	 n=n/10;
     }
     return sum;
}
}
