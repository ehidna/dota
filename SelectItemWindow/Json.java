package selectitemwindow;

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
			Object obj = parser.parse(new FileReader("Item.json"));
			JSONObject jsonObject = (JSONObject) obj;

			// Isim listeleme
			Iterator<String> typeIterator = jsonObject.keySet().iterator();
			while (typeIterator.hasNext()) {
				String itemType = typeIterator.next();
				System.out.println(" --- Type = " + itemType);
				Iterator<String> nameIterator = ((JSONObject) jsonObject
						.get(itemType)).keySet().iterator();
				while (nameIterator.hasNext()) {
					String itemName = nameIterator.next();
					System.out.println(" ----- Name = " + itemName);
				}
			}
			// Isim listeleme sonu

			System.out
					.println("Item tipini giriniz -> "
							+ "Attiributes , Caster , Weapons , Armor , Artifacts , SecretShop ");
			String selectItemType = new Scanner(System.in).next();
			JSONObject itemType = (JSONObject) jsonObject.get(selectItemType);

			if (selectItemType.equals("Attiributes"))
				System.out
						.println("Itemin adini giriniz -> "
								+ "UltimateOrb,StaffOfWizardry,BladeOfAlacrity,OgreClub");
			else if (selectItemType.equals("Caster"))
				System.out
						.println("Itemin adini giriniz -> "
								+ "ScytheOfVyse,RefresherOrb,OrchidMalevolence,AghanimsScepter");
			else if (selectItemType.equals("Weapons"))
				System.out.println("Itemin adini giriniz -> "
						+ "AbyssalBlade,DivineRapier,Butterfly,Daedalus");
			else if (selectItemType.equals("Armor"))
				System.out
						.println("Itemin adini giriniz -> "
								+ "HeartOfTarasque,AssaultCuirass,LinkensSphere,Bloodstone");
			else if (selectItemType.equals("Artifacts"))
				System.out.println("Itemin adini giriniz -> "
						+ "Satanic,EyeOfSkadi,Mjollnir,SangeAndYasha");
			else if (selectItemType.equals("SecretShop"))
				System.out.println("Itemin adini giriniz -> "
						+ "SacredRelic,Eaglesong,Reaver,MysticStaff");
			else
				System.out.println("yanlis girdiniz!");
			String selectItem = new Scanner(System.in).next();
			JSONObject hero = (JSONObject) itemType.get(selectItem);

			Items ItemSG = new Items();
			ItemSG.setName((String) hero.get("name"));
			ItemSG.setAgility((Long) hero.get("agility"));
			ItemSG.setArmor((Long) hero.get("armor"));
			ItemSG.setAttackSpeed((Long) hero.get("attackSpeed"));
			ItemSG.setIntelligence((Long) hero.get("intelligence"));
			ItemSG.setStrength((Long) hero.get("strength"));
			ItemSG.setDamage((Long) hero.get("damage"));
			ItemSG.setHitPoints((Long) hero.get("hitPoints"));
			ItemSG.setMana((Long) hero.get("mana"));
			ItemSG.setMoveSpeed((Long) hero.get("moveSpeed"));
			ItemSG.setCost((Long) hero.get("cost"));

			System.out.println("name:" + ItemSG.getName());
			System.out.println("strength:" + ItemSG.getStrength());
			System.out.println("agility:" + ItemSG.getAgility());
			System.out.println("intelligence:" + ItemSG.getIntelligence());
			System.out.println("armor:" + ItemSG.getArmor());
			System.out.println("attackSpeed:" + ItemSG.getAttackSpeed());
			System.out.println("damage:" + ItemSG.getDamage());
			System.out.println("hitPoints:" + ItemSG.getHitPoints());
			System.out.println("mana:" + ItemSG.getMana());
			System.out.println("moveSpeed:" + ItemSG.getMoveSpeed());
			System.out.println("cost:" + ItemSG.getCost());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
