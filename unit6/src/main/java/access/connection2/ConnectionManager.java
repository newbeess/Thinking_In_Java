package access.connection2;
import static com.elephant.util.Print.*;
/**
 *
 */

public class ConnectionManager {
	private static Connection[] pool = new Connection[10];

	static {
		for (int i = 0; i < pool.length; i++)
			pool[i] = new Connection();
	}

	/**
	 *	Return the  available Connection
	 *	By find the first not null Connection from 0 to pool.length
	 */
	public static Connection getConnection() {
		for (int i = 0; i < pool.length; i++) {
			if (pool[i] != null) {
				Connection c = pool[i];
				pool[i] = null;    //indicate in use
				return c;
			}
		}
		return null;
	}

	/**
	 * Find the first null Connection from 0 to pool.length
	 * then give Connection c to it
	 *
	 */
	public static void checkIn(Connection c){
		for (int i=0;i<pool.length;i++){
			if(pool[i]==null){
				pool[i]=c;
				return;
			}
		}
	}
}
