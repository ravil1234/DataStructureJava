package TREE;
import java.util.*;
public class po_inorder {
	private class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}
	private Node root;
	
	po_inorder(int p[],int in[])
	{
		this.root=construct(p,in,0,p.length-1,in.length-1);
	}
	private Node construct(int p[],int in[],int lo,int hi,int h)
	{
		
		if(lo>hi)
		{
			return null;
		}
		Node nn=new Node(p[h]);
		    h--;
		if(lo==hi)
		{
			return nn;
		}
		int i=search(nn.data,in,lo,hi);
		nn.right=construct(p,in,i+1,hi,h);
		nn.left=construct(p,in,lo,i-1,h);
		return nn;
		
	}
	private int search(int val,int in[],int lo,int hi)
	{
		int i;
		for(i=lo;i<=hi;i++)
		{
		  if(val==in[i])
		  {
			  break;
		  }
		}
		return i;
	}
	public void display()
	{
		display(this.root);
	}
	private void display(Node node)
	{
	    
		String str="";
		if(node.left!=null)
		{
			str=str+node.left.data+" => ";
		}
		else
		{
			str=str+"END"+" => ";
		}
		str=str+node.data;
		if(node.right!=null)
		{
			str=str+" <= "+node.right.data;
		}
		else
		{
			str=str+" <= END";
		}
		System.out.println(str);
		if(node.left!=null)
		{
			display(node.left);
		}
		if(node.right!=null)
		{
			display(node.right);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p[]=new int[n];
		for(int i=0;i<n;i++)
		{
			p[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int in[]=new int[m];
		for(int i=0;i<m;i++)
		{
			in[i]=sc.nextInt();
		}
		po_inorder b=new po_inorder(p,in);
		b.display();
	}
}
