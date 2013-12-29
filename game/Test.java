package game;

import selectherowindow.GetImageHero;
import selectitemwindow.GetImageItem;

public class Test {
	public final GetImageItem item = new GetImageItem();

	public Test() {
		item.setVisible(true);

	}

	public static void main(String[] args) {
		GetImageHero hero = new GetImageHero();
		hero.setVisible(true);

	}

}
