package nature;

public class Earth {
	
	private static int autohealth = 1;
	private static int matrix[][];
	
	/**
	 * @return the autohealth
	 */
	public static int getAutohealth() {
		return autohealth;
	}
	
	public static int[][] getMatrix() {
		return matrix;
	}
	
	public static int[][] setMatrix(int x, int y, int animal_type) {
		matrix[x][y] = animal_type;
		return matrix;
	}

}
