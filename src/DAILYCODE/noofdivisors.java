package DAILYCODE;
import java.util.*;
public class noofdivisors {
	  
	    final static int MAX = 10000002; 
	  
	    static int prime[] = new int[MAX]; 
	    static int prime_count[] = new int[MAX]; 
	    static void sieve() { 
	        Arrays.fill(prime, 0, MAX, 0); 
	        prime[0] = prime[1] = 1; 
	        for (int i = 2; i * i < MAX; i++) { 
	            if (prime[i] == 0) { 
	                for (int j = i * 2; j < MAX; j += i) { 
	                    if (prime[j] == 0) { 
	                        prime[j] = i; 
	                    } 
	                } 
	            } 
	        } 
	        for (int i = 2; i < MAX; i++) {  
	            if (prime[i] == 0) { 
	                prime[i] = i; 
	            } 
	        } 
	    } 
	    static long numberOfDivisorsOfProduct(int[] arr, 
	            int n) { 
	        Arrays.fill(prime_count, 0, MAX, 0); 
	  
	        for (int i = 0; i < n; i++) { 
	            int temp = arr[i]; 
	            while (temp != 1) { 
	                prime_count[prime[temp]]++; 
	                temp = temp / prime[temp]; 
	            } 
	        } 
	  
	        long ans = 1; 
	        for (int i = 2; i < MAX; i++) { 
	            ans = ans * (prime_count[i] + 1); 
	        } 
	  
	        return ans; 
	    } 
	  
	// Driver code 
	    public static void main(String[] args) { 
	        sieve(); 
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t!=0)
	        {
	        int n=sc.nextInt();
	        int arr[] =new int[n]; 
	        for(int i=0;i<n;i++)
	        {
	        	arr[i]=sc.nextInt();
	        }
	        System.out.println(numberOfDivisorsOfProduct(arr, n)); 
	        t--;
	        }
	  
	    } 
	}  
