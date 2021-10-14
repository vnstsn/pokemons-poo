package code;

public class Pokemon {
	private String name;
	private int hp;
	private int atk;
	
	public Pokemon() {}
	
	public Pokemon(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		
	}
	
	
	public boolean isDead() {
		if(this.hp == 0) {
			return true;
			//System.out.println(this + " is DEAD");
		} else {
			return false;
			//System.out.println(this + " is still alive");
		}
	}
	
	public void attack(Pokemon pokemon) {
		
		int hpLeft = pokemon.getHp();
		
			while(hpLeft > 0) {
			hpLeft -= this.atk;
			break;
		} 
			pokemon.setHp(hpLeft);
			System.out.println(this.name + " attacks " + pokemon.name + " !! " + pokemon.name + " has " + hpLeft + " left.");
			//pokemon.isDead();
			
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
