package nature;

public abstract class Animals extends Creatures{

	private int strength;
	private int moving;	
	/** see radius */
	private int see;
	
	public Animals() {
		super();
		strength = 0;
		moving = 0;
	}	

	/**
	 * @param health
	 * @param strength
	 * @param moving
	 */
	public Animals(int health, int strength, int moving, int positionX, int positionY, int see, int type) {
		super(health, positionX, positionY, type);
		this.strength = strength;
		this.moving = moving;
		this.see = see;
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
		strength = force;
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
