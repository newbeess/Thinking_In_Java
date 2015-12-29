package com.elephant.thinkinginjavapackage;

/**
 * Verify protected method only has package access
 */
import com.elephant.thinkinginjava.PackageAccess;
import static com.elephant.util.Print.*;
public class Exercise4_1 {
	public static void main(String[] args){
		PackageAccess pa=new PackageAccess();

		print(pa.pb);
		//! print(pa.pt);
		//! print(pa.pv);
		//! print(pa.df);
		
		pa.iampublic();
		//! pa.iamprotected();
		//! pa.iamprivate();
		//! pa.iamdefault();
	}
}
