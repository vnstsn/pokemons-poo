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
	
//	public void attackPokemon() {
//		(this.hp - this.atk);
//	}

	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", hp=" + hp + ", atk=" + atk + "]";
	}
	
	
}
