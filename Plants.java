package nature;

public class Plants {

	private int health;
	private int positionX;
	private int positionY;
	private int type = 3;
	
	/**
	 * @param health
	 */
	public Plants(int health, int x, int y) {
		super();
		this.health = health;
		this.positionX = x;
		this.positionY = y;
		Earth.setMatrix(x, y, type);
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	
	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @return the positionX
	 */
	public int getPositionX() {
		return positionX;
	}

	/**
	 * @param positionX the positionX to set
	 */
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	/**
	 * @return the positionY
	 */
	public int getPositionY() {
		return positionY;
	}

	/**
	 * @param positionY the positionY to set
	 */
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public void update_health (int new_val) {
		health += new_val; 
	}

	public void reproduction () {
		//TODO
	}
	
	public void autoregen () {
		int autoregen_value = Earth.getAutohealth();
		update_health(autoregen_value);
	}
}
