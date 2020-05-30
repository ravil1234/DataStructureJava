import java.util.concurrent.ThreadLocalRandom;
public class random
{
	public static void main(String[] args) {
		Runnable runnable = new MyRunnable();

		for (int i = 0; i < 30; i++) {
			Thread t = new Thread(runnable);
			//t.setName("MyRunnable-Thread-" + i);
			//System.out.println(i);
			t.start();
		}
	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
	System.out.println(threadName);
	  //System.out.println(threadName + "::" + ThreadLocalRandom.current().nextInt());
	}

}