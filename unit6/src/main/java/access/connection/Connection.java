package access.connection;


public class Connection {
	private static int counter=0;
	private  int id=counter++;
	Connection(){}
	/**
	 * @overide from java.objects,
	 * Automaticlly called when use print(object)
	 *
	 */
	public String toString(){
		return "Connection"+id;
	}

	public void doSomething(){}
}
