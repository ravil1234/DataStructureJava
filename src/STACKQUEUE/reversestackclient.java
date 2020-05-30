package STACKQUEUE;

import java.util.Scanner;

public class reversestackclient {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter capacity");
		int n=sc.nextInt();
		reversestack s=new reversestack(n);
		for(int i=1;i<=n;i++)
		{
		 int a=sc.nextInt();
		 s.push(a);
		}
		 s.display();
		 reversestack res=new reversestack(n);
		 reverse(s,res,0);
		 s.display();
	}
	/*
public void reverseStack(StacksUsingArrays stack, StacksUsingArrays helper, int idx) throws Exception {
		if(stack.isempty())
		{
			return;
		}
		int item=s.pop();
		reverse(stack,helper,idx+1);
		helper.push(item);
		if(idx==0)
		{
		while(!helper.isempty())
		{
			stack.push(helper.pop());
		}
			
	  }
		
		}
		*/
	public static  void reverse(reversestack s,reversestack res,int index) throws Exception
	{
		if(s.isempty())
		{
			return;
		}
		int item=s.pop();
		reverse(s,res,index+1);
		res.push(item);
		if(index==0)
		{
		while(!res.isempty())
		{
			s.push(res.pop());
		}
			
	}
	}

}
