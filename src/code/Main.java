package code;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon p1 = new Pokemon("Pikachu", 100, 15);
		Pokemon p2 = new Pokemon("Togepi", 100, 5);
		
		p1.attack(p2);
		System.out.println(p2.isDead());
		System.out.println(p2);
		
		System.out.println("***************************************");
		
		p2.attack(p1);
		System.out.println(p1.isDead());
		System.out.println(p1);
		
		System.out.println("***************************************");
		
		p1.attack(p2);
		System.out.println(p2.isDead());
		System.out.println(p2);
		
		System.out.println("***************************************");
		
		PokemonFire pf1 = new PokemonFire("Salameche", 100, 18);
		System.out.println(pf1);
		
		PokemonPlant pp1 = new PokemonPlant("Bulbisard", 100, 10);
		System.out.println(pp1);
		
		PokemonWater pw1 = new PokemonWater("Carapuce", 100, 15);
		System.out.println(pw1);
	}

}
