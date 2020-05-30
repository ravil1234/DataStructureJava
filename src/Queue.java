import java.util.*;
class Queue {

	static Scanner scn = new Scanner(System.in);

	protected int size;
	
	protected int front;
	
	protected int[] data;

	public Queue() {
		this.size = 0;
		this.front = 0;
		this.data = new int[5];
	}

	public Queue(int cap) {
		this.size = 0;
		this.front = 0;
		this.data = new int[cap];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}
	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] oa = this.data;
			int[] na = new int[oa.length * 2];
			for (int i = 0; i < this.size(); i++) {
				int idx = (i + front) % oa.length;
				na[i] = oa[idx];
			}

			this.data = na;
			this.front = 0;
		}

		// if (this.size == this.data.length) {
		// throw new Exception("queue is full");
		// }

		this.data[(front + size) % this.data.length] = item;
		size++;

	}

	public int dequeue() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");

		}

		int rv = this.data[front];
		front = (front + 1) % this.data.length;
		size--;

		return rv;

	}

	public int getFront() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");
		}

		int rv = this.data[front];

		return rv;
	}

	public void display() {
		System.out.println();
		for (int i = 0; i < size; i++) {
			int idx = (i + front) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
        System.out.print("END");
	}

	
    public static void hoodies(int q) throws Exception
	{ 
        int a[]=new int[10000];
        int b[]=new int[4];
        Arrays.fill(a,-1);
        Arrays.fill(b,0);
        Queue Q[]=new Queue[4];
        int j=0;
        for(int i=0;i<4;i++)
        {
        	Q[i]=new Queue();
        }
        int i=0;
		while(q!=0)
		{
			char ch=scn.next().charAt(0);
			if(ch=='E')
			{
				int p=scn.nextInt();
			    int x=scn.nextInt();
			    if(b[p-1]>0)
			    {
			      Q[p-1].enqueue(x);
			    }
			    else
			    {
			    	b[p-1]=1;
			    	a[i]=p-1;
			    	Q[p-1].enqueue(x);
			    	i++;
			    }
			}
			else
			{
               for(int k=j;k<i;k++)
               {
            	   if(!Q[a[k]].isEmpty())
            	   {
            		   System.out.print(a[k]+1+" "+Q[a[k]].dequeue());
            		   if(Q[a[k]].isEmpty())
					   {
						   b[a[k]]=0;
						   j++;
					   }
					   break;
            	   }
               }	   
			}
			q--;	
			}
		}
	public static void main(String[] args) throws Exception {
		
        int n = scn.nextInt();
        hoodies(n);
	}

}
