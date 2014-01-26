package game;

import java.awt.image.BufferedImage;

import selectherowindow.HeroGalleryView;
import selectitemwindow.GetImageItem;

public class Test {
	public final GetImageItem item = new GetImageItem();
	private BufferedImage image;

	public Test() {
		item.setVisible(true);
		setImage(item.getImage());
	}

	private void setImage(BufferedImage image) {
		this.image = image;
	}

	public static void main(String[] args) {
		HeroGalleryView hero = new HeroGalleryView();
		hero.setVisible(true);

	}

}
