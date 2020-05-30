package recursionchallenges;
import java.util.*;
public class numbers_lexically {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(0+" ");
		for(int i=1;i<=9;i++)
		{
		lexical(i,n);
		}

	}
public static void lexical(int i,int n)
{
	if(i<=n)
	{
		System.out.print(i+" ");
	}
    	for(int j=0;j<=9;j++)
    	{
    		if(i+j<=n)
    		{
    			lexical(i*10+j,n);
    		}
    	}
    }

}
