package com.elephant.thinkinginjava.exercises;
import static com.elephant.util.Print.*;
import java.util.*;

class Rodent{
	public void hop(){print("Rodent hopping");}
	public void scurry(){print("Rodent scurrying");}
	public void reproduce(){print("Making more Rodents");}
	public String toString(){return "Rodent";}
}
class Mouse extends Rodent{
	public void hop(){print("Mouse hopping");}
	public void scurry(){print("Mouse scurrying");}
	public void reproduce(){print("Making more Mice");}
	public String toString(){return "Mouse";}
}
class Hamster extends Rodent{
	public void hop(){print("Hamster hopping");}
	public void scurry(){print("Hamster scurrying");}
	public void reproduce(){print("Making more Hamsters");}
	public String toString(){return "Hamster";}
}
public class Exercise10 {
	public static void main(String[] args){
		ArrayList<Rodent> rodents=new ArrayList<Rodent>(Arrays.asList(new Rodent(),new Mouse(),new Hamster()));
		for (Iterator<Rodent> it=rodents.iterator();it.hasNext();){
			Rodent r=it.next();
			r.hop();
			r.scurry();
			r.reproduce();
			print(r);
		}
	}
}
