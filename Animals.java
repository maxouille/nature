package nature;

public abstract class Animals {

	private int health;
	private int strength;
	private int moving;	
	private int positionX;
	private int positionY;
	/** type : 
	 * 0 : unknow
	 * 1 : herbivore
	 * 2 : carnivore
	 * 3 : plant
	 */
	private int type;
	/** see radius */
	private int see;
	
	public Animals() {
		super();
		health = 0;
		strength = 0;
		moving = 0;
		positionX = 0;
		positionY = 0;
		see = 0;
		type = 0;
		Earth.setMatrix(positionX, positionY, type);
	}	

	/**
	 * @param health
	 * @param strength
	 * @param moving
	 */
	public Animals(int health, int strength, int moving, int positionX, int positionY, int see, int type) {
		super();
		this.health = health;
		this.strength = strength;
		this.moving = moving;
		this.positionX = positionX;
		this.positionY = positionY;
		this.see = see;
		Earth.setMatrix(positionX, positionY, type);
	}
	
	/**
	 * @return the sante
	 */
	public int getHealth() {
		return health;
	}
	/**
	 * @param sante the sante to set
	 */
	public void setHealth(int sante) {
		this.health = sante;
	}
	/**
	 * @return the force
	 */
	public int getStrength() {
		return strength;
	}
	/**
	 * @param force the force to set
	 */
	public void setStrength(int force) {
		this.strength = force;
	}
	/**
	 * @return the deplacement
	 */
	public int getMoving() {
		return moving;
	}
	/**
	 * @param deplacement the deplacement to set
	 */
	public void setMoving(int deplacement) {
		this.moving = deplacement;
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
		if (Math.abs(positionX) <= 100) {
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
		if (Math.abs(positionY) <= 100) {
			this.positionY = positionY;
		}
		else {
			throw new BadPositionException();
		}
	}

	/**
	 * @return the see
	 */
	public int getSee() {
		return see;
	}

	/**
	 * @param see the see to set
	 */
	public void setSee(int see) {
		this.see = see;
	}
	
	/**
	 * @return the Type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param Type the Type to set
	 */
	public void setType(int type) {
		this.type = type;
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
	 * @return value of health increase
	 */
	public abstract int eat();
	
	/**
	 * @return value of ennemie's health decrease
	 */
	public int attack() {
		/** creation of probability attack*/
		double proba = Math.random();
		if (proba < 0.5) {
			return 0;
		}
		else {
			/** creation of attack value */
			int strength = getStrength();
			return Math.round((float)(Math.random() * strength)/strength);
		}
	}
	
}
