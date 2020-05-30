import java.util.*;
public class isa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=sieveOfEratosthenes(n+1);
		System.out.println(c-1);
		
	}
	public static int  sieveOfEratosthenes(int n) 
    { 
        boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        { 
            // If prime[p] is not changed, then it is a prime 
            if(prime[p] == true) 
            { 
                // Update all multiples of p 
                for(int i = p*2; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
          
        // Print all prime numbers 
        int count=0;
        for(int i = 2; i <= n; i++) 
        { 
            if(prime[i] == true) 
            	count++;
               // System.out.print(i + " "); 
        }
        return count;
    } 
	
}
