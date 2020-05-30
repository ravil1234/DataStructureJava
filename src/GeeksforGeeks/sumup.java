package GeeksforGeeks;
import java.util.*;
public class sumup {
	 static HashMap<String,Integer> h=new HashMap<>();
	    static int count=0;
		public static void main (String[] args) {
			//code
			Scanner  sc=new Scanner(System.in);
			int t=sc.nextInt();
			while(t!=0)
			{
				count=0;
			    int n=sc.nextInt();
			    int a[]=new int[n];
			    for(int i=0;i<n;i++)
			    {
			        a[i]=sc.nextInt();
			    }
			    Arrays.sort(a);
			    int s=sc.nextInt();
			    print(a,0,s,0,"");
			    if(count==0)
			    {
			        System.out.print("Empty");
			    }
			    t--;
			    h=new HashMap<>();
			    System.out.println();
			}
		}
		public static void  print(int a[],int i,int s,int sum,String res)
		{
		     
		    if(s==sum)
		    {
		    
		     if(!h.containsKey(res))
		     {
		         String n=res.substring(0,res.length()-1);
		         System.out.print("("+n+")");
		         h.put(res,1);
		         count++;
		     }
		    }
		    if(i==a.length||sum>s)
		         return;
		    print(a,i+1,s,sum+a[i],res+a[i]+" ");
		    print(a,i+1,s,sum,res);
		    
		}
	}
