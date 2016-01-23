package thinkinginjava.interfaces;

import java.util.*;

/**
 * 	Initializing interface fields with non-constant initializers
 */

public interface RandVals {
	Random rand=new Random(47);
	int RANDOM_INT=rand.nextInt(10);
	long RANDOM_LONG=rand.nextLong()*10;
	float RANDOM_FLOAT=rand.nextFloat()*10;
	double RANDOM_DOUBLE=rand.nextDouble()*10;
}
