package nature;

public class Main {

	public static void main(String[] args) {
		Herbivores h1 = new Herbivores(1,2,4,4,5,6);
		System.out.println("santé :" +h1.getHealth() + " déplacement :" + h1.getMoving() + " posX :"+ h1.getPositionX() + " posY :" + 
		h1.getPositionY() + " see :"+ h1.getSee() + " force :" + h1.getStrength() + " type :" + h1.getType());
		h1.move_closest_plant(new int[] {1,1});
		System.out.println("santé :" +h1.getHealth() + " déplacement :" + h1.getMoving() + " posX :"+ h1.getPositionX() + " posY :" + 
		h1.getPositionY() + " see :"+ h1.getSee() + " force :" + h1.getStrength() + " type :" + h1.getType());
	}

}
