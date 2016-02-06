package com.elephant.innerclasses.second;

import com.elephant.innerclasses.first.FirstInterface;

/**
 * Created by elephant on 16/2/3.
 */
public class Second {
	//Inner class implements first
	protected class UpOnFirst implements FirstInterface{
		public String first() {
			return "senond";
		}
	}
	public UpOnFirst get(){return new UpOnFirst();}
}
