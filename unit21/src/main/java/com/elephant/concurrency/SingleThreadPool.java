package com.elephant.concurrency;

import java.util.concurrent.*;

/**
 * Created by elephant on 16/4/15.
 */
public class SingleThreadPool {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++)
			executorService.execute(new LiftOff());
		executorService.shutdown();
	}
}
