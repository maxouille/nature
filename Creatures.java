package nature;

public class Creatures {

	private int health;
	private int positionX;
	private int positionY;
	protected int type;
	/** type : 
	 * 0 : unknow
	 * 1 : herbivore
	 * 2 : carnivore
	 * 3 : plant
	 */
	
	public Creatures() {
		super();
		health = 0;
		positionX = 0;
		positionY = 0;
		type = 0;
	}
	
	/**
	 * @param health
	 * @param positionX
	 * @param positionY
	 */
	public Creatures(int health, int positionX, int positionY, int type) {
		super();
		this.health = health;
		this.positionX = positionX;
		this.positionY = positionY;
		this.type = type;
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
	 * @return the positionX
	 */
	public int getPositionX() {
		return positionX;
	}

	/**
	 * @param positionX the positionX to set
	 */
	public void setPositionX(int positionX) throws BadPositionException {
		if (Math.abs(positionX) <= Earth.getLengthX()) {
			this.positionX = positionX;
		}
		else {
			throw new BadPositionException();
		}
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
	public void setPositionY(int positionY) throws BadPositionException {
		if (Math.abs(positionY) <= Earth.getLengthY()) {
			this.positionY = positionY;
		}
		else {
			throw new BadPositionException();
		}
	}
	
	public int updatePositionX (int x) {
		positionX += x;
		return positionX;
	}

	public int updatePositionY (int y) {
		positionY += y;
		return positionY;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}
	
}
