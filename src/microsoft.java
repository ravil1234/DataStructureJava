import java.util.*;
public class microsoft {
	static int count=0;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t!=0)
		{
		    int N=sc.nextInt();
		    int n=sc.nextInt();
		    hanoi("1","3","2",N,n);
		    t--;
		    System.out.println();
		}
	}
	public static void hanoi(String src,String dest,String help,int N,int n)
	{
	      if(N==0)
	      return;
	      hanoi(src,help,dest,N-1,n);
	      count++;
	      if(count==n)
	      System.out.println(src+" "+dest);
	      hanoi(help,dest,src,N-1,n);
	}
}
		/*
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	HashMap<String,Integer> h=new HashMap<>();
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch=='-')
		{
			String s1=s.substring(i+4,i+8);
		System.out.println(s1);
			    i=i+9;
		   	h.put(s1,0);
    	}
   	}
System.out.println(h.size());
	
  }
  }
*/

