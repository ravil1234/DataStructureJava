package aug_challenge;
import java.util.*;
public class xor_engine {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int t=sc.nextInt();
	
		while(t!=0)
		{
			xorval();
			t--;
		}
	}
public static void  xorval()
{
	int n=sc.nextInt();
	int q=sc.nextInt();
	ArrayList<Integer> a=new ArrayList<>();
	for(int i=0;i<n;i++)
	{
		int x=sc.nextInt();
		a.add(x);
	}
	while(q!=0)
	{
	int p=sc.nextInt();
	int even=0;
	int odd=0;
	for(int i=0;i<a.size();i++)
	{
		
		long y=a.get(i)^p;
		//System.out.println(y);
		if(Long.bitCount(y)%2==0)
			even++;
		else
			odd++;
	}
	System.out.println(even+" "+odd);
	q--;
	}
	
	q--;
//	while(q!=0)
//	{
//		 p=sc.nextInt();
//		 if(p%2==ev)
//		System.out.println(even+" "+odd);
//		 else
//			 System.out.println(odd+" "+even); 
//		q--;
//	}
		
	}
}
