package pritampurabatch;
import java.util.*;
public class celcius {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int mf=sc.nextInt();
		int max=sc.nextInt();
		int st=sc.nextInt();
		while(mf<=max)
		{
			System.out.print(mf+" ");
			int c=(5*(mf-32))/9;
			System.out.println(c);
			mf=mf+st;
		}

	}

}
