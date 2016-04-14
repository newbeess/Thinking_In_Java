package com.elephant.concurrency;

/**
 * Created by elephant on 16/4/14.
 */
public class MainThread {
	public static void main(String[] args){
		LiftOff launch = new LiftOff();
		launch.run();
	}
}
