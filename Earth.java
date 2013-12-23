package nature;

public class Earth {
	
	private static int autohealth = 1;
	private static int[][] matrix = new int[201][201];
	
	/**
	 * @return the autohealth
	 */
	public static int getAutohealth() {
		return autohealth;
	}
	
	public static int[][] getMatrix() {
		return matrix;
	}
	
	public static int getValueMatrix(int x, int y) {
		return matrix[x][y];
	}
	
	public static int[][] setMatrix(int x, int y, int type) {
		matrix[x][y] = type;
		 return matrix;
	}

}
