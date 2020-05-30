package aug_challenge;
import java.util.*;
public class pointint {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			int q=sc.nextInt();
			long a[]=new long[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextLong();
			}
			while(q!=0)
			{
				long x1=sc.nextLong();
				long x2=sc.nextLong();
				long y=sc.nextLong();
				Point p1=new Point(x1,y);
				Point p2=new Point(x2,y);
				int count=0;
				for(int i=1;i<n;i++)
				{
					Point q1=new Point(i,a[i-1]);
					Point q2=new Point(i+1,a[i]);
					if((p1.x==q2.x&&p1.y==q2.y)&&(p2.x!=q1.x&&p2.y!=q1.y)
							||(p2.x==q1.x&&p2.y==q1.y)&&(p1.x!=q2.x&&p1.y!=q2.y))
					{
						continue;
					}
				  if(doIntersect(p1,p2,q1,q2))
				    count++;
				  
				}
				System.out.println(count);
				q--;
			}
			t--;
		}
		

	}
 static class Point 
{ 
    long x; 
    long y; 
  
        Point(long x, long y)  
        { 
            this.x = x; 
            this.y = y; 
        } 
      
} 
static boolean onSegment(Point p, Point q, Point r) 
{ 
    if (q.x <= Math.max(p.x, r.x) && q.x >= Math.min(p.x, r.x) && 
        q.y <= Math.max(p.y, r.y) && q.y >= Math.min(p.y, r.y)) 
    return true; 
  
    return false; 
} 
static long orientation(Point p, Point q, Point r) 
{ 
    long val = (q.y - p.y) * (r.x - q.x) - 
            (q.x - p.x) * (r.y - q.y); 
  
    if (val == 0) return 0; 
  
    return (val > 0)? 1: 2; 
} 
static boolean doIntersect(Point p1, Point q1, Point p2, Point q2) 
{ 
    long o1 = orientation(p1, q1, p2); 
    long o2 = orientation(p1, q1, q2); 
    long o3 = orientation(p2, q2, p1); 
    long o4 = orientation(p2, q2, q1); 
    if (o1 != o2 && o3 != o4) 
        return true; 
    if (o1 == 0 && onSegment(p1, p2, q1)) 
    	return true; 
    if (o2 == 0 && onSegment(p1, q2, q1)) 
    	return true; 
    if (o3 == 0 && onSegment(p2, p1, q2)) 
    	return true; 
    if (o4 == 0 && onSegment(p2, q1, q2)) 
    	return true; 
  
    return false;  
} 


}
