package TREE;
import java.util.*;
public class bstinrange {
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
		private Node root;
		
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
	 public void preorder()
	   {
		 System.out.print("# Preorder :");
		 this.preorder(this.root);
	   }
	 private void  preorder(Node node)
	 {
		 if(node==null)
		 {
			 return;
		 }
		 System.out.print(" "+node.data);
		 preorder(node.left);
	     preorder(node.right);	 
	 }
	 public void inorder(int s,int e)
	   {
		 this.inorder(this.root,s,e);
	   }
	 private void  inorder(Node node,int s,int e)
	 {
		 if(node==null)
		 {
			 return;
		 }
		 inorder(node.left,s,e);
		 if(node.data>=s&&node.data<=e)
		 System.out.print(node.data+" ");
	     inorder(node.right,s,e);	 
	 }
	 public static void main(String args[]) throws Exception
		{
			Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t!=0)
	        {
			int n=sc.nextInt();
			int a[]=new int[n];
			 a[0]=sc.nextInt();
			bstinrange b=new bstinrange();
			b.rootn(a[0]);
			for(int i=1;i<n;i++)
			{
				a[i]=sc.nextInt();
				b.add(a[i]);
			}
		    int s=sc.nextInt();
		    int e=sc.nextInt();
		    b.preorder();
			System.out.println();
			System.out.print("# Nodes within range are : ");
			b.inorder(s, e);
	        t--;
	        System.out.println();
	        }
		}
	}
