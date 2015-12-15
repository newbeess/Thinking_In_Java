package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/12/15.
 * verify the confilt about import two packages while both have describe function
 */

import com.elephant.conflict.Exercise1_1;
//import com.elephant.thinkinginjavapackage.Exercise1_1;

public class Exercise2 {
	public static void main(String[] args){
		Exercise1_1 conflict=new Exercise1_1();
		conflict.describe();
	}
}
