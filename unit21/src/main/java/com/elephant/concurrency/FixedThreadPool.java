package com.elephant.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by elephant on 16/4/14.
 */
public class FixedThreadPool {
	public static void main(String[] args) {
		// Constructor argument is number of threads
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++)
			executorService.execute(new LiftOff());
		executorService.shutdown();
	}
}
