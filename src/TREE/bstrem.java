package TREE;
import java.util.*;
public class bstrem {
	private class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	private Node root=null;
	
	public void rootn(int val)
	{
		Node n=new Node(val);
	    this.root=n;
	}
  public void add(int item)
  {
	  add(this.root,item);
  }
  private void add(Node node,int item)
  {
	  if(item>node.data)
	  {
		  if(node.right==null)
		  {
			  Node n=new Node(item);
			  node.right=n;
		  }
		  else
		  {
			  add(node.right,item);
		  }
	  }
	  if(item<node.data)
	  {
		  if(node.left==null)
		  {
			  Node n=new Node(item);
			  node.left=n;
		  }
		  else
		  {
			  add(node.left,item);
		  }
	  }
  }
  public int maxi()
	{
		return maxi(this.root);
	}
	private int maxi(Node node)
	{
		if(node.right==null)
		{
			return node.data;
		}
		return maxi(node.right);
	}
  public void remove(int item)
	{
		remove(this.root,null,false,item);
	}
	private void remove(Node node,Node parent,boolean ilc ,int item)
	{
		if(item>node.data)
		{
			remove(node.right,node,false,item);
		}
		else if(item<node.data)
		{
			remove(node.left,node,true,item);
		}
		else
		{
			//case 1:
		if(node.left==null&&node.right==null)  
		{
			if(ilc)
			{
				parent.left=null;
			}
			else
			{
				parent.right=null;
			}
		 }
		//case 2:
		else if((node.left==null&&node.right!=null))
		{
			if(ilc)
			{
				parent.left=node.right;
			}
			else
			{
			   parent.right=node.right;	
			}
		}
		//case 3
		else if(node.left!=null&&node.right==null)
		{
			if(ilc)
			{
				parent.left=node.left;
			}
			else
			{
			   parent.right=node.left;	
			}
		}
		//case 4 important left&&right !=null then we find max of node left 
		else
		  {
			int max=maxi(node.left);
			node.data=max;
			remove(node.left,node,true,max);
		  }
		}
	}
 public void preorder()
   {
	 this.preorder(this.root);
   }
 private void  preorder(Node node)
 {
	 if(node==null)
	 {
		 return;
	 }
	 System.out.print(node.data+" ");
	 preorder(node.left);
     preorder(node.right);	 
 }
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t!=0)
	 {
	 int n=sc.nextInt();
	 int a[]=new int[n];
	 a[0]=sc.nextInt();
	bstrem b=new bstrem();
	b.rootn(a[0]);
	for(int i=1;i<n;i++)
	{
		a[i]=sc.nextInt();
		b.add(a[i]);
	}
	int m=sc.nextInt();
	for(int i=0;i<m;i++)
	{
		int x=sc.nextInt();
		b.remove(x);
	}
	b.preorder();
	t--;
	 }
 }
}
