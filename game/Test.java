package game;

import SelectHeroWindow.GetImageHero;
import SelectItemWindow.GetImageItem;

public class Test {

	public static void main(String[] args) {
		GetImageHero hero = new GetImageHero();
		GetImageItem item = new GetImageItem();
		hero.setVisible(true);
		item.setVisible(false);

		hero.getImage();

		System.out.println(item.getImage());
	}

}
