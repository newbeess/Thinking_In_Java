package com.elephant.thinkinginjava;

/**
 * use com.elephant.thinkinginjava.PackageAccess to verify
 * another compile unit verfing toghter is com.elephant.thinkinginjavapackage.Exercise4_1
 *
 */
import static com.elephant.util.Print.*;
public class Exercise4 {
	public static void main(String[] args){
		PackageAccess pa=new PackageAccess();
		print(pa.pb);
		print(pa.pt);
		print(pa.df);
		//! print(pa.pv);

		pa.iampublic();
		pa.iamprotected();
		pa.iamdefault();
		//! pa.iamprivate();

	}
}
