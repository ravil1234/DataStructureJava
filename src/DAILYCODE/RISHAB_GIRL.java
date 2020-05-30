package DAILYCODE;
import java.util.*;
public class RISHAB_GIRL {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int c[]=new int[5];
	    int a[]=new int[5];
	    int k=-2;
	    for(int i=0;i<5;i++)
	    {
	    	c[i]=sc.nextInt();
	    	a[i]=k;
	    	k++;
	    }
	    int q=sc.nextInt();
	    while(q!=0)
	    {
	    	int n=sc.nextInt();
	    	int m=sc.nextInt();
	    	if(m<0)
	    	{
	    		
	    	}
	    	else if(m==0)
	    	{
	    		
	    	}
	    	else
	    	{
	    		
	    	}
	    	q--;
	    }
	

	}

}
/*#include<bits/stdc++.h>
#define Fast  std::ios::sync_with_stdio(false);  cin.tie(NULL);
#define pb  push_back
#define mp  make_pair
#define fi  first
#define se  second
#define all(x) x.begin(),x.end()
#define p pair<ll,ll>
#define pii pair<int,int>
#define mod (int)(1e9+7)
#define PI  (double)(3.14159265358979323846264338327950)
#define for(i,a,b) for(int i=a;i<b;i++)
using namespace std;
typedef long long ll;
int a[100005];
int r,g,b,y,w;
#define inf 100010010
int dp[102][411];

      int solve(int x,int yy)
    {
        if(x>100 || yy>200 || x<0 || yy<-200)
            return inf;

          if(x==0)
        {
            if(yy==0)
                return 0;
        }

            if(dp[x][yy+205]!=-1)
            return dp[x][yy+205];


dp[x][yy+205]=min(min(w+solve(x-1,yy-2),y+solve(x-1,yy-1)),min(min(g+solve(x-1,yy),b+solve(x-1,yy+1)),r+solve(x-1,yy+2)));

        return dp[x][yy+205];
    }
    int main()
    {
         Fast;
        ll Q,n,i,x,yy;

          for(i,0,102)
        {
            for(j,0,409)
                dp[i][j]=-1;
        }
        cin>>r>>b>>g>>y>>w;

        cin>>Q;

          while(Q--)
        {
            cin>>x>>yy;
            int ans=solve(x,yy);
            if(ans>=inf) 
             ans=-1;
            cout<<ans<<endl;
        }

        return 0;
    }*/