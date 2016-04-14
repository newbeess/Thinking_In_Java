package com.elephant.concurrency;

import java.util.concurrent.*;

/**
 * Created by elephant on 16/4/14.
 */
public class CachedThreadPool {
	public static void main(String[] args) {
		Executor executor = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++)
			executor.execute(new LiftOff());
	}
}
