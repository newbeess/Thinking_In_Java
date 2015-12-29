package access.connection;

/**
 * Manage pool[10],counter count how many Connection being used
 * getConnection return Connection Object.
 *
 */

public class ConnectionManager {
	private static Connection[] pool =new Connection[10];
	private static int counter=0;
	static {
		for(int i=0;i<pool.length;i++)
			pool[i]=new Connection();
	}
	public static Connection getConnection(){
		if(counter<pool.length)
			return pool[counter++];
		return null;
	}
}
