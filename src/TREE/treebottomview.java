package TREE;
import java.util.*;
public class treebottomview 
{
	static Scanner sc=new Scanner(System.in);
	private class Node 
	{
		int data,hd;
		Node left;
		Node right;
		Node(int data)
		{
			this.data=data;
			hd=Integer.MAX_VALUE;
			left=right=null;
		}
	}
	private Node root;
	treebottomview()
	{
		int item=sc.nextInt();
		Node a=new Node(item);
	this.root=takeInput(a);
	}
  private Node takeInput(Node node)
  {
	  LinkedList<Node> q=new LinkedList<>();
	  q.addLast(node);
	  while(!q.isEmpty())
	  {
		  Node rv=q.removeFirst();
		  int lc=sc.nextInt();
		  int rc=sc.nextInt();
		  if(lc!=-1)
		  {
			  rv.left=new Node(lc);
			 q.addLast(rv.left);
		  }
		  if(rc!=-1)
		  {
			  rv.right=new Node(rc);
			 q.addLast(rv.right);
		  }
	  }
	  return node;
  }
  public void bottom()
  {
	  bottom(this.root,0);
  }
  private void bottom(Node node,int hd)
  {
	  LinkedList<Node> q =new LinkedList<>();
	  TreeMap<Integer,Integer > h=new TreeMap<>();   
	  node.hd=hd;
	  q.addLast(node);
	 while(!q.isEmpty())
	 {
		Node rv=q.removeFirst();
	    hd=rv.hd;
	    h.put(hd,rv.data);
	    if(rv.left!=null)
	    {
	    	rv.left.hd=hd-1;
	    	q.addLast(rv.left);
	    }
	    if(rv.right!=null)
	    {
	    	rv.right.hd=hd+1;
	    	q.addLast(rv.right);
	    }
	 }
	 
	for(Map.Entry<Integer, Integer> i:h.entrySet())
	{
		System.out.print(i.getValue()+" ");
	}
  }
   public static void main(String args[])
   { 
	   treebottomview v=new treebottomview();
	   v.bottom();
	   
   }
}
