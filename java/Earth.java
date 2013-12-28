package nature;

public class Earth {
	
	private static int autohealth = 1;
	private static int lengthX = 201;
	private static int lengthY = 201;
	private static Creatures[][] matrix = new Creatures[lengthX][lengthY];
	
	/**
	 * @return the autohealth
	 */
	public static int getAutohealth() {
		return autohealth;
	}
	
	/**
	 * @return the lengthX
	 */
	public static int getLengthX() {
		return lengthX;
	}

	/**
	 * @param lengthX the lengthX to set
	 */
	public static void setLengthX(int lengthX) {
		Earth.lengthX = lengthX;
	}

	/**
	 * @return the lengthY
	 */
	public static int getLengthY() {
		return lengthY;
	}

	/**
	 * @param lengthY the lengthY to set
	 */
	public static void setLengthY(int lengthY) {
		Earth.lengthY = lengthY;
	}
	
	public static Creatures[][] getMatrix() {
		return matrix;
	}
	
	public static Creatures getValueMatrix(int x, int y) {
		return matrix[x][y];
	}
	
	public static Creatures[][] setMatrix(int x, int y, Creatures c) {
		matrix[x][y] = c;
		return matrix;
	}

}
