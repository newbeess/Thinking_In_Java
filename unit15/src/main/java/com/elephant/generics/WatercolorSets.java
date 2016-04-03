package com.elephant.generics;

import java.util.*;
import static com.elephant.util.Print.*;
import static com.elephant.util.Sets.*;
import static com.elephant.generics.watercolors.Watercolors.*;
import com.elephant.generics.watercolors.Watercolors;


/**
 * Created by elephant on 16/4/3.
 */
public class WatercolorSets {
	public static void main(String[] args){
		Set<Watercolors> set1=EnumSet.range(BRILLIANT_RED,VIRIDIAN_HUE);
		Set<Watercolors> set2=EnumSet.range(CERULEAN_BLUE_HUE,BURNT_UMBER);
		print(set1);
		print(set2);
		print("union(set1,set2): "+union(set1,set2));

		Set<Watercolors> subset=intersection(set1,set2);
		print("intersection(set1,set2): "+subset);
		print("difference(set1,set2): "+difference(set1,subset));
		print("difference(set1,set2): "+difference(set2,subset));
		print("difference(set1,set2): "+complement(set1,set2));

	}
}
