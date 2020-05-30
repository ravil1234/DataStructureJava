package DAILYCODE;
import java.util.*;
public class sublist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		ArrayList<Integer> s1=new ArrayList<>();
		ArrayList<Integer> s2=new ArrayList<>();
		int i=1;
		while(true)
		{
			int m=sc.nextInt();
			if(m==-1)
				break;
			if(i%2!=0)
				s1.add(m);
			else
				s2.add(m);
			i++;
		}
		if(i==1)
		{
			System.out.println();
			System.out.println();
			
		}
		for(int j=s1.size()-1;j>=0;j--)
		{
			int k=s1.get(j);
			System.out.print(k+" ");
		}
        System.out.println();
        for(int j=s2.size()-1;j>=0;j--)
		{
			int k=s2.get(j);
			System.out.print(k+" ");
		}
        System.out.println();
        t--;
		}
	}

}
