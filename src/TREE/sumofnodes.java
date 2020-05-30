    package TREE;
    import java.util.*;
    public class sumofnodes {
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
	sumofnodes(int a[])
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
		Node n=new Node(a[mid]);
		n.left=construct(a,lo,mid-1);
		n.right=construct(a,mid+1,hi);
		return n;
	}
	public void preorder()
	{
		preorder(this.root);
		
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
	public void sum() {
		int a[]= {0};
		sum(this.root,a);
	}
	private void sum(Node node,int su[])
	{
		if(node==null)
		{
			return;
		}
		sum(node.right,su);
		su[0]+=node.data;
		node.data=su[0];
		sum(node.left,su);
		
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
		sumofnodes b=new sumofnodes(a);
		b.sum();
		b.preorder();
	   }
     }
