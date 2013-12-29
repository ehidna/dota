package selectitemwindow;

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
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GetImageItem extends JFrame {
	private static BufferedImage UOrb, SOWizardry, BOAlacrity, OClub, SOVyse,
			Refresh, Orchid, Aghanim, Abyssal, Divine, BFly, Daeda, HOT,
			Assault, Linken, Bstone, Satan, Skadi, Mjo, SY, Relic, Eagle, Reav,
			MStaff;
	private URL UltimateOrb, StaffOrbWizardry, BladeOfAlacrity, OgreClub,
			ScytheOfVyse, RefresherOrb, OrchidMalevolence, AghanimScepter,
			AbyssalBlade, DivineRapier, Butterfly, Daedalus, HeartOfTarrasque,
			AssaultCuirass, LinkensSphere, Bloodstone, Satanic, EyeOfSkadi,
			Mjollnir, SangeAndYasha, SacredRelic, Eaglesong, Reaver,
			MysticStaff;
	private BufferedImage image;

	public GetImageItem() {

		imageShowing p = new imageShowing();

		JPanel pnlTools = new JPanel();
		pnlTools.setLayout(new FlowLayout());
		setBounds(50, 50, 792, 420);

		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add(p, BorderLayout.CENTER);

		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent event) {
				if ((event.getX() > 10 && event.getX() < 11 + 127)
						&& (event.getY() > 79 && event.getY() < 79 + 71))
					setImage(UOrb);
				else if ((event.getX() > 147 && event.getX() < 148 + 127)
						&& (event.getY() > 79 && event.getY() < 79 + 71))
					setImage(SOWizardry);
				else if ((event.getX() > 284 && event.getX() < 285 + 127)
						&& (event.getY() > 79 && event.getY() < 79 + 71))
					setImage(BOAlacrity);
				else if ((event.getX() > 421 && event.getX() < 422 + 127)
						&& (event.getY() > 79 && event.getY() < 79 + 71))
					setImage(OClub);
				else if ((event.getX() > 558 && event.getX() < 559 + 127)
						&& (event.getY() > 79 && event.getY() < 79 + 71))
					setImage(SOVyse);
				else if ((event.getX() > 695 && event.getX() < 696 + 127)
						&& (event.getY() > 79 && event.getY() < 79 + 71))
					setImage(Refresh);

				else if ((event.getX() > 10 && event.getX() < 11 + 127)
						&& (event.getY() > 167 && event.getY() < 167 + 71))
					setImage(Orchid);
				else if ((event.getX() > 147 && event.getX() < 148 + 127)
						&& (event.getY() > 167 && event.getY() < 167 + 71))
					setImage(Aghanim);
				else if ((event.getX() > 284 && event.getX() < 285 + 127)
						&& (event.getY() > 167 && event.getY() < 167 + 71))
					setImage(Abyssal);
				else if ((event.getX() > 421 && event.getX() < 422 + 127)
						&& (event.getY() > 167 && event.getY() < 167 + 71))
					setImage(Divine);
				else if ((event.getX() > 558 && event.getX() < 559 + 127)
						&& (event.getY() > 167 && event.getY() < 167 + 71))
					setImage(BFly);
				else if ((event.getX() > 695 && event.getX() < 696 + 127)
						&& (event.getY() > 167 && event.getY() < 167 + 71))
					setImage(Daeda);

				else if ((event.getX() > 10 && event.getX() < 11 + 127)
						&& (event.getY() > 249 && event.getY() < 249 + 71))
					setImage(HOT);
				else if ((event.getX() > 147 && event.getX() < 148 + 127)
						&& (event.getY() > 249 && event.getY() < 249 + 71))
					setImage(Assault);
				else if ((event.getX() > 284 && event.getX() < 285 + 127)
						&& (event.getY() > 249 && event.getY() < 249 + 71))
					setImage(Linken);
				else if ((event.getX() > 421 && event.getX() < 422 + 127)
						&& (event.getY() > 249 && event.getY() < 249 + 71))
					setImage(Bstone);
				else if ((event.getX() > 558 && event.getX() < 559 + 127)
						&& (event.getY() > 249 && event.getY() < 249 + 71))
					setImage(Satan);
				else if ((event.getX() > 695 && event.getX() < 696 + 127)
						&& (event.getY() > 249 && event.getY() < 249 + 71))
					setImage(Skadi);

				else if ((event.getX() > 10 && event.getX() < 11 + 127)
						&& (event.getY() > 336 && event.getY() < 336 + 71))
					setImage(Mjo);
				else if ((event.getX() > 147 && event.getX() < 148 + 127)
						&& (event.getY() > 336 && event.getY() < 336 + 71))
					setImage(SY);
				else if ((event.getX() > 284 && event.getX() < 285 + 127)
						&& (event.getY() > 336 && event.getY() < 336 + 71))
					setImage(Relic);
				else if ((event.getX() > 421 && event.getX() < 422 + 127)
						&& (event.getY() > 336 && event.getY() < 336 + 71))
					setImage(Eagle);
				else if ((event.getX() > 558 && event.getX() < 559 + 127)
						&& (event.getY() > 336 && event.getY() < 336 + 71))
					setImage(Reav);
				else if ((event.getX() > 695 && event.getX() < 696 + 127)
						&& (event.getY() > 336 && event.getY() < 336 + 71))
					setImage(MStaff);

				else
					System.out.println("disarda");
				System.out.println(event.getX());
				System.out.println(event.getY());
				setVisible(false);
			}

		});

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public int sayi(int a) {
		return a;
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
				System.out.println("Basladi");

				GetImageItem.UOrb = ImageIO.read(new File(
						"imageItems/Ultimate_Orb_icon.png"));
				GetImageItem.SOWizardry = ImageIO.read(new File(
						"imageItems/Staff_of_Wizardry_icon.png"));
				GetImageItem.BOAlacrity = ImageIO.read(new File(
						"imageItems/Blade_of_Alacrity_icon.png"));
				GetImageItem.OClub = ImageIO.read(new File(
						"imageItems/Ogre_Club_icon.png"));
				GetImageItem.SOVyse = ImageIO.read(new File(
						"imageItems/Scythe_of_Vyse_icon.png"));
				GetImageItem.Refresh = ImageIO.read(new File(
						"imageItems/Refresher_Orb_icon.png"));
				GetImageItem.Orchid = ImageIO.read(new File(
						"imageItems/Orchid_Malevolence_icon.png"));
				GetImageItem.Aghanim = ImageIO.read(new File(
						"imageItems/Aghanim's_Scepter_icon.png"));
				GetImageItem.Abyssal = ImageIO.read(new File(
						"imageItems/Abyssal_Blade_icon.png"));
				GetImageItem.Divine = ImageIO.read(new File(
						"imageItems/Divine_Rapier_icon.png"));
				GetImageItem.BFly = ImageIO.read(new File(
						"imageItems/Butterfly_icon.png"));
				GetImageItem.Daeda = ImageIO.read(new File(
						"imageItems/Daedalus_icon.png"));
				GetImageItem.HOT = ImageIO.read(new File(
						"imageItems/Heart_of_Tarrasque_icon.png"));
				GetImageItem.Assault = ImageIO.read(new File(
						"imageItems/Assault_Cuirass_icon.png"));
				GetImageItem.Linken = ImageIO.read(new File(
						"imageItems/Linken's_Sphere_icon.png"));
				GetImageItem.Bstone = ImageIO.read(new File(
						"imageItems/Bloodstone_icon.png"));
				GetImageItem.Satan = ImageIO.read(new File(
						"imageItems/Satanic_icon.png"));
				GetImageItem.Skadi = ImageIO.read(new File(
						"imageItems/Eye_of_Skadi_icon.png"));
				GetImageItem.Mjo = ImageIO.read(new File(
						"imageItems/Mjollnir_icon.png"));
				GetImageItem.SY = ImageIO.read(new File(
						"imageItems/Sange_and_Yasha_icon.png"));
				GetImageItem.Relic = ImageIO.read(new File(
						"imageItems/Sacred_Relic_icon.png"));
				GetImageItem.Eagle = ImageIO.read(new File(
						"imageItems/Eaglesong_icon.png"));
				GetImageItem.Reav = ImageIO.read(new File(
						"imageItems/Reaver_icon.png"));
				GetImageItem.MStaff = ImageIO.read(new File(
						"imageItems/Mystic_Staff_icon.png"));
				System.out.println("Anca");
			} catch (IOException e) {
			}
		}

		@Override
		public void paint(Graphics g) {
			super.paintComponents(g);

			g.drawImage(UOrb, 10, 55, null);
			g.drawImage(SOVyse, 147, 55, null);
			g.drawImage(Abyssal, 284, 55, null);
			g.drawImage(HOT, 421, 55, null);
			g.drawImage(Satan, 558, 55, null);
			g.drawImage(Eagle, 695, 55, null);

			g.drawImage(SOWizardry, 10, 142, null);
			g.drawImage(Refresh, 147, 142, null);
			g.drawImage(Divine, 284, 142, null);
			g.drawImage(Assault, 421, 142, null);
			g.drawImage(Skadi, 558, 142, null);
			g.drawImage(Relic, 695, 142, null);

			g.drawImage(BOAlacrity, 10, 224, null);
			g.drawImage(Orchid, 147, 224, null);
			g.drawImage(BFly, 284, 224, null);
			g.drawImage(Linken, 421, 224, null);
			g.drawImage(Mjo, 558, 224, null);
			g.drawImage(Reav, 695, 224, null);

			g.drawImage(OClub, 10, 311, null);
			g.drawImage(Aghanim, 147, 311, null);
			g.drawImage(Daeda, 284, 311, null);
			g.drawImage(Bstone, 421, 311, null);
			g.drawImage(SY, 558, 311, null);
			g.drawImage(MStaff, 695, 311, null);

			g.drawRect(10, 20, 85, 25);
			g.drawString("Attributes", 21, 38);
			g.drawRect(147, 20, 85, 25);
			g.drawString("Caster", 169, 38);
			g.drawRect(284, 20, 85, 25);
			g.drawString("Weapons", 301, 38);
			g.drawRect(421, 20, 85, 25);
			g.drawString("Armor", 444, 38);
			g.drawRect(558, 20, 85, 25);
			g.drawString("Artifacts", 574, 38);
			g.drawRect(695, 20, 85, 25);
			g.drawString("Secret Shop", 701, 38);

		}
	}
}
