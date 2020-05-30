package pritampurabatch;
import java.util.*;
public class shopping_game {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		int m=sc.nextInt();
		int n=sc.nextInt();
		int i=1;
		while(true){
			m-=i;
			if(m<0){
				System.out.println("Harshit");
				break;
			}
			i++;
			n-=i;
			if(n<0){
				System.out.println("Aayush");
				break;
			}
			i++;
		}
		t--;
	  }
	}
}
