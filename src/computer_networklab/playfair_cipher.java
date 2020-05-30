package computer_networklab;
import java.util.*;
public class playfair_cipher {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Name: MOHAMMAD RAVIL");
		System.out.println("Roll: 17BCS027");
		System.out.println("Program: play fair cipher");
		System.out.println("#Enter Message: ");
        String s=sc.nextLine();
        System.out.println("#Enter Key: ");
        String key=sc.next();
        System.out.println("Encrypted Message:-");
        String dec=encrypt(s,key,true);
        System.out.println(dec);
        System.out.println("#Enter Key: ");
        key=sc.next();
        System.out.println("Decrypted Message:-");
         System.out.println(encrypt(dec,key,false));
    }
        public static String encrypt(String s,String key,boolean d)
        {
        char a[][]=new char[5][5];
        char b[]=new char[26];
            char ch='A';
        for(int i=0;i<26;i++)
        {
            b[i]=ch;
            ch++;
        }
        for(int i=0;i<key.length();i++)
        {
            char ch2=key.charAt(i);
            for(int j=0;j<b.length;j++)
            {
                if(ch2==b[j])
                {
                     b[j]='0';
                   break;
                }
            }
        }
        int m=0,n=0;
        for(int i=0;i<key.length();i++)
        {
             char ch3=key.charAt(i);
             a[m][n]=ch3;
             if(n==4)
             {
               n=0;
               m++;
             }
             else
             n++;
        }
        if(n==4)
        {
        	n=0;
        	m++;
        }
        
        for(int i=0;i<b.length;i++)
        {
            if(b[i]!='0'&&b[i]!='J')
            {
            	if(m==5)
            	   break;
              a[m][n]=b[i];
            if(n==4)
            {
                n=0;
                m++;
            }
            else
            n++;
        }
    }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
      if(s.length()%2!=0)
      {
    	  s+='Z';
      }
      System.out.println(s);
    String res="";
    for(int i=0;i<s.length();i+=2)
    {
    	char ch1=s.charAt(i);
    	char ch2=s.charAt(i+1);
    	    int row1=0,row2=0,col1=0,col2=0;
    	    int both=0;
    	    for(int l=0;l<5;l++)
    	    {
    	    	for(int j=0;j<5;j++)
    	    	{
    	    		if(a[l][j]==ch1)
    	    		{
    	    			row1=l;
    	    			col1=j;
    	    			both++;
    	    		}
    	    		if(a[l][j]==ch2)
    	    		{
    	    			row2=l;
    	    		    col2=j;
    	    		    both++;
    	    		}
    	    	}
    	    	if(both==2)
	    			break;
    	    }
    	    if(d)
    	    {
    	    if(row1==row2&&col1!=col2)
    	    {
    	    	col1+=1;
    	    	col2+=1;
    	    	col1=col1%5;
    	    	col2=col2%5;
    	    	char cl1=a[row1][col1];
    	    	char cl2=a[row2][col2];
    	    	res=res+cl1+cl2;
    	    }
    	    else if(col1==col2&&row1!=row2)
    	    {
    	    	row1+=1;
    	    	row2+=1;
    	    	row1=row1%5;
    	    	row2=row2%5;
    	    	char cl1=a[row1][col1];
    	    	char cl2=a[row2][col2];
    	    	res=res+cl1+cl2;
    	    }
    	    else
    	    {
    	    	char cl1=a[row1][col2];
    	    	char cl2=a[row2][col1];
    	    	res=res+cl1+cl2;
    	    }
    	    }
    	    else
    	    {
    	    if(row1==row2&&col1!=col2)
    	    {
    	    	if(col1==0)
    	    	{
    	    		col1=4;
    	    	}
    	    	else
    	    		col1-=1;
    	    	if(col2==0)
    	    		col2=4;
    	    	else
    	    		col2-=1;
    	    	char cl1=a[row1][col1];
    	    	char cl2=a[row2][col2];
    	    	res=res+cl1+cl2;
    	    }
    	    else if(col1==col2&&row1!=row2)
    	    {
    	    	if(row1==0)
    	    	{
    	    		row1=4;
    	    	}
    	    	else
    	    		row1-=1;
    	    	if(row2==0)
    	    		row2=4;
    	    	else
    	    		row2-=1;
    	    	char cl1=a[row1][col1];
    	    	char cl2=a[row2][col2];
    	    	res=res+cl1+cl2;
    	    	
    	    }
    	    else
    	    {
    	    	char cl1=a[row1][col2];
    	    	char cl2=a[row2][col1];
    	    	res=res+cl1+cl2;
    	    }
    	    }
       }
     return res;
  }
}
