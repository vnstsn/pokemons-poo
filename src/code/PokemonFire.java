package code;

public class PokemonFire extends Pokemon {
	
	public PokemonFire() {
		super();
	}
	
	public PokemonFire(String name, int hp, int atk) {
		super(name, hp, atk);
		// TODO Auto-generated constructor stub
	}



	public void attackPokemonPlant(PokemonPlant pokemonPlant) {
		super.attack(pokemonPlant);
		int atkMax = 2*(this.getAtk());
		this.attackPokemonPlant(pokemonPlant);
		
	}
}
