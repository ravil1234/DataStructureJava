package TREE;
import java.util.*;
class binarytree {	
private class Node
{
	int data;
	Node left;
	Node right;
	Node(int data,Node left,Node right)
	{
		this.data=data;
		this.left=left;
		this.right=right;
	}
}
 private int size=0;
 private Node root=null;
 binarytree()
 {
	 Scanner s=new Scanner(System.in);
	 this.root=takeInput(s,null,false);
 }
 private Node takeInput(Scanner s, Node parent,boolean isRightOrLeft )
 {
	 if(parent ==null)
	 {
		 System.out.println("enter data for root node:");
	 }
	 else
	 {
		 if(isRightOrLeft)
		 {
			 System.out.println("enter data for left child of "+parent.data);
		 }
		 else
		 {
			 System.out.println("enter data for right child of "+parent.data);
		 }
		 
	 }
	 int nodedata=s.nextInt();
	 this.size++;
	 Node node=new Node(nodedata,null,null);
	 boolean choice=false;
	 System.out.println("Do u want left child of "+node.data);
	 choice =s.nextBoolean();
	 if(choice)
	 {
		 node.left=takeInput(s,node,true);
	 }
	 choice=false;
	 System.out.println("Do u want right child of "+node.data);
	 choice =s.nextBoolean();
	 if(choice)
	 {
		 node.right=takeInput(s,node,false);
	 }
	return node; 
 }
 public void display()
 {
	 this.display(this.root);
	 System.out.println(this.size);
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
 public int height()
 {
	 return this.height(this.root);
 }
 private int height(Node node)
 {
	 if(node==null)
	 {
		 return -1;
	 }
	 int lh=this.height(node.left);
	 int rh=this.height(node.right);
	 return (Math.max(lh, rh)+1);
 }
 public boolean isbalanced()
 {
	 return isbalanced(this.root);
 }
 private boolean isbalanced(Node node)
 {
	 if(node==null)
	 {
		 return true;
	 }
	 int l=this.height(node.left);
	 int r=this.height(node.right);
	 boolean n=isbalanced(node.left);
	 boolean k=isbalanced(node.right);
	 if(Math.abs(l-r)<=1&&n==true&&k==true)
	 {
		 return true;
	 }
	return false;
	
 }
 public void preorder()
 {
	 System.out.print("PREORDER:-");
	 this.preorder(this.root);
	 System.out.println("END");
 }
 private void  preorder(Node node)
 {
	 if(node==null)
	 {
		 return;
	 }
	 System.out.print(node.data+", ");
	 preorder(node.left);
     preorder(node.right);	 
 }
 public void inorder()
 {
	 System.out.print("INORDER:-");
	 this.inorder(this.root);
	 System.out.println("END");
	 
 }
 private void  inorder(Node node)
 {
	 if(node==null)
	 {
		 return;
	 }
	 inorder(node.left);
	 System.out.print(node.data+", ");
     inorder(node.right);	
 }
 public void postorder()
 {
	 System.out.print("POSTORDER:-");
	 this.postorder(this.root);
	 System.out.println("END");
 }
 private void  postorder(Node node)
 {
	 if(node==null)
	 {
		 return;
	 }
	 postorder(node.left);
     postorder(node.right);	
     System.out.print(node.data+", ");
 }
 public void levelorder()
 {
	 this.levelorder(this.root);
 }
 public void levelorder(Node node)
 {
		LinkedList<Node> q=new LinkedList<>();
		q.add(this.root);		
		while(!q.isEmpty())
		{
			Node rv=q.removeFirst();
			System.out.print(rv.data+" ");
			if(rv.left!=null)
			{
				q.add(rv.left);
			}
			if(rv.right!=null)
			{
				q.add(rv.right);
			}
		}
 }
 /* BST ADD AN ELEMENT */
 public void add(int item)
 {
	 add(this.root,item);
 }
 private void add(Node node ,int item)
 {
	 if(node.data>item)
	 {
		 if(node.right==null)
		 {
			 Node n=new Node(item,null,null);
			 node.right=n;
		 }
		 else
		 {
			 add(node.right,item);
		 }
	 }
	 if(node.data<item)
	 {
		 if(node.left==null)
		 {
			 Node n=new Node(item,null,null);
			 node.right=n;
		 }
		 else
		 {
			 add(node.left,item);
		 }
	 }
 }
 public static void main(String args[])
 {
	 binarytree tr=new binarytree();
	 tr.display();
	 System.out.println(tr.height());
	 tr.preorder();
	 tr.inorder();
	 tr.postorder();
	 tr.levelorder();
	 tr.add(87);
	 tr.display();
	 System.out.println(tr.isbalanced());
	 /* 
	 50 true 25 true 38  false false true 48 true 18 false false false true 45 true 85 
	     false false true 60 false false*/
 }
}
