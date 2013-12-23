package nature;

public class Plants extends Creatures{
	
	/**
	 * @param health
	 */
	public Plants(int health, int x, int y) {
		super(health, x, y, 3);
	}
	
	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	public void reproduction () {
		//TODO
	}
	
	public void autoregen () {
		int autoregen_value = Earth.getAutohealth();
		setHealth(autoregen_value);
	}
}
