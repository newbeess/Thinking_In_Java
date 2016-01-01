package com.elephant.thinkinginjava;

/**
 * Created by elephant on 16/1/1.
 */
public class SpaceShip extends SpaceShipControls{
	private String name;
	public SpaceShip(String name){this.name=name;}
	public String toString(){return name;}
	public static void main(String[] args){
		SpaceShip protector=new SpaceShip("NSEA protector");
		protector.forward(100);
	}
}
