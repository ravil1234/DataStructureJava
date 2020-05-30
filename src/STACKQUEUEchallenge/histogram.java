package STACKQUEUEchallenge;
import java.util.*;
public class histogram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         Stack<Integer> s=new Stack<>();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        int max=0;
        int area=0;
        int i=0;
        for(i=0;i<n;)
        {
        	if(s.isEmpty()||a[s.peek()]<=a[i])
        	{
        		s.push(i++);
        		
        	}
        	else
        	{
        		int top=s.pop();
        		if(s.isEmpty())
        		{
        			area=a[top]*i;
        		}
        		else
        		{
        			area=a[top]*(i-s.peek()-1);
        		}
        		if(max<area)
        		{
        			max=area;
        		}
        	}
        }
        while(!s.isEmpty())
        {
        	int top=s.pop();
    		if(s.isEmpty())
    		{
    			area=a[top]*i;
    		}
    		else
    		{
    			area=a[top]*(i-s.peek()-1);
    		}
    		if(max<area)
    		{
    			max=area;
    		}
    	 }
        System.out.println(max);
	}
}

/*
 * import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i < n;i++)
		    arr[i] = s.nextInt();
		    
    		Main mainobj = new Main();
    		StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
    		System.out.println(hist(arr, stack));
		}
	

	public static long hist(int[] arr, StacksUsingArrays stack) throws Exception {

	    //Write Your Code here
	    
	}

	private class StacksUsingArrays {
		private int[] data;
		private int tos;

		public static final int DEFAULT_CAPACITY = 10;

		public StacksUsingArrays() throws Exception {
			// TODO Auto-generated constructor stub
			this(DEFAULT_CAPACITY);
		}

		public StacksUsingArrays(int capacity) throws Exception {
			if (capacity <= 0) {
				System.out.println("Invalid Capacity");
			}
			this.data = new int[capacity];
			this.tos = -1;
		}

		public int size() {
			return this.tos + 1;
		}

		public boolean isEmpty() {
			if (this.size() == 0) {
				return true;
			} else {
				return false;
			}
		}

		public void push(int item) throws Exception {
			if (this.size() == this.data.length) {
				throw new Exception("Stack is Full");
			}
			this.tos++;
			this.data[this.tos] = item;
		}

		public int pop() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return retVal;
		}

		public int top() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			return retVal;
		}

		public void display() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			for (int i = this.tos; i >= 0; i--) {
				System.out.println(this.data[i]);
			}

		}

	}

}
 */