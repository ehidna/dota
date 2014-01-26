import java.awt.BorderLayout;
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

public class ItemGalleryView extends JPanel {
	public List<JButton> jbList = new ArrayList<JButton>();
	private String itemName;

	public ItemGalleryView() {
		for (int i = 0; i < 24; i++) {
			JButton jb = new JButton();
			jbList.add(jb);
			jb.setIcon(getImage(i));
			// jb.addActionListener(this);
			jb.setSelectedIcon(getImage(i));
			add(jb, BorderLayout.CENTER);
			setLayout(new GridLayout(4, 6));
		}
		 setVisible(false);
	}

	private ImageIcon getImage(int i) {
		JSONParser parser = new JSONParser();
		JSONArray msg = null;
		ImageIcon img;
		try {
			Object obj;
			obj = parser.parse(new FileReader("Image.json"));
			JSONObject jsonObject = (JSONObject) obj;
			msg = (JSONArray) jsonObject.get("itemList");

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

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void itemInfo(String itemName) {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("item.json"));
			JSONObject jsonObject = (JSONObject) obj;
			String itemTypeName = null;

			// Isim tarama
			Iterator<String> typeIterator = jsonObject.keySet().iterator();
			while (typeIterator.hasNext()) {
				String typeSearching = typeIterator.next();
				Iterator<String> nameIterator = ((JSONObject) jsonObject
						.get(typeSearching)).keySet().iterator();
				while (nameIterator.hasNext()) {
					String nameSearching = nameIterator.next();
					if (nameSearching.equals(itemName))
						itemTypeName = typeSearching;
				}
			}
			JSONObject itemType = (JSONObject) jsonObject.get(itemTypeName);
			JSONObject item = (JSONObject) itemType.get(itemName);

			Items ItemSG = new Items();
			ItemSG.setName((String) item.get("name"));
			ItemSG.setAgility((Long) item.get("agility"));
			ItemSG.setArmor((Long) item.get("armor"));
			ItemSG.setAttackSpeed((Long) item.get("attackSpeed"));
			ItemSG.setIntelligence((Long) item.get("intelligence"));
			ItemSG.setStrength((Long) item.get("strength"));
			ItemSG.setDamage((Long) item.get("damage"));
			ItemSG.setHitPoints((Long) item.get("hitPoints"));
			ItemSG.setMana((Long) item.get("mana"));
			ItemSG.setMoveSpeed((Long) item.get("moveSpeed"));
			ItemSG.setCost((Long) item.get("cost"));

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

	/*
	 * @Override public void actionPerformed(ActionEvent e) { JButton jb =
	 * (JButton) e.getSource(); setHeroName(jb.getIcon().toString());
	 * setVisible(false); JOptionPane.showMessageDialog(jb,
	 * jb.getSelectedIcon()); setFire(1); }
	 */

	public String getItemName() {
		if (itemName == null)
			return itemName;
		return itemName.substring(11, itemName.length() - 9);
	}

	/*
	 * @Override public void actionPerformed(ActionEvent e) { JButton jb =
	 * (JButton) e.getSource(); // jbList.add(jb); setVisible(false);
	 * JOptionPane.showMessageDialog(jb, jb.getSelectedIcon()); // new
	 * HeroGalleryView().jf.setVisible(true); }
	 */
}
