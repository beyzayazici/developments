
public class Pattern {
	public static void drawStars(int n) {
		
		int line = n + n - 1;
		int midline = line / 2;
		int maxStar = Pattern.findStar(n);
		int star;

		for (int i = 1; i <= line; i++) {
			
			if (i <= midline + 1)
				for (int j = i; j <= midline; j++)
					System.out.print(" ");
			else
				for (int j = i - (midline + 1); j >= 1; j--)
					System.out.print(" ");

			if (Pattern.findStar(i) < maxStar) {
				star = Pattern.findStar(i);
				for (int k = 1; k <= star; k++)
					System.out.print("*");
			} else {
				star = Pattern.findBStar(maxStar, i);
				for (int k = 1; k <= star; k++)
					System.out.print("*");
			}
			
			System.out.println();
		}
	}

	public static int findStar(int n) {
		int star = 1;

		for (int i = 0; i < n - 1; i++)
			star += 2;

		return star;
	}

	public static int findBStar(int max, int n) {
		return findStar(max + 1 - n);
	}
}
