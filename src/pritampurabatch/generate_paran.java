package pritampurabatch;
import java.util.*;
public class generate_paran {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char st[]=new char[2*n];
        paran(n,st,0,0,0);
	}
public static void paran(int n,char st[],int op,int cl,int i)
{
       	if(cl==n)
       	{
       		for(int j=0;j<st.length;j++)
       		{
       			System.out.print(st[j]);
       		}
       		System.out.println();
       		return;
       	}
       	if(op>cl)
       	{
       		st[i]=')';
       		paran(n,st,op,cl+1,i+1);
       	}
       	if(op<n)
       	{
       		st[i]='(';
       		paran(n,st,op+1,cl,i+1);
       	}
}

}
