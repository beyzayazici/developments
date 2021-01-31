
public class NumberUtil {
	public static long sumFactors(int val)
	{	
		long sum = 1;
		
		for(int i = 2; i <= val / 2; i++)
			if(val % i == 0)
				sum += i;
		
		return sum;
	}
}
