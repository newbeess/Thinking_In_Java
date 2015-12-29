package access.connection2;

/**
 * Created by elephant on 15/12/29.
 */
public class Connection {
	private static int counter=0;
	private  int id=counter++;
	Connection(){}
	public String toString(){
		return "Connection"+id;
	}
	public void doSomething(){}

	/**
	 * call ConnectionManager.checkIn()
	 */
	public void checkIn(){
		ConnectionManager.checkIn(this);
	}
}
