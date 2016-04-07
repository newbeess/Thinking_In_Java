package com.elephant.arrays;
import com.elephant.util.CountingGenerator;
import com.elephant.util.Generator;

/**
 * Created by elephant on 16/4/7.
 */
public class GeneratorTest {
	public static int size=10;
	public static void test(Class<?> surroundingClass){
		for (Class<?> type : surroundingClass.getClasses()){
			System.out.print(type.getSimpleName()+" ");
			try {
				Generator<?> g=(Generator<?>)type.newInstance();
				for (int i=0;i<size;i++)
					System.out.print(g.next()+" ");
				System.out.println();
			} catch (Exception e){
				throw new RuntimeException(e);
			}
		}
	}

	public static void main(String[] args){
		test(CountingGenerator.class);
	}

}
