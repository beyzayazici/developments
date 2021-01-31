
public class FindValues {
	public static double findAverage(int sum, int counter) 
	{
		return counter != 0 ? (double) sum / counter : 0;
	}
	
	public static void printValues(int counter, int sum, int max, int min)
	{
		System.out.println("***************************");
		System.out.printf("Toplam %d değer girildi.%n", counter);
		System.out.printf("Max = %d%n", max);
		System.out.printf("Min = %d%n", min);
		System.out.printf("Ortalama = %.4f%n", findAverage(sum, counter));
	}
}
