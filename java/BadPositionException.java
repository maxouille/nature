package nature;

public class BadPositionException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public BadPositionException () {
		System.out.println("Position value exit of the map");
	}
	
}
