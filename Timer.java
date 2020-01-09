/**This program essentially calls the other methods in order to 
 * get the time taken to determine the primality of the numbers**/
public class Timer {
	public static void main(String[] args) {
		Timer.getCurrentTime();
	}

	public static long getCurrentTime() {
		return System.nanoTime();
	}
}
