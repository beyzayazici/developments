
public class Duration {
	public static void displayDuration(long time) {

		long hour, min, sec;

		hour = time / 3600;
		time = time % 3600;
		min = time / 60;
		time = time % 60;
		sec = time;
		
		printTime('h', hour);
		printTime('m', min);
		printTime('s', sec);

	}
	
	public static void printTime(char type, long val){
		if (val != 0)
			System.out.printf("%02d %s ", val, type);
	}
}
