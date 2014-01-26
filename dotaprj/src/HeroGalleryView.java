import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class HeroGalleryView extends JPanel {

	public List<JButton> jbList = new ArrayList<JButton>();
	private int fire;
	private String heroName;

	public HeroGalleryView() {
		for (int i = 0; i < 30; i++) {
			JButton jb = new JButton();
			// jb.addActionListener(this);
			jb.setIcon(getImage(i));
			jb.setSelectedIcon(getImage(i));
			jbList.add(jb);
			add(jbList.get(i));
			setLayout(new GridLayout(5, 6));
		}
	}

	private ImageIcon getImage(int i) {
		JSONParser parser = new JSONParser();
		JSONArray msg = null;
		ImageIcon img;
		try {
			Object obj;
			obj = parser.parse(new FileReader("Image.json"));
			JSONObject jsonObject = (JSONObject) obj;
			msg = (JSONArray) jsonObject.get("heroList");
			return img = new ImageIcon((String) msg.get(i));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void heroInfo(String heroName) {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("Heroes.json"));
			JSONObject jsonObject = (JSONObject) obj;
			String heroTypeName = null;

			// Isim tarama
			Iterator<String> typeIterator = jsonObject.keySet().iterator();
			while (typeIterator.hasNext()) {
				String typeSearching = typeIterator.next();
				Iterator<String> nameIterator = ((JSONObject) jsonObject
						.get(typeSearching)).keySet().iterator();
				while (nameIterator.hasNext()) {
					String nameSearching = nameIterator.next();
					if (nameSearching.equals(heroName))
						heroTypeName = typeSearching;
				}
			}
			JSONObject heroType = (JSONObject) jsonObject.get(heroTypeName);
			JSONObject hero = (JSONObject) heroType.get(heroName);

			Hero heroesSG = new Hero();
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
			setFire(1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	/*
	 * @Override public void actionPerformed(ActionEvent e) { JButton jb =
	 * (JButton) e.getSource(); setHeroName(jb.getIcon().toString());
	 * setVisible(false); JOptionPane.showMessageDialog(jb,
	 * jb.getSelectedIcon()); setFire(1); }
	 */

	public String getHeroName() {
		if (heroName == null)
			return heroName;
		return heroName.substring(12, heroName.length() - 12);
	}

	public int Fire() {
		return fire;
	}

	private void setFire(int fire) {
		this.fire = fire;
	}

}
