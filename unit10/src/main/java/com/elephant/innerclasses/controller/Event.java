package com.elephant.innerclasses.controller;
import static com.elephant.util.Print.*;
/**
 * 	The common methods for any control event
 */


public abstract class Event {

	private long eventTime;
	protected final long delayTime;

	public Event(long delayTime){
		this.delayTime=delayTime;
		start();
	}

	public void start(){
		eventTime=System.nanoTime()+delayTime;
	}

	public boolean ready(){
		return System.nanoTime()>=eventTime;}

	public abstract void action();

	public static void main(String[] args){
		long start=System.nanoTime();
		long time1=System.currentTimeMillis();
		System.out.println(time1/1000/60/60/24/365+1970);
		System.out.println((System.nanoTime()-start)/1000000.0);
	}

}
