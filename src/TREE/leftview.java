package TREE;
import java.util.*;
public class leftview {
	static Scanner sc=new Scanner(System.in);
	private class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data=data;
			left=right=	null;
		}
	}
	private Node root;
	leftview()
	{
		int item=sc.nextInt();
		Node n=new Node(item);
	   this.root=takeinput(n,-1);
	}
	private Node takeinput(Node node,int bool)
	{	
		if(node==null)
		{
			return node;
		}
		LinkedList<Node> q=new LinkedList<>();
		q.add(node);
		while(!q.isEmpty())
		{
			Node rv=q.removeFirst();
			int lc=sc.nextInt();
			int rc=sc.nextInt();
			if(lc!=-1)
			{
				rv.left=new Node(lc);
				q.add(rv.left);
			}
			if(rc!=-1)
			{
				rv.right=new Node(rc);
				q.add(rv.right);
			}
		}
		return node;
	}
	static int max=0;
	 public void levelorder()
	 {
		 levelorder(this.root,1);
	 }
	 private void levelorder(Node node,int level)
	 {
		if(node==null)
		{
			return;
		}
		if(max<level)
		{
			System.out.print(node.data+" ");
			max=level;
		}
		levelorder(node.left,level+1);
		levelorder(node.right,level+1);
	 }
	 public static void main(String args[])
	 {
		 
		 leftview t=new leftview();
		 t.levelorder();
	 }
}