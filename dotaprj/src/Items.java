

public class Items {
	private String name;
	private Long intelligence, strength, damage, hitPoints, mana, moveSpeed,
			agility, cost;
	private double armor, attackSpeed;

	public Items() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Long intelligence) {
		this.intelligence = intelligence;
	}

	public Long getStrength() {
		return strength;
	}

	public void setStrength(Long strength) {
		this.strength = strength;
	}

	public Long getAgility() {
		return agility;
	}

	public void setAgility(Long agility) {
		this.agility = agility;
	}

	public Long getDamage() {
		return damage;
	}

	public void setDamage(Long damage) {
		this.damage = damage;
	}

	public Long getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(Long hitPoints) {
		this.hitPoints = hitPoints;
	}

	public Long getMana() {
		return mana;
	}

	public void setMana(Long mana) {
		this.mana = mana;
	}

	public Long getMoveSpeed() {
		return moveSpeed;
	}

	public void setMoveSpeed(Long moveSpeed) {
		this.moveSpeed = moveSpeed;
	}

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public double getArmor() {
		return armor;
	}

	public void setArmor(double armor) {
		this.armor = armor;
	}

	public double getAttackSpeed() {
		return attackSpeed;
	}

	public void setAttackSpeed(double attackSpeed) {
		this.attackSpeed = attackSpeed;
	}
}
