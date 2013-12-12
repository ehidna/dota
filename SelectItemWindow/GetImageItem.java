package SelectItemWindow;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener;

import SelectHeroWindow.GetImageHero;

public class GetImageItem extends JFrame {
	public static BufferedImage UOrb, SOWizardry, BOAlacrity, OClub, SOVyse,
			Refresh, Orchid, Aghanim, Abyssal, Divine, BFly, Daeda, HOT,
			Assault, Linken, Bstone, Satan, Skadi, Mjo, SY, Relic, Eagle, Reav,
			MStaff;
	public URL UltimateOrb, StaffOrbWizardry, BladeOfAlacrity, OgreClub,
			ScytheOfVyse, RefresherOrb, OrchidMalevolence, AghanimScepter,
			AbyssalBlade, DivineRapier, Butterfly, Daedalus, HeartOfTarrasque,
			AssaultCuirass, LinkensSphere, Bloodstone, Satanic, EyeOfSkadi,
			Mjollnir, SangeAndYasha, SacredRelic, Eaglesong, Reaver,
			MysticStaff;

	public GetImageItem() {
		imageShowing p = new imageShowing();

		JPanel pnlTools = new JPanel();
		pnlTools.setLayout(new FlowLayout());
		setBounds(50, 50, 792, 420);

		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add(p, BorderLayout.CENTER);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public static void main(String[] args) {
		new GetImageItem().setVisible(true);
	}

	class imageShowing extends JPanel implements MouseListener {

		public imageShowing() {

			try {
				System.out.println("Basladi");
				UltimateOrb = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/1/14/Ultimate_Orb_icon.png");
				StaffOrbWizardry = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/8/8a/Staff_of_Wizardry_icon.png");
				BladeOfAlacrity = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/a/a2/Blade_of_Alacrity_icon.png");
				OgreClub = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/d/dc/Ogre_Club_icon.png");
				ScytheOfVyse = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/5/54/Scythe_of_Vyse_icon.png");
				RefresherOrb = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/e/e2/Refresher_Orb_icon.png");
				OrchidMalevolence = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/a/ad/Orchid_Malevolence_icon.png");
				AghanimScepter = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/0/07/Aghanim%27s_Scepter_icon.png");
				AbyssalBlade = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/3/3b/Abyssal_Blade_icon.png");
				DivineRapier = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/b/b1/Divine_Rapier_icon.png");
				Butterfly = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/2/28/Butterfly_icon.png");
				Daedalus = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/2/24/Daedalus_icon.png");
				HeartOfTarrasque = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/7/75/Heart_of_Tarrasque_icon.png");
				AssaultCuirass = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/d/d3/Assault_Cuirass_icon.png");
				LinkensSphere = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/2/23/Linken%27s_Sphere_icon.png");
				Bloodstone = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/5/5a/Bloodstone_icon.png");
				Satanic = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/d/dd/Satanic_icon.png");
				EyeOfSkadi = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/1/1e/Eye_of_Skadi_icon.png");
				Mjollnir = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/9/9d/Mjollnir_icon.png");
				SangeAndYasha = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/b/b4/Sange_and_Yasha_icon.png");
				SacredRelic = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/7/7c/Sacred_Relic_icon.png");
				Eaglesong = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/9/9a/Eaglesong_icon.png");
				Reaver = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/3/37/Reaver_icon.png");
				MysticStaff = new URL(
						"http://hydra-media.cursecdn.com/dota2.gamepedia.com/2/29/Mystic_Staff_icon.png");

				GetImageItem.UOrb = ImageIO.read(UltimateOrb);
				GetImageItem.SOWizardry = ImageIO.read(StaffOrbWizardry);
				GetImageItem.BOAlacrity = ImageIO.read(BladeOfAlacrity);
				GetImageItem.OClub = ImageIO.read(OgreClub);
				GetImageItem.SOVyse = ImageIO.read(ScytheOfVyse);
				GetImageItem.Refresh = ImageIO.read(RefresherOrb);
				GetImageItem.Orchid = ImageIO.read(OrchidMalevolence);
				GetImageItem.Aghanim = ImageIO.read(AghanimScepter);
				GetImageItem.Abyssal = ImageIO.read(AbyssalBlade);
				GetImageItem.Divine = ImageIO.read(DivineRapier);
				GetImageItem.BFly = ImageIO.read(Butterfly);
				GetImageItem.Daeda = ImageIO.read(Daedalus);
				GetImageItem.HOT = ImageIO.read(HeartOfTarrasque);
				GetImageItem.Assault = ImageIO.read(AssaultCuirass);
				GetImageItem.Linken = ImageIO.read(LinkensSphere);
				GetImageItem.Bstone = ImageIO.read(Bloodstone);
				GetImageItem.Satan = ImageIO.read(Satanic);
				GetImageItem.Skadi = ImageIO.read(EyeOfSkadi);
				GetImageItem.Mjo = ImageIO.read(Mjollnir);
				GetImageItem.SY = ImageIO.read(SangeAndYasha);
				GetImageItem.Relic = ImageIO.read(SacredRelic);
				GetImageItem.Eagle = ImageIO.read(Eaglesong);
				GetImageItem.Reav = ImageIO.read(Reaver);
				GetImageItem.MStaff = ImageIO.read(MysticStaff);
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

		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}
}
