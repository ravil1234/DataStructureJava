package computer_networklab;
import java.util.*;
public class columnar
{
     static Scanner sc=new Scanner(System.in);
    public static void main(String args[]) {
    	System.out.println("Name: MOHAMMAD RAVIL");
		System.out.println("Roll: 17BCS027");
		System.out.println("Program:COLUMNAR TRANPOSITION");
		System.out.println("#Enter Message: ");
        String str=sc.nextLine();
        System.out.println("#Enter Key: ");
        String key=sc.next();
        char a[][]=new char[10][10];
        int k=0;
         for(int i=0;i<key.length();i++)
         {
            char ch=key.charAt(i);
             a[0][k]=ch;
             k++;
         }
         System.out.println();
         int j=0;
         int m=1;
         for(int i=0;i<str.length();i++)
         {
            char ch1=str.charAt(i);
            if(j<k)
            {
             a[m][j]=ch1;
             j++;
            }
            else
            {
                m++;
                j=0;
                a[m][j]=ch1;
                j++;
            // System.out.println();
            }
         }
        while(j<k)
        {
            a[m][j]='$';
            j++;
        }
        for(j=0;j<=m;j++)
        {
            for(int s=0;s<k;s++)
            {
                System.out.print(a[j][s]+" ");

            }
            System.out.println();
        }
         char temp[] = key.toCharArray(); 
         Arrays.sort(temp);
         String s1="";
         System.out.println("#Encrypted Message:-");
        for(int i=0;i<temp.length;i++)
        {
            for(int c=0;c<k;c++)
            {
                if(temp[i]==a[0][c])
                {
                      for(int s=1;s<=m;s++)
                     {
                            s1=s1+a[s][c];
                            System.out.print(a[s][c]);
                   }
                }
            }
        }
        System.out.println();
       decrypt(s1,m);
    }
    public static void decrypt(String s,int m)
    {
    	System.out.println("#Enter Key: ");
        String key=sc.next();
        int k=0;
        char a[][]=new char[10][10];
         for(int i=0;i<key.length();i++)
         {
            char ch=key.charAt(i);
             a[0][k]=ch;
             k++;
         }
         char temp[] = key.toCharArray(); 
         Arrays.sort(temp);
         int l=0;
         for(int i=0;i<temp.length;i++)
         {
             for(int j=0;j<k;j++)
             {
             if(temp[i]==a[0][j])
             {
                 for(int p=1;p<=m;p++)
                 {
                     a[p][j]=s.charAt(l);
                     l++;
                 }
             }
             }
         }
         System.out.println("#Decrypted Message:-");
         for(int i=1;i<=m;i++)
         {
             for(int j=0;j<k;j++)
             {
                 if(a[i][j]!='$')
                 System.out.print(a[i][j]);
             }
         }
         
         
    }
}