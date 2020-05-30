public class testp extends Thread
{
public void run()
{
	System.out.println("thread name:"+Thread.currentThread().getName());
	System.out.println("thrwead priority"+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testp t1=new testp();
		testp t2=new testp();
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
	}

}
