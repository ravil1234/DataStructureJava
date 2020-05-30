package TREE;
import java.util.*;
public class treetopview {
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
	treetopview()
	{
		int item=sc.nextInt();
		Node n=new Node(item);
	   this.root=takeinput(n);
	}
	private Node takeinput(Node node)
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
	
	 public void vertical_view()
	 {
		 TreeMap<Integer,ArrayList<Integer>> h=new TreeMap<>();
		 vertical_view(this.root,0,h);
		 for(Integer i:h.keySet() )
		 {
			      ArrayList<Integer> a=h.get(i);
				 System.out.print(a.get(0)+" ");
		 }
	 }
	 private void vertical_view(Node node,int hd,TreeMap<Integer,ArrayList<Integer>> h)
	 {
		 if(node==null)
			 return;
		 ArrayList<Integer> a=h.get(hd);
		 if(a==null)
		 {
			 a=new ArrayList<>();
			 a.add(node.data);
		 }
		 else
		 {
			 a.add(node.data);
		 }
		 h.put(hd,a);
		 vertical_view(node.left,hd-1,h);
		 vertical_view(node.right,hd+1,h);
	 }
	 public static void main(String args[])
	 {
		 
		 treetopview t=new treetopview();
		 t.vertical_view();
	 }
}
