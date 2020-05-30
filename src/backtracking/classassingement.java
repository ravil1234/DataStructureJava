package backtracking;
import java.util.*;
public class classassingement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i=1;
		while(t!=0)
		{
		int  n=sc.nextInt();
        System.out.print("#"+i+" : ");
        System.out.println( assign(n));
        i++;
        t--;
		}
	}
public static int assign(int n)
{
  if(n==1)
  {
	return 2;
  }
  else if(n==2)
  {
	  return 3;
  }
  else
	  return assign(n-1)+assign(n-2);

}
}