package algojava;
import java.util.*;
public class prime {
	public static void main(String[] args) {
	
		        Scanner sc=new Scanner(System.in);
		        System.out.println();
		            int count=0,c=0,a,j;
		            int t=sc.nextInt();
		            while(t!=0)
		            {
		             int n=sc.nextInt();
		             count=0;
		              a=3;
		               for(c=2;c<=n;c++)
		               {
		            	   int b=(int)Math.sqrt(a);
		            	   for(j=2;j<b;j++)
		            	   {
		            		   if(a%j==0)
		            			   break;
		            	   }
		            	   if(a==j)
		            	   {
		            		   count=a;
		            	   }
		            	   a++;
		               }
		               System.out.println(count);
		               t--;
		             }
	                }
                   }