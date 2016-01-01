package com.elephant.thinkinginjava;

/**
 * Delegation
 */

public class SpaceShipDelegation {
	private String name;
	private SpaceShipControls controls=new SpaceShipControls();
	public SpaceShipDelegation(String name){this.name=name;}
	//Delegation methods
	public void back(int velocity){controls.back(velocity);}
	public void forward(int velocity){controls.forward(velocity);}
	public void left(int velocity){controls.left(velocity);}
	public void right(int velocity){controls.right(velocity);}
	public void up(int velocity){controls.up(velocity);}
	public void down(int velocity){controls.down(velocity);}
	public void turboBoost(){controls.turBoost();}
	public static void main(String[] args){
		SpaceShipDelegation protector=new SpaceShipDelegation("NSEA Protector");
		protector.back(100);
	}
}
