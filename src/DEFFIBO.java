
public class DEFFIBO
{
public static long fib(long n)
 {
   long f[] = new long[1000000000];
   int  i;
   f[0] = 0;
   f[1] = 1;

   for (i = 2; i <= n; i++)
   {
       f[i] = f[i-1] + f[i-2];
    }

    return f[(int)n];
  }

public static void main (String args[])
    {
       long n = 1000000;
       System.out.println(fib(n));
    }
}
