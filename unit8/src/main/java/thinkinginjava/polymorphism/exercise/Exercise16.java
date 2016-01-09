package thinkinginjava.polymorphism.exercise;
import static com.elephant.util.Print.*;

/**
 * Following the example in Transmogrify.java
 * create a Starship class containing an AlertStatus reference that can indicate three different states.
 * Include methods to change the state
 */


class AlertStatus{
	public String getStatus(){
		return "None";
	}
}
class RedAlertStatus extends AlertStatus{
	@Override
	public String getStatus() {
		return "Red";
	}
}
class YelloAlertStatus extends AlertStatus{
	@Override
	public String getStatus() {
		return "Yello";
	}
}
class GreenAlertStatus extends AlertStatus{
	@Override
	public String getStatus() {
		return "Green";
	}
}

class Starship{
	private AlertStatus status=new YelloAlertStatus();
	public void setStatus(AlertStatus alertStatus){
		status=alertStatus;
	}

	@Override
	public String toString() {
		return status.getStatus();
	}
}
public class Exercise16 {
	public static void main(String[] args){
		Starship starship=new Starship();
		print(starship);
		starship.setStatus(new RedAlertStatus());
		print(starship);
		starship.setStatus(new GreenAlertStatus());
		print(starship);
	}
}
