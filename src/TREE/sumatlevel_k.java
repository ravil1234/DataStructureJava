package TREE;
import java.util.*;
public class sumatlevel_k {
	private class Node
	{
		int data;
		ArrayList<Node> children=new ArrayList<>();
		Node(int data)
		{
			this.data=data;
			this.children=new ArrayList<>();
		}
	}
     private Node root;
     sumatlevel_k()
     {
    	 Scanner sc=new Scanner(System.in);
    	 this.root=takeInput(sc,null,0);
     }
private Node takeInput(Scanner s, Node parent ,int ithchild)
{
	if(parent==null)
	{
		//System.out.println("enter data for the root node");
	}
	else
	{
		//System.out.println("enter data for the "+parent.data +" of "+ithchild);
	}
	int nodedata=s.nextInt();
	Node node =new Node(nodedata);
	//System.out.println("enter no.of children for "+node.data);
	int children=s.nextInt();
	for(int i=0;i<children;i++)
	{
		Node child=takeInput(s,node,i);
		node.children.add(child);
	}
	return node;
}
private int sum=0;
public void printlevel(int l,int c)
{
	this.printlevel(this.root, l, c);
	System.out.println(sum);
}
private void  printlevel(Node node,int l,int c)
{
	if(node==null)
	{
		return;
	}
	if(c==l)
	{
		sum=sum+node.data;
	}
	for(int i=0;i<node.children.size();i++)
	{
	   printlevel(node.children.get(i),l,c+1);	
	}
}
public static void main(String args[])
{
	sumatlevel_k k=new sumatlevel_k();
	Scanner sc=new Scanner(System.in);
	int l=sc.nextInt();
	k.printlevel(l, 0);
}
}