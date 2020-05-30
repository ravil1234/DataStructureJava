import java.util.*;
public class swapdigits {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int A=sc.nextInt();
			int B=sc.nextInt();
		    String a=Integer.toString(A);
		    String b=Integer.toString(B);
		    int sum=A+B;
		    for(int i=0;i<a.length();i++)
		    {
		    	char ch=a.charAt(i);
		    	for(int j=0;j<b.length();j++)
		    	{
		    		char ch1=b.charAt(j);
		    		String s1=a.substring(0,i)+ch1+a.substring(i+1);
		    		String s2=b.substring(0,j)+ch+b.substring(j+1);
		    		if(sum<(Integer.parseInt(s1)+Integer.parseInt(s2)))
		    		{
		    			sum=Integer.parseInt(s1)+Integer.parseInt(s2);
		    		}
		    		
		    	}
		    }
		    System.out.println(sum);
			t--;
		}
	}

}
