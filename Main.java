package nature;

public class Main {

	public static void main(String[] args) {
		Herbivores h1 = new Herbivores(1,2,4,4,5,6);
		System.out.println("santé :" +h1.getHealth() + " déplacement :" + h1.getMoving() + " posX :"+ h1.getPositionX() + " posY :" + 
		h1.getPositionY() + " see :"+ h1.getSee() + " force :" + h1.getStrength() + " type :" + h1.getType(4,5));
		h1.move_closest_plant(new int[] {1,1});
		System.out.println("santé :" +h1.getHealth() + " déplacement :" + h1.getMoving() + " posX :"+ h1.getPositionX() + " posY :" + 
		h1.getPositionY() + " see :"+ h1.getSee() + " force :" + h1.getStrength() + " type :" + h1.getType(1,1));
		Plants p1 = new Plants(42, 1, 4);
		System.out.println("santé :" +p1.getHealth() + " posX :"+ p1.getPositionX() + " posY :" + 
		p1.getPositionY() + " type :" + p1.getType());
		System.out.println("value matrix[1][4] = "+ Earth.getValueMatrix(1, 4));
	}

}
