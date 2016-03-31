package other.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsTest {

	ScheduledExecutorService excutor;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorsTest test = new ExecutorsTest();
		test.startt();
	}

	private void startt () {
		excutor = Executors.newSingleThreadScheduledExecutor();
		TaskA ta = new TaskA();
		excutor.scheduleAtFixedRate(ta, 0, 1, TimeUnit.SECONDS);
		
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		excutor.shutdown();
		excutor.shutdownNow();
	}
	
	
	class TaskA implements Runnable {
		public void run() {
			System.out.println("i=");
			try {
				Thread.currentThread().sleep(300000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
