package code;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon p1 = new Pokemon("Pikachu", 100, 15);
		Pokemon p2 = new Pokemon("Bulbisard", 100, 10);
		
		p1.attack(p2);
		System.out.println(p2.isDead());
		p2.attack(p1);
		System.out.println(p1.isDead());
		System.out.println(p1);
		
	}

}
