package com.elephant.concurrency;

import java.util.concurrent.*;

/**
 * Calling sleep() to pause for a while
 */
public class SleepingTask extends LiftOff {
	public void run() {
		try {
			while (countDown-- > 0) {
				System.out.print(status());
				// Old-style
				// Thread sleep(100)
				// Java SE5/6-style
				TimeUnit.MILLISECONDS.sleep(100);
			}
		} catch (InterruptedException e) {
			System.err.println(e);
		}
	}

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++)
			executorService.execute(new SleepingTask());
		executorService.shutdown();
	}
}
