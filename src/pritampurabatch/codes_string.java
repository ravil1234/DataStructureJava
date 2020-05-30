package pritampurabatch;
import java.util.*;
public class codes_string {
	static ArrayList<String> res=new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char a[]=new char[27];
		char ch='a';
		for(int i=1;i<27;i++)
		{
			a[i]=ch;
			ch++;
		}
		codes(str,"",0,a);
		System.out.println(res);
	}
public static void codes(String str,String ans,int i,char a[])
{
	
    if(i==str.length())
    {
    	res.add(ans);
    	return;
    }
     char ch=str.charAt(i);
     String s="";
     if(i+1<str.length())
     {
    	  s=str.substring(i,i+2);
     }
     else
    	 s=s+ch;
     int c=Character.getNumericValue(ch);
  codes(str,ans+a[c],i+1,a);
     int l=Integer.parseInt(s);
     if(l>9&&l<27)
     {
    	 codes(str,ans+a[l],i+2,a);
     }
    
  }
}
/*
int main() {
  char num[10];
  char outt[10];
  cin>>num;
  int len=strlen(num);
  print(num,outt,0,0,len);
	return 0;
}


void print(char* in,char* out,int i,int j,int length)
{
  if(in[i]=='\0'){
    out[j]='\0';
    cout<<out<<endl;
    return;
  }
  int sdigit=in[i]-'0';
  int ddigit;
  if(i+1<length)
  {
  //string str=in.substr(i,i+1);
  ddigit=(in[i]-'0')*10+(in[i+1]-'0');
  }
  else
  ddigit=sdigit;
    out[j]=sdigit+64;
    print(in,out,i+1,j+1,length);
    if(ddigit>9&&ddigit<=26){
      out[j]=ddigit+64;
      print(in,out,i+2,j+1,length);
    }
}*/