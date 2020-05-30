package GeeksforGeeks;
import java.util.*;
public class nth_digit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		int n=sc.nextInt();
		for(int i=1;i<=9;i++)
		{
			print(n,i+"",i);
		}
		System.out.println();
		t--;
		}

	}
public static void print(int n,String res,int i)
{
	if(res.length()==n)
	{
		System.out.print(res+" ");
		return;
	}
	if(res.length()>n)
		return;
	for(int j=i+1;j<=9;j++)
	{
		print(n,res+j,j);
	}
}
}
