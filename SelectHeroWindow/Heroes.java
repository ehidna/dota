package selectherowindow;

public class Heroes {

	private String name;
	private Long intelligence, strength, attackRange, damage, hitPoints, level,
			mana, missileSpeed, moveSpeed, sightRange, agility;
	private double armor, attackSpeed;

	public Heroes() {
	}

	public Heroes(String name, Long intelligence, Long strength, Long agility,
			Long attackRange, Long damage, Long hitPoints, Long level,
			Long mana, Long missileSpeed, Long moveSpeed, Long sightRange,
			double armor, double attackSpeed) {
		this.name = name;
		this.intelligence = intelligence;
		this.strength = strength;
		this.agility = agility;
		this.attackRange = attackRange;
		this.damage = damage;
		this.hitPoints = hitPoints;
		this.level = level;
		this.mana = mana;
		this.missileSpeed = missileSpeed;
		this.moveSpeed = moveSpeed;
		this.sightRange = sightRange;
		this.armor = armor;
		this.attackSpeed = attackSpeed;
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

	public Long getAttackRange() {
		return attackRange;
	}

	public void setAttackRange(Long attackRange) {
		this.attackRange = attackRange;
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

	public Long getLevel() {
		return level;
	}

	public void setLevel(Long level) {
		this.level = level;
	}

	public Long getMana() {
		return mana;
	}

	public void setMana(Long mana) {
		this.mana = mana;
	}

	public Long getMissileSpeed() {
		return missileSpeed;
	}

	public void setMissileSpeed(Long missileSpeed) {
		this.missileSpeed = missileSpeed;
	}

	public Long getMoveSpeed() {
		return moveSpeed;
	}

	public void setMoveSpeed(Long moveSpeed) {
		this.moveSpeed = moveSpeed;
	}

	public Long getSightRange() {
		return sightRange;
	}

	public void setSightRange(Long sightRange) {
		this.sightRange = sightRange;
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
