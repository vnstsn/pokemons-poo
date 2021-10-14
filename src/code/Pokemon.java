package code;

public class Pokemon {
	private String name;
	private int hp;
	private int atk;
	
	public Pokemon() {
		
	}
	
	public Pokemon(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}
	
	
	public boolean isDead() {
		if(hp == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void attackPokemon(Pokemon pokemon) {
		int hpLeft = pokemon.hp - this.atk;
		System.out.println(this.name + " attacks " + pokemon.name + " !! " + pokemon.name + " has " + hpLeft + " left.");
	}
	
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}


	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", hp=" + hp + ", atk=" + atk + "]";
	}
	
	
}
