import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test extends JFrame implements ActionListener {
	private HeroGalleryView hero;
	private ItemGalleryView item;

	public Test() {
		hero = new HeroGalleryView();
		item = new ItemGalleryView();
		// setLayout(new FlowLayout());
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add(hero);
		// setBounds(100, 100, 800, 650);

		pack();
		setLocationRelativeTo(null);

		con.add(item);
		if (hero.Fire() == 1)
			item.setVisible(true);

	}

	public static void main(String[] args) {
		new Test().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton) e.getSource();

		// item.jf.setVisible(true);
		// hero.actionPerformed(e);
	}

}
