package selectherowindow;

import game.Test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HeroGalleryView extends JFrame {

	private static BufferedImage Axe, Abaddon, AntiMage, Clinkz, CrystalMaiden,
			Silencer, Huskar, Bristleback, Luna, FacelessVoid, SkywrathMage,
			OgreMagi, Beastmaster, Omniknight, Slark, PhantomLancer,
			QueenOfPain, Dazzle, Tidehunter, Lycan, Riki, Weaver, Batrider,
			Lich, Pudge, ElderTitan, Venomancer, PhantomAssassin,
			ObsidianDestroyer, Zuus;
	private BufferedImage image;

	public HeroGalleryView() {
		imageShowing p = new imageShowing();

		JPanel pnlTools = new JPanel();
		pnlTools.setLayout(new FlowLayout());
		setBounds(50, 50, 850, 550);

		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add(p, BorderLayout.CENTER);

		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent event) {
				if ((event.getX() > 10 && event.getX() < 11 + 127)
						&& (event.getY() > 79 && event.getY() < 79 + 71))
					setImage(Axe);
				else if ((event.getX() > 147 && event.getX() < 148 + 127)
						&& (event.getY() > 79 && event.getY() < 79 + 71))
					setImage(Abaddon);
				else if ((event.getX() > 284 && event.getX() < 285 + 127)
						&& (event.getY() > 79 && event.getY() < 79 + 71))
					setImage(AntiMage);
				else if ((event.getX() > 421 && event.getX() < 422 + 127)
						&& (event.getY() > 79 && event.getY() < 79 + 71))
					setImage(Clinkz);
				else if ((event.getX() > 558 && event.getX() < 559 + 127)
						&& (event.getY() > 79 && event.getY() < 79 + 71))
					setImage(CrystalMaiden);
				else if ((event.getX() > 695 && event.getX() < 696 + 127)
						&& (event.getY() > 79 && event.getY() < 79 + 71))
					setImage(Silencer);

				else if ((event.getX() > 10 && event.getX() < 11 + 127)
						&& (event.getY() > 167 && event.getY() < 167 + 71))
					setImage(Huskar);
				else if ((event.getX() > 147 && event.getX() < 148 + 127)
						&& (event.getY() > 167 && event.getY() < 167 + 71))
					setImage(Bristleback);
				else if ((event.getX() > 284 && event.getX() < 285 + 127)
						&& (event.getY() > 167 && event.getY() < 167 + 71))
					setImage(Luna);
				else if ((event.getX() > 421 && event.getX() < 422 + 127)
						&& (event.getY() > 167 && event.getY() < 167 + 71))
					setImage(FacelessVoid);
				else if ((event.getX() > 558 && event.getX() < 559 + 127)
						&& (event.getY() > 167 && event.getY() < 167 + 71))
					setImage(SkywrathMage);
				else if ((event.getX() > 695 && event.getX() < 696 + 127)
						&& (event.getY() > 167 && event.getY() < 167 + 71))
					setImage(OgreMagi);

				else if ((event.getX() > 10 && event.getX() < 11 + 127)
						&& (event.getY() > 249 && event.getY() < 249 + 71))
					setImage(Beastmaster);
				else if ((event.getX() > 147 && event.getX() < 148 + 127)
						&& (event.getY() > 249 && event.getY() < 249 + 71))
					setImage(Omniknight);
				else if ((event.getX() > 284 && event.getX() < 285 + 127)
						&& (event.getY() > 249 && event.getY() < 249 + 71))
					setImage(Slark);
				else if ((event.getX() > 421 && event.getX() < 422 + 127)
						&& (event.getY() > 249 && event.getY() < 249 + 71))
					setImage(PhantomLancer);
				else if ((event.getX() > 558 && event.getX() < 559 + 127)
						&& (event.getY() > 249 && event.getY() < 249 + 71))
					setImage(QueenOfPain);
				else if ((event.getX() > 695 && event.getX() < 696 + 127)
						&& (event.getY() > 249 && event.getY() < 249 + 71))
					setImage(Dazzle);

				else if ((event.getX() > 10 && event.getX() < 11 + 127)
						&& (event.getY() > 336 && event.getY() < 336 + 71))
					setImage(Tidehunter);
				else if ((event.getX() > 147 && event.getX() < 148 + 127)
						&& (event.getY() > 336 && event.getY() < 336 + 71))
					setImage(Lycan);
				else if ((event.getX() > 284 && event.getX() < 285 + 127)
						&& (event.getY() > 336 && event.getY() < 336 + 71))
					setImage(Riki);
				else if ((event.getX() > 421 && event.getX() < 422 + 127)
						&& (event.getY() > 336 && event.getY() < 336 + 71))
					setImage(Weaver);
				else if ((event.getX() > 558 && event.getX() < 559 + 127)
						&& (event.getY() > 336 && event.getY() < 336 + 71))
					setImage(Batrider);
				else if ((event.getX() > 695 && event.getX() < 696 + 127)
						&& (event.getY() > 336 && event.getY() < 336 + 71))
					setImage(Lich);

				else if ((event.getX() > 10 && event.getX() < 11 + 127)
						&& (event.getY() > 423 && event.getY() < 423 + 71))
					setImage(Pudge);
				else if ((event.getX() > 147 && event.getX() < 148 + 127)
						&& (event.getY() > 423 && event.getY() < 423 + 71))
					setImage(ElderTitan);
				else if ((event.getX() > 284 && event.getX() < 285 + 127)
						&& (event.getY() > 423 && event.getY() < 423 + 71))
					setImage(Venomancer);
				else if ((event.getX() > 421 && event.getX() < 422 + 127)
						&& (event.getY() > 423 && event.getY() < 423 + 71))
					setImage(PhantomAssassin);
				else if ((event.getX() > 558 && event.getX() < 559 + 127)
						&& (event.getY() > 423 && event.getY() < 423 + 71))
					setImage(ObsidianDestroyer);
				else if ((event.getX() > 695 && event.getX() < 696 + 127)
						&& (event.getY() > 423 && event.getY() < 423 + 71))
					setImage(Zuus);
				else
					System.out.println("disarda");
				System.out.println(event.getX());
				System.out.println(event.getY());
				setVisible(false);
				new Test();
			}
		});
		// getImage();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public BufferedImage getImage() {
		return image;
	}

	class imageShowing extends JPanel {

		public imageShowing() {
			try {
				HeroGalleryView.Axe = ImageIO.read(new File(
						"imageHeroes/axe_hphover.png"));
				HeroGalleryView.Abaddon = ImageIO.read(new File(
						"imageHeroes/abaddon_hphover.png"));
				HeroGalleryView.AntiMage = ImageIO.read(new File(
						"imageHeroes/antimage_hphover.png"));
				HeroGalleryView.Clinkz = ImageIO.read(new File(
						"imageHeroes/clinkz_hphover.png"));
				HeroGalleryView.CrystalMaiden = ImageIO.read(new File(
						"imageHeroes/crystal_maiden_hphover.png"));
				HeroGalleryView.Silencer = ImageIO.read(new File(
						"imageHeroes/silencer_hphover.png"));

				HeroGalleryView.Huskar = ImageIO.read(new File(
						"imageHeroes/huskar_hphover.png"));
				HeroGalleryView.Bristleback = ImageIO.read(new File(
						"imageHeroes/bristleback_hphover.png"));
				HeroGalleryView.Luna = ImageIO.read(new File(
						"imageHeroes/luna_hphover.png"));
				HeroGalleryView.FacelessVoid = ImageIO.read(new File(
						"imageHeroes/faceless_void_hphover.png"));
				HeroGalleryView.SkywrathMage = ImageIO.read(new File(
						"imageHeroes/skywrath_mage_hphover.png"));
				HeroGalleryView.OgreMagi = ImageIO.read(new File(
						"imageHeroes/ogre_magi_hphover.png"));

				HeroGalleryView.Beastmaster = ImageIO.read(new File(
						"imageHeroes/beastmaster_hphover.png"));
				HeroGalleryView.Omniknight = ImageIO.read(new File(
						"imageHeroes/omniknight_hphover.png"));
				HeroGalleryView.Slark = ImageIO.read(new File(
						"imageHeroes/slark_hphover.png"));
				HeroGalleryView.PhantomLancer = ImageIO.read(new File(
						"imageHeroes/phantom_lancer_hphover.png"));
				HeroGalleryView.QueenOfPain = ImageIO.read(new File(
						"imageHeroes/queenofpain_hphover.png"));
				HeroGalleryView.Dazzle = ImageIO.read(new File(
						"imageHeroes/dazzle_hphover.png"));

				HeroGalleryView.Tidehunter = ImageIO.read(new File(
						"imageHeroes/tidehunter_hphover.png"));
				HeroGalleryView.Lycan = ImageIO.read(new File(
						"imageHeroes/lycan_hphover.png"));
				HeroGalleryView.Riki = ImageIO.read(new File(
						"imageHeroes/riki_hphover.png"));
				HeroGalleryView.Weaver = ImageIO.read(new File(
						"imageHeroes/weaver_hphover.png"));
				HeroGalleryView.Batrider = ImageIO.read(new File(
						"imageHeroes/batrider_hphover.png"));
				HeroGalleryView.Lich = ImageIO.read(new File(
						"imageHeroes/lich_hphover.png"));

				HeroGalleryView.Pudge = ImageIO.read(new File(
						"imageHeroes/pudge_hphover.png"));
				HeroGalleryView.ElderTitan = ImageIO.read(new File(
						"imageHeroes/elder_titan_hphover.png"));
				HeroGalleryView.Venomancer = ImageIO.read(new File(
						"imageHeroes/venomancer_hphover.png"));
				HeroGalleryView.PhantomAssassin = ImageIO.read(new File(
						"imageHeroes/phantom_assassin_hphover.png"));
				HeroGalleryView.ObsidianDestroyer = ImageIO.read(new File(
						"imageHeroes/obsidian_destroyer_hphover.png"));
				HeroGalleryView.Zuus = ImageIO.read(new File(
						"imageHeroes/zuus_hphover.png"));
				
			} catch (IOException e) {
			}
		}

		@Override
		public void paint(Graphics g) {
			super.paintComponents(g);
			g.drawImage(Axe, 10, 55, null);
			g.drawImage(Abaddon, 147, 55, null);
			g.drawImage(AntiMage, 284, 55, null);
			g.drawImage(Clinkz, 421, 55, null);
			g.drawImage(CrystalMaiden, 558, 55, null);
			g.drawImage(Silencer, 695, 55, null);
			
			g.drawImage(Huskar, 10, 142, null);
			g.drawImage(Bristleback, 147, 142, null);
			g.drawImage(Luna, 284, 142, null);
			g.drawImage(FacelessVoid, 421, 142, null);
			g.drawImage(SkywrathMage, 558, 142, null);
			g.drawImage(OgreMagi, 695, 142, null);

			g.drawImage(Beastmaster, 10, 224, null);
			g.drawImage(Omniknight, 147, 224, null);
			g.drawImage(Slark, 284, 224, null);
			g.drawImage(PhantomLancer, 421, 224, null);
			g.drawImage(QueenOfPain, 558, 224, null);
			g.drawImage(Dazzle, 695, 224, null);

			g.drawImage(Tidehunter, 10, 311, null);
			g.drawImage(Lycan, 147, 311, null);
			g.drawImage(Riki, 284, 311, null);
			g.drawImage(Weaver, 421, 311, null);
			g.drawImage(Batrider, 558, 311, null);
			g.drawImage(Lich, 695, 311, null);

			g.drawImage(Pudge, 10, 398, null);
			g.drawImage(ElderTitan, 147, 398, null);
			g.drawImage(Venomancer, 284, 398, null);
			g.drawImage(PhantomAssassin, 421, 398, null);
			g.drawImage(ObsidianDestroyer, 558, 398, null);
			g.drawImage(Zuus, 695, 398, null);

			g.drawRect(70, 25, 150, 25);
			g.drawString("STRENGTH", 115, 42);
			g.drawRect(335, 25, 150, 25);
			g.drawString("AGILITY", 385, 42);
			g.drawRect(610, 25, 150, 25);
			g.drawString("INTELLIGENCE", 645, 42);
		}
	}
}
