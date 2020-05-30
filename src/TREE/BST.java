package TREE;
import java.util.*;
public class BST {
	private class Node
	{
		int data;
		Node left;
		Node right;
	}
	private Node root;
	
	BST(int a[])
	{
		this.root=construct(a,0,a.length-1);
	}
	private Node construct(int a[],int lo,int hi)
	{
		if(lo>hi)
		{
			return null;
		}
		int mid=(lo+hi)/2;
		Node nn=new Node();
		nn.data=a[mid];
		nn.left=construct(a,lo,mid-1);
		nn.right=construct (a,mid+1,hi);
		
		return nn;
	}
	public void display()
	{
		this.display(this.root);
	}
	private void display(Node node)
	{
		String str="";
		if(node.left!=null)
		{
		   str=str+node.left.data+"->";
		}
		else
		{
			str=str+"null->";
		}
        str=str+node.data;  
        if(node.right!=null)
		{
		   str=str+"<-"+node.right.data;
		}
		else
		{
			str=str+"<-null";
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
	 /*FIND IN A BST    */
     public boolean find(int m)
     {
    	 
    	 return find(this.root,m);
     }
	private boolean find(Node node,int m)
	{
		if(node==null)
		{
			return false;
		}
		if(m==node.data)
		{
			return true;
		}
		if(m>node.data)
		{
			return find(node.right,m);
			
		}
		else
		{
			return find(node.left,m);
		}
	}
	/* max in bst*/
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
	/*delete in a tree*/
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
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		BST b=new BST(a);
		b.display();
		System.out.println(b.find(m));
		System.out.println(b.maxi());
		b.remove(3);
		b.display();
	}
}
