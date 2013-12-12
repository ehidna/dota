package SelectHeroWindow;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Iterator;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("Heroes.json"));
			JSONObject jsonObject = (JSONObject) obj;

			// Isim listeleme
			Iterator<String> typeIterator = jsonObject.keySet().iterator();
			while (typeIterator.hasNext()) {
				String heroType = typeIterator.next();
				System.out.println(" --- Type = " + heroType);
				Iterator<String> nameIterator = ((JSONObject) jsonObject
						.get(heroType)).keySet().iterator();
				while (nameIterator.hasNext()) {
					String heroName = nameIterator.next();
					System.out.println(" ----- Name = " + heroName);
				}
			}
			// Isim listeleme sonu

			System.out.println("Hero tipini giriniz -> "
					+ "StrengthHero , AgilityHero , IntelligenceHero");
			String selectHeroType = new Scanner(System.in).next();
			JSONObject heroType = (JSONObject) jsonObject.get(selectHeroType);

			if (selectHeroType.equals("StrengthHero"))
				System.out
						.println("Heronun adini giriniz -> "
								+ "Axe , Abaddon , Huskar , Bristleback , Beastmaster , Omniknight , Tidehunter , Lycanthrope , Pudge , Elder-Titan");
			else if (selectHeroType.equals("AgilityHero"))
				System.out
						.println("Heronun adini giriniz -> "
								+ "Anti-Mage , Clinkz , Luna , Faceless-Void , Slark , Phantom-Lancer , Riki , Weaver , Venomancer , Phantom-Assassin");
			else if (selectHeroType.equals("IntelligenceHero"))
				System.out
						.println("Heronun adini giriniz -> "
								+ "Crystal-Maiden , Silencer , Skywrath-Mage , Ogre-Magi , Queen-of-Pain , Dazzle , Batrider , Lich , Outworld-Devourer , Zeus");
			else
				System.out.println("yanlis girdiniz!");
			String selectHero = new Scanner(System.in).next();
			JSONObject hero = (JSONObject) heroType.get(selectHero);

			Heroes heroesSG = new Heroes();
			heroesSG.setName((String) hero.get("name"));
			heroesSG.setAgility((Long) hero.get("agility"));
			heroesSG.setArmor((Double) hero.get("armor"));
			heroesSG.setAttackSpeed((Double) hero.get("attackSpeed"));
			heroesSG.setIntelligence((Long) hero.get("intelligence"));
			heroesSG.setStrength((Long) hero.get("strength"));
			heroesSG.setAttackRange((Long) hero.get("attackRange"));
			heroesSG.setDamage((Long) hero.get("damage"));
			heroesSG.setHitPoints((Long) hero.get("hitPoints"));
			heroesSG.setLevel((Long) hero.get("level"));
			heroesSG.setMana((Long) hero.get("mana"));
			heroesSG.setMissileSpeed((Long) hero.get("missileSpeed"));
			heroesSG.setMoveSpeed((Long) hero.get("moveSpeed"));
			heroesSG.setSightRange((Long) hero.get("sightRange"));

			System.out.println("name:" + heroesSG.getName());
			System.out.println("strength:" + heroesSG.getStrength());
			System.out.println("agility:" + heroesSG.getAgility());
			System.out.println("intelligence:" + heroesSG.getIntelligence());
			System.out.println("armor:" + heroesSG.getArmor());
			System.out.println("attackRange:" + heroesSG.getAttackRange());
			System.out.println("attackSpeed:" + heroesSG.getAttackSpeed());
			System.out.println("damage:" + heroesSG.getDamage());
			System.out.println("hitPoints:" + heroesSG.getHitPoints());
			System.out.println("level:" + heroesSG.getLevel());
			System.out.println("mana:" + heroesSG.getMana());
			System.out.println("missileSpeed:" + heroesSG.getMissileSpeed());
			System.out.println("moveSpeed:" + heroesSG.getMoveSpeed());
			System.out.println("sightRange:" + heroesSG.getSightRange());
			;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
