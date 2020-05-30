package recursionchallenges;
import java.util.*;
public class ruler {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int in=sc.nextInt();
		  int ml=sc.nextInt();
		  for(int i=0;i<ml;i++)
		  {
			  System.out.print("-");
		  }
		  System.out.println(0);
		  for (int j = 1; j <= in; j++) {
			  int m=ml;
		      draw(m - 1);
		      for(int i=0;i<ml;i++)
			  {
				  System.out.print("-");
			  }
		      System.out.println(j);
		  }
	  }
  public static void draw(int ml) 
  {
    if (ml >= 1)
    {             
         draw(ml - 1);    
      for (int j = 0; j <ml; j++)
      {
          System.out.print("-");
      }
        System.out.print("\n");
          draw(ml- 1);    
    }
  }
}