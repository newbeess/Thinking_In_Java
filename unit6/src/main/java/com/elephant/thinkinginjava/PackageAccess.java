package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/12/29.
 */
import static com.elephant.util.Print.*;
public class PackageAccess {

	public String pb="iam public variable";
	protected String pt="iam protected variable";
	private String pv="iam private variable";
	String df="iam default variable,package access";
	public void iampublic(){
		print("In Package,public method");
	}
	protected void iamprotected(){
		print("In package,protected method");
	}
	private  void iamprivate(){
		print("In package,private method");
	}
	void iamdefault(){
		print("In package,default privilege,package access");
	}
}
