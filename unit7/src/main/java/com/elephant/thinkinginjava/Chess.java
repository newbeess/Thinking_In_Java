package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
 * Created by elephant on 16/1/1.
 */
class Game{
	Game(int i){
		print("Game constructor");
	}
}
class BoardGame extends Game{
	BoardGame(int i){
		super(i);
		print("BoardGame constructor");
	}
}
public class Chess extends BoardGame{
	Chess(){
		super(11);
		print("Chess constructor");
	}
	public static void main(String[] args){
		Chess x=new Chess();
	}
}
