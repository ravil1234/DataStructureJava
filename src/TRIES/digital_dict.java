package TRIES;
import java.util.*;
public class digital_dict {
public class Node
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
public  Node root;
digital_dict()
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
public boolean search(Node parent ,String word)
{
	if(word.length()==0)
	{
		return true;
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
public void display(Node n)
{
	display(n,"");
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
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	digital_dict t=new digital_dict();
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		String s=sc.next();
		t.addWord(s);
		
	}
	int q=sc.nextInt();
	while(q!=0)
	{
		String str=sc.next();
		if(t.search(t.root,str));
		{
			char ch=str.charAt(str.length()-1);
			System.out.println(ch);
			Node child=t.root.children.get(ch);
		    t.display(child);
		}
		q--;
		
	}	  
}
}