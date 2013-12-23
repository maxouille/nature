package nature;

public class Plants {

	private int health;
	private int type = 3;
	
	/**
	 * @param health
	 */
	public Plants(int health) {
		super();
		this.health = health;
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
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
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
