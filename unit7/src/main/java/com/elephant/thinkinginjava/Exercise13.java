package com.elephant.thinkinginjava;
import java.util.DoubleSummaryStatistics;

import static com.elephant.util.Print.*;
/**
 * Overloading one method in subclass which overload three times in superclass
 * And testing both of them works
 */
class BaseO{
	public void OverLoadingMethod(int i){
		print("Int Overloading");
	}
	public void OverLoadingMethod(char s){
		print("Char OverLoading");
	}
	public void OverLoadingMethod(Double d){
		print("Double OverLoading");
	}
}
class DerivedO extends BaseO{
	public void OverLoadingMethod(float f) {
		print("Float OverLoading");
	}
}
public class Exercise13 {
	public static void main(String[] args){
		DerivedO x=new DerivedO();
		x.OverLoadingMethod(1f);
		x.OverLoadingMethod(1d);
		x.OverLoadingMethod(1);
		x.OverLoadingMethod('1');
	}
}
