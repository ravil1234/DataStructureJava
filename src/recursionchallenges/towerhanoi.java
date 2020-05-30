package recursionchallenges;
import java.util.*;
public class towerhanoi {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	tower(n,"1","3","2");
	System.out.println((int)Math.pow(2, n)-1);
	}
 
public static void tower(int n,String src,String dest,String help)
   {
	if(n==0)
	{
		return;
	}
	tower(n-1,src,help,dest);
	System.out.println("Move "+ n +"th disc from "+src +" to "+ dest);
	tower(n-1,help,dest,src);
   }
}
/*
Moving ring 1 from A to C
Moving ring 2 from A to B
Moving ring 1 from C to B
Moving ring 3 from A to C
Moving ring 1 from B to A
Moving ring 2 from B to C
Moving ring 1 from A to C
Moving ring 4 from A to B
Moving ring 1 from C to B
Moving ring 2 from C to A
Moving ring 1 from B to A
Moving ring 3 from C to B
Moving ring 1 from A to C
Moving ring 2 from A to B
Moving ring 1 from C to B

Move 1th disc from T1 to T3
Move 2th disc from T1 to T2
Move 1th disc from T3 to T2
3
*/