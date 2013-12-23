package nature;

public class Carnivores extends Animals {

	public Carnivores() {
		super();
	}
	
	public Carnivores(int health, int strength, int moving, int positionX, int positionY, int see) {
		super(health, strength, moving, positionX, positionY, see, 2);
	}
	
	@Override
	public int eat() {
		// TODO 
		return 0;
	}

	public int[] search_closest_animal() {
		//TODO
		return new int[] {0,0};
	}
	
	public int[] move_closest_animal() {
		//TODO
		return new int[] {0,0};
	}

}
