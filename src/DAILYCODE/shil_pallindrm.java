package DAILYCODE;
import java.util.*;
public class shil_pallindrm {
	static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		String s=sc.next();
		while(m!=0)
		{
		   int a=sc.nextInt();
		   if(a==1)
		   {
			   int b=sc.nextInt();
			   char c=sc.next().charAt(0);
			   String s1=s.substring(0,b-1)+c+s.substring(b);
			   s=s1;
		   }
		   else
		   {
			  int b=sc.nextInt();
			  int c=sc.nextInt();
			 String s1=s.substring(b-1,c);
			 char str[]=new char[s1.length()];
			 
			 for(int i=0;i<s1.length();i++)
			 {
				 char ch=s1.charAt(i);
				 str[i]=ch;	
			}
			 findPermutations(str,0,str.length);
			 if(count==0)
			 {
				 System.out.println("no");
			 }
		   }
		   m--;
		}
	}
public static int pallindrome(char str[])
{
	char s2[]=new char[str.length];
	int j=0;
	for(int i=str.length-1;i>=0;i--)
		{
		   s2[j]=str[i];
		   j++;
		   
		}
	  if(Arrays.equals(s2, str))
	  {
		  return 1;
	  }
	  else
	  {
		  return 0;
	  }
  }
static boolean shouldSwap(char str[], int start, int curr) { 
    for (int i = start; i < curr; i++) { 
        if (str[i] == str[curr]) { 
            return false; 
        } 
    } 
    return true; 
} 
static void findPermutations(char str[], int index,int n) { 
	if(count==1)
		return;
    if (index >= n) { 
        int l=pallindrome(str);
        if(l==1)
        {
        	count=1;
        	System.out.println("yes");
        }
        return; 
    } 
    for (int i = index; i < n; i++) { 
        boolean check = shouldSwap(str, index, i); 
        if (check) { 
            swap(str, index, i); 
            findPermutations(str, index + 1, n); 
            swap(str, index, i); 
        } 
    } 
} 
static void swap(char[] str, int i, int j) { 
    char c = str[i]; 
    str[i] = str[j]; 
    str[j] = c; 
  } 
}