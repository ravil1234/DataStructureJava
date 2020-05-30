package algojava;
import java.util.*;
public class celcius {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int N=sc.nextInt();
        int min=Integer.MIN_VALUE;
        int k=0,i=0,s,j;
       for(i=0;i<N;i++)
       {
           s=sc.nextInt();
           Math.abs(s);
           if(min<s)
           {
               min=s;
               k++;
           }
           else
        {
            min=s;
            break;
        }
    }
    for(j=i+1;j<N;j++)
    {
        s=sc.nextInt();
        Math.abs(s);
        if(min>s)
        {
            min=s;
            k++;
        }
        else
        break;
    }
    
       if(k==N)
       System.out.println(" true");
       else
       System.out.println("false");
    }
}