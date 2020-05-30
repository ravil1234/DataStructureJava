package Hashmap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;
public class verticalview {
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
	verticalview()
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
	
	 public void vertical_view()
	 {
		 TreeMap<Integer,ArrayList<Integer>> h=new TreeMap<>();
		 vertical_view(this.root,0,h);
		 for(Integer i:h.keySet() )
		 {
			 ArrayList<Integer> a=h.get(i);
			 for(int j=0;j<a.size();j++)
			 {
				 System.out.print(a.get(j)+" ");
			 }
			 System.out.println();
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
		 int n=sc.nextInt();
		verticalview t=new verticalview();
		 t.vertical_view();
	 }
}
