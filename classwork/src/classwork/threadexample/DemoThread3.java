package classwork.threadexample;

public class DemoThread3 implements Runnable {
	String tname;
	Thread t;

	DemoThread3(String thread_name) {
		tname = thread_name;
		t = new Thread(this, tname);
		System.out.println("Just created Thread: " + t);
		//t.start();
		t.run();
	}

	public void run() {
		try {
			for (int z = 5; z > 0; z--) {
				System.out.println("kid Thread: " + z);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(tname + "is Interrupted");
		}
		System.out.println(tname + "is dying");
	}
}
