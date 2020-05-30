import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t > 0)
        {
            int n = s.nextInt();
            String[] arr = new String[n];
            int i = 0;
            while(i < n)
            {
                arr[i] = s.next();
                i++;
            }
            for (i = 0; i < arr.length - 1; i++ )
            {   
                for (int j = i + 1; j < arr.length ;j++ )
                {
                    long sum1 = Long.parseLong(arr[i]+arr[j]);
                    long sum2 = Long.parseLong(arr[j]+arr[i]);
                    if(sum2 > sum1)
                    {
                        String temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                } 
            }
            String sum = "";
            for(String val : arr)
            {
                sum += val; 
            }
            
            System.out.println(sum);
            
            t--;
        }
    }
}