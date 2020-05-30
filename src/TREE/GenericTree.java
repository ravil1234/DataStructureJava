package TREE;
import java.util.*;
public class GenericTree {
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
private int size;
      GenericTree()
      {
    	  Scanner sc=new Scanner(System.in);
    	  this.root=takeInput(sc,null,0);
      }
public Node takeInput(Scanner s,Node parent,int ithchild)
{
      if(parent==null)
      {
   	  System.out.println("enter data for root node");
      }
      else
      {
    	  System.out.println("enter data for "+parent.data+" of "+ithchild+" child");
      }
      int nodedata=s.nextInt();
      Node node=new Node(nodedata);
      this.size++;
      System.out.println("enter no. of children for "+node.data);
      int children=s.nextInt();
      for(int i=0;i<children;i++)
      {
    	 Node child= takeInput(s,node,i);
    	 node.children.add(child);
    	 
      }
      return node;

}
public void display()
{
	this.display(this.root);
	System.out.println(size);
}
private void display(Node node)
{
	String str=node.data+"->";
	for(int i=0;i<node.children.size();i++)
	{
		str=str+node.children.get(i).data+",";
	}
	str=str+"END";
	System.out.println(str);
	for(int i=0;i<node.children.size();i++)
	{
		this.display(node.children.get(i));
	}
  }
public static void main(String args[])
{
	GenericTree tree=new GenericTree();
	   tree.display();
}
}
