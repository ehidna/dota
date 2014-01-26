import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test extends JFrame implements ActionListener {
	private HeroGalleryView hero;
	private ItemGalleryView item;
	private List<JButton> jbListHero = new ArrayList<JButton>();
	private List<JButton> jbListItem = new ArrayList<JButton>();

	public Test() {
		hero = new HeroGalleryView();
		// jbList = hero.jbList;
		for (int i = 0; i < hero.jbList.size(); i++) {
			JButton JBHero = hero.jbList.get(i);
			jbListHero.add(JBHero);
			JBHero.addActionListener(this);
		}

		item = new ItemGalleryView();
		for (int i = 0; i < item.jbList.size(); i++) {
			JButton JBHero = item.jbList.get(i);
			jbListItem.add(JBHero);
			JBHero.addActionListener(this);

		}

		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add(hero);
		pack();
		setLocationRelativeTo(null);
		con.add(item);

	}

	public static void main(String[] args) {
		new Test().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton) e.getSource();
		hero.setVisible(false);
		if (hero.Fire() == 0) {
			JOptionPane.showMessageDialog(jb, jb.getSelectedIcon());
			hero.setHeroName(jb.getIcon().toString());
			hero.heroInfo(hero.getHeroName());
			for (JButton liste : jbListHero) {
				System.out.println(liste);
			}
			item.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(jb, jb.getSelectedIcon());
			item.setItemName(jb.getIcon().toString());
			item.itemInfo(item.getItemName());
			for (JButton liste : jbListItem) {
				System.out.println(liste);
			}
			item.setVisible(false);
		}

	}

}
