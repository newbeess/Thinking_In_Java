package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
  * Composition with public objects.
 */
class Engine{
	public void start(){print("Engine.start()");}
	public void rev(){print("Engine.rev()");}
	public void stop(){print("Engine.stop()");}
	public void service(){print("Engine.service()");}
}
class Wheel{
	public void inflate(int psi){print("Wheel.inflate()");}
}
class Window{
	public void rollup(){print("Window.rollup()");}
	public void rolldown(){print("Window.rolldown()");}
}
class Door{
	public Window window=new Window();
	public void open(){print("Window.open()");}
	public void close(){print("Window.close()");}
}
public class Car {
	public Engine engine=new Engine();
	public Wheel[] wheel=new Wheel[4];
	public Door
		left=new Door(),
		right=new Door();
	public Car(){
		for(int i=0;i<4;i++)
			wheel[i]=new Wheel();
	}

	public static void main(String[] args){
		Car car=new Car();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
		car.engine.service();
	}
}
