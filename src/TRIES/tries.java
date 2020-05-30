package TRIES;
import java.util.*;
public class tries {
private class Node
{
	char data;
	HashMap<Character,Node> children;
	boolean isTerminal;
	Node(char data,boolean isTerminal)
	{
		this.data=data;
		this.isTerminal=isTerminal;
		children=new HashMap<>();
	}
}
private int numWords;
private Node root;
tries()
{
	this.root=new Node('\0',false);
	numWords=0;
}
public int numword()
{
	return numWords;
}
public void addWord(String word)
{
	this.addWord(this.root,word);
}
private void addWord(Node parent ,String word)
{
	if(word.length()==0)
	{
		if(parent.isTerminal)
		{
			//word already exists;
		}
		else
		{
		parent.isTerminal=true;
		numWords++;
		}
		return;
	}
	char cc=word.charAt(0);
	String ros=word.substring(1);
	Node child=parent.children.get(cc);
	if(child==null)
	{
		child=new Node(cc,false);
		parent.children.put(cc,child);
	}
	this.addWord(child,ros);
}
public void display()
{
	display(this.root,"");
}
private void display(Node node,String osf)
{
	if(node.isTerminal)
	{
		String todisplay=osf.substring(1)+node.data;
		System.out.println(todisplay);
	}
	for(Map.Entry<Character,Node> i:node.children.entrySet())
	{
		display(i.getValue(),osf+node.data);
	}
	
}
public boolean search(String word)
{
   return this.search(this.root,word);
}
private boolean search(Node parent ,String word)
{
	if(word.length()==0)
	{
		if(parent.isTerminal)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	char cc=word.charAt(0);
	String ros=word.substring(1);
	Node child=parent.children.get(cc);
	if(child==null)
	{
		return false;
	}
	return search(child,ros);
	
}
public void remove(String word)
{
   this.remove(this.root,word);
}
private void remove(Node parent ,String word)
{
	if(word.length()==0)
	{
		if(parent.isTerminal)
		{
			parent.isTerminal=false;
			this.numWords--;
		}
		return;
	}
	char cc=word.charAt(0);
	String ros=word.substring(1);
	Node child=parent.children.get(cc);
	if(child==null)
	{
		return;
	}
	remove(child,ros);
	
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	tries t=new tries();
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		String s=sc.next();
		t.addWord(s);
		
	}
	  t.display();
	  System.out.println(t.numword());
      t.remove("art");
      t.display();
      System.out.println(t.numword());
      t.remove("sea");
      t.display();
      System.out.println(t.numword());
}
}
