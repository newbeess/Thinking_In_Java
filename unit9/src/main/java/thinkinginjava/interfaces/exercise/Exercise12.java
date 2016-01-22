package thinkinginjava.interfaces.exercise;

/**
 * Created by elephant on 16/1/22.
 */
interface CanFight{
	void fight();
}
interface CanSwim{
	void swim();
}
interface CanFly{
	void fly();
}
interface Canclimb{
	void climb();
}
class ActionCharacter{
	public void fight(){}
}
class Hero extends ActionCharacter implements CanFight,CanSwim,CanFly,Canclimb{
	public void swim(){}

	public void fly() {}

	public void climb() {}
}

public class Exercise12 {
	public static void t(CanFight x){x.fight();}
	public static void u(CanSwim x){x.swim();}
	public static void v(CanFly x){x.fly();}
	public static void s(Canclimb x){x.climb();}
	public static void w(ActionCharacter x){x.fight();}
	public static void main(String[] args){
		Hero h=new Hero();
		t(h);
		u(h);
		v(h);
		s(h);
		w(h);
	}
}

