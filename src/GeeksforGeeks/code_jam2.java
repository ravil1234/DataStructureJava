package GeeksforGeeks;
import java.util.*;
public class code_jam2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    int t1=1;
	    while(t1<=t)
	    {
	    	String s=sc.next();
	    	char ch=s.charAt(0);
	    	String str=""+ch;
	    	String res="";
	    	for(int i=1;i<s.length();i++)
	    	{
	           if(ch==1)
	        	   
	        }
	     System.out.println("Case #"+t1+": "+res);
	     t1++;
	    }
	}
}
/*
  #include<bits/stdc++.h>
using namespace std;

int a[1001][1001];

int main()
{
    int t;
    cin>>t;
    int t1=t;
    int q = 1;
    while(t--){
        int n;
        //cin>>n;
		string s;
		cin>>s;
		n = s.length();
		int c = 0;
		string str = "";
		for(int i=0;i<n;++i){
			int v = s[i] - '0';
			if(c==v){
				str += s[i];
			}
			else if(c<v){
				while(c!=v){
					str += '(';
					++c;
				}
				str += s[i];
			}
			else{
				while(c!=v){
					str += ')';
					--c;
				}
				
				str += s[i];
			}
		}
		while(c>0){
					str += ')';
					--c;
				}
		cout<<"Case #"<<q<<": "<<str<<endl;
		++q;
    }
    return 0;
}
 */