package nature;

public class Herbivores extends Animals {

	
	public Herbivores() {
		super();
	}
	
	public Herbivores(int health, int strength, int moving, int positionX, int positionY, int see) {
		super(health, strength, moving, positionX, positionY, see, 1);
	}
	
	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}
	
	@Override
	public int eat() {
		/** have to search the closest plant around and move closest to her */
		int[] position_closest_plant = search_closest_plant();
		int[] new_position = move_closest_plant (position_closest_plant);
		/** if next to the plant */
		if (true) {
			/** attack */
			return attack();
		}
		else {
			return 0;
		}
	}
	
	public int[] search_closest_plant () {
		int see = getSee();
		int test_value = 0;
		/** test all cases we can touch with a maximum moving of see. */
		while (test_value <= see) {
			//TODO tester toutes les cases pour un déplacement de test_value.
			/** if plant on a case, stop and return the position */
			if (true) {
				return new int[] {0,0};
			}
			test_value++;
		}
		return new int[] {0,0};
	}
	
	/**
	 * @return new position of this
	 */
	public int[] move_closest_plant (int[] position_plant) {
		//TODO déplacement aléatoire
		/** get the maximum value of moving */
		int max_moving = getMoving();
		int myX = getPositionX();
		int myY = getPositionY();
		int posX = position_plant[0];
		int posY = position_plant[1];
		int moveX = 0;
		int moveY = 0;
		if (myX >= posX) {
			/** moveX <= 0 */
			moveX = posX - myX;
		}
		else {
			/** moveX > 0 */
			moveX = myX - posX;
		}
		if (myY >= posY) {
			/** moveY <= 0 */
			moveY = posY - myY;
		}
		else {
			/** moveY > 0 */
			moveY = myY - posY;
		}
		
		int new_X = 0;
		int new_Y = 0;
		/** check if moveX+moveY <= max_moving */
		if (Math.abs(moveX+moveY) > max_moving) {
			if (Math.abs(moveX) > max_moving) {
				if (moveX < 0) {
					moveX = -max_moving;
				}
				else {
					moveX = max_moving;
				}
				moveY = 0;
			}
			else if (Math.abs(moveX) == max_moving) {
				moveY = 0;
			}
			else if (Math.abs(moveX) < max_moving) {
				if (moveY < 0) {
					moveY = -max_moving - moveX;
				}
				else {
					moveY = max_moving - moveX;
				}
			}
		}
		/** random moving */
		//while (moveX > 0) {
			/** choose random int betwin 1 and moveX */
			/**double randX = Math.round(Math.random()*(moveX-1));
			new_X = updatePositionX((int)randX);
			moveX -= randX;
		}*/
		new_X = updatePositionX(moveX);
		new_Y = updatePositionY(moveY);
		return new int[] {new_X,new_Y};
	}

}
