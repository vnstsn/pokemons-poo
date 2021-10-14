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
		boolean result = false;
		if(this.hp == 0) {
			return true;
			//System.out.println(this + " is DEAD");
		} 
			return result;
			//System.out.println(this + " is still alive");
		
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

	public int getAtk() {
		return this.atk;
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", hp=" + hp + ", atk=" + atk + "]";
	}
	
	
}
