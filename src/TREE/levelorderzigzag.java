package TREE;
import java.util.*;
public class levelorderzigzag 
{
	static Scanner sc=new Scanner(System.in);
	private class Node
	{
		int data;
		Node left;
		Node right;
		Node (int data,Node left,Node right)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}
	Node root;
	levelorderzigzag()
	{
		this.root =takeinput(null,false);
	}
	private Node takeinput(Node parent,boolean islr)
	{
		if(parent==null)
		{
			//System.out.println("enter data for the root node");
		}
		else
		{
			if(islr)
			{
				//System.out.println("enter data for left child of"+parent.data);
			}
			else
			{
				//System.out.println("enter data for right child of"+parent.data);
			}
		}
		int nodedata =sc.nextInt();
		Node n=new Node(nodedata,null,null);
		boolean choice =false;
		//System.out.println("do u want left child:");
	    choice=sc.nextBoolean();
		if(choice)
		{
			n.left=takeinput(n,true);
		}
	 choice =false;
	 //System.out.println("do u want right child: ");
	 choice =sc.nextBoolean();
	  if(choice)
	  {
		  n.right=takeinput(n,false);
	  }
			 return n;
	}
	public void levelorder()
	{
		levelorder(this.root);
	}
	private void levelorder(Node node)
	{
	    if(node ==null)
	    	return;
	    Stack<Node> currentlevel=new Stack<>();/* takes the current node*/
	    Stack<Node> nextlevel=new Stack<>();/* takes the value of  current node left or right*/
	    currentlevel.push(node);
	    boolean lr=true;
	    while(!currentlevel.isEmpty())
	    {
	    	
	     Node r=currentlevel.pop();
	     System.out.print(r.data+" ");
	     if(lr)
	     {
	    	 if(r.left!=null)
	    	 {
	    		 nextlevel.push(r.left);
	    	 }
	    	 if(r.right!=null)
	    	 {
	    		 nextlevel.push(r.right);
	    	 }
	     }
	     else
	     {
	    	 if(r.right!=null)
	    	 {
	    		 nextlevel.push(r.right);
	    	 }
	    	 if(r.left!=null)
	    	 {
	    		 nextlevel.push(r.left);
	    	 }
	    	 
	     }
	     if(currentlevel.isEmpty())
	     {
	    	 Stack<Node> tem=currentlevel;   /*swapping of nodes takes place*/
	    	 currentlevel=nextlevel;
	    	 nextlevel=tem;
	    	 lr=!lr;
	     }
	     
	  }
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
			 str=str+"NULL->";
		 }
		 str=str+node.data;
		 if(node.right!=null)
		 {
			 str=str+"<-"+node.right.data;
		 }
		 else
		 {
			 str=str+"<-NULL";
		 }
		 System.out.println(str);
		 if(node.left!=null)
		 {
			 this.display(node.left);
		 }
		 if(node.right!=null)
		 {
			this.display(node.right); 
		 }
	 }	
	public static void main(String args[]) {
		levelorderzigzag z=new levelorderzigzag();
		z.display();
		z.levelorder();
	}
}
