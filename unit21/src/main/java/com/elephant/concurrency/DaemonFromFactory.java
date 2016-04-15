package com.elephant.concurrency;

import java.util.concurrent.*;

import com.elephant.util.*;

import static com.elephant.util.Print.*;

/**
 * Using a Thread Factory to create daemons
 */
public class DaemonFromFactory implements Runnable {
	public void run() {
		try {
			while (true){
				TimeUnit.MILLISECONDS.sleep(100);
				print(Thread.currentThread()+" "+this);
			}
		}catch (InterruptedException e){
			print("Interrupted");
		}
	}

	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newCachedThreadPool(new DaemonThreadFactory());
		for (int i = 0; i < 10; i++)
			executorService.execute(new DaemonFromFactory());
		print("All daemons started");

		TimeUnit.MILLISECONDS.sleep(500);
	}
}
