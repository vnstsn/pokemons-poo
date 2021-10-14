package code;

public class PokemonFire extends Pokemon {
	
	public PokemonFire() {
		super();
	}
	
	public PokemonFire(String name, int hp, int atk) {
		super(name, hp, atk);
		// TODO Auto-generated constructor stub
	}

	public void attack(Pokemon pokemon) {
		if(pokemon instanceof PokemonPlant) {
			System.out.println(this.getName() + " attacks " + pokemon.getName());
		}
	}
	
	/*
	public void attackPokemonPlant(PokemonPlant pokemonPlant) {
		this.setAtk(this.getAtk()*2);
		super.attack(pokemonPlant);
	}
	
	public void attackPokemonWater(PokemonWater pokemonWater) {
		this.setAtk((int) (this.getAtk()*0.5));
		super.attack(pokemonWater);
	}
	*/
}
