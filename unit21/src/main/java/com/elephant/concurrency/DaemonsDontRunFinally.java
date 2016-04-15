package com.elephant.concurrency;

import java.util.concurrent.*;

import static com.elephant.util.Print.*;

/**
 * Daemon threads don't run the finally clause
 */
class ADaemon implements Runnable {
	public void run() {
		try {
			print("Strating ADaemon");
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			print("Exiting via InterruptedException");
		} finally {
			print("This should always run?");
		}
	}
}

public class DaemonsDontRunFinally {
	public static void main(String[] args) throws Exception {
		Thread t = new Thread(new ADaemon());
		t.setDaemon(true);
		t.start();
	}
}
