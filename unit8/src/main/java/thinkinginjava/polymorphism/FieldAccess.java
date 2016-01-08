package thinkinginjava.polymorphism;
import static com.elephant.util.Print.*;
/**
 * Direct field access is determined at compile time
 */
class Super{
	public int field=0;
	public int getField(){
		return field;
	}
}
class Sub extends Super{
	public int field=1;
	@Override
	public int getField() {
		return field;
	}
	public int getSuperField(){
		return super.field;
	}
}

public class FieldAccess {
	public static void main(String[] args){
		Super sup=new Sub(); //Upcast
		print("sup.field= "+sup.field+",sup.getField()="+sup.getField());
		Sub sub=new Sub();
		print("sub.field="+sub.field+",sub.getField()="+sub.getField()+",sub.getSuperField()="+sub.getSuperField());
	}
}
