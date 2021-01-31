
public class Pattern {
	public static void drawPattern(int wid, int hei) {
		int loc;
		for (int j = 1; j <= hei; j++) {
			System.out.print("|");
			loc = findStarLoc(wid, j);

			for (int k = 1; k <= wid; k++)
				if (k == loc)
					System.out.print("*");
				else
					System.out.print(" ");

			System.out.print("|");
			System.out.println();

		}
	}

	public static int findStarLoc(int wid, int y) {
		int line = findRotLine(wid, y);

		if (wid >= line)
			return line;

		else if (!isRight(wid, line))

			return wid - (line % wid);

		return (line % wid) + (line / wid);

	}

	public static int findRotLine(int wid, int y) {
		if (y > (2 * wid - 2) && y % (2 * wid - 2) != 0)
			return y % (2 * wid - 2);
		else if (y > (2 * wid - 2) && y % (2 * wid - 2) == 0)
			return (2 * wid - 2);
		return y;
	}

	public static boolean isRight(int wid, int line) {
		return (line / wid) % 2 == 0;
	}
}
