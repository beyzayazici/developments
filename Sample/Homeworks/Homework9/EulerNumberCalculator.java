
public class EulerNumberCalculator {
	public static double getE()
	{
		double e = 2;
		
		for (int i = 2; i < 20; ++i)
			e += 1. / NumberUtil.factorial(i);
		
		return e;	
	}
}
