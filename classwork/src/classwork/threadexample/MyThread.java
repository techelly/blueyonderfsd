package classwork.threadexample;

public class MyThread implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Inside MyThread run method");
	}

}
