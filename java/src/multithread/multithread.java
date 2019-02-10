package multithread;

public class multithread extends Thread {
	private String threadName;

	multithread(String name) {
		threadName = name;
	}

	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 1; i < 5; i++) {
				System.out.println("Active thread: " + threadName + ", " + "executeing: " + i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public static void main(String[] args) {
		multithread t1 = new multithread("thread1");
		t1.start();
		multithread t2 = new multithread("thread2");
		t2.start();
	}

}
