package algojava;
import java.util.*;
public class testganesha {
    public static void main(String args[]) {

Scanner s=new Scanner(System.in);
System.out.println(" ");
int N=s.nextInt();

System.out.print("*");
for(int i=1;i<N/2;i++)
System.out.print(" ");
for(int i=0;i<=N/2;i++)
System.out.print("*");
System.out.println(" ");

for(int j=1;j<N/2;j++)
{System.out.print("*");
for(int i=1;i<N/2;i++)
System.out.print(" ");

System.out.print("*");

System.out.println(" ");
}

for(int j=0;j<N;j++)
System.out.print("*");
System.out.println(" ");

for(int j=1;j<N/2;j++)
{
for(int i=0;i<N/2;i++)
System.out.print(" ");	
	
System.out.print("*");
for(int i=1;i<N/2;i++)
System.out.print(" ");

System.out.print("*");

System.out.println(" ");
}

for(int i=0;i<=N/2;i++)
System.out.print("*");
for(int i=1;i<N/2;i++)
System.out.print(" ");

System.out.print("*");
System.out.println(" ");

    }
}
