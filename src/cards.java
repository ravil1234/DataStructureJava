import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Stack<Integer> s = new Stack<>();
		Stack<Integer> a = new Stack<>();
		Stack<Integer> b = new Stack<>();
		int n = scn.nextInt();
		int[] arr = new int[n];
		int q = scn.nextInt();
		for (int i = 0; i < n; i++)
		{
			arr[i] = scn.nextInt();
			s.push(arr[i]);
		}
		ArrayList<Integer> a1=new ArrayList<>();
		a1=getprime(n);
		System.out.println(a1);
		for(int i=1;i<=q;i++)
		{
			
		   while(!s.isEmpty())
		    {
			    int x=s.pop();
			    int j=a1.get(i-1);
			    if(x%j==0)
			    	b.push(x);
			    else
			    	a.push(x);
			    
			    
		     }
		   while(!b.isEmpty())
		   {
			   System.out.println(b.pop());
		   } 
		   //changing refrence
		   s=a;
	     a=new Stack<>();
		}
		while(s.isEmpty()==false)
		   {
			   System.out.println(s.pop());
		   }
	}

	public static ArrayList<Integer> getprime(int n) 
	{
		int count = 0;
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 2;i <=(n+1);i++) 
		{
			for (int j = 1; j <= i; j++)
			{
				if (i % j == 0)
					count++;
			}
			if(count==2)
				arr.add(i);
			count=0;
		}
		return arr;
	}

}