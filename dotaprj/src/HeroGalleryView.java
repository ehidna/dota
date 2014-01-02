import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class HeroGalleryView extends JPanel implements ActionListener {
	private List<JButton> jbList = new ArrayList<JButton>();
	private int fire;

	public HeroGalleryView() {
		for (int i = 0; i < 30; i++) {
			JButton jb = new JButton();
			jb.addActionListener(this);
			jb.setIcon(getImage(i));
			jb.setSelectedIcon(getImage(i));
			jbList.add(jb);
			add(jbList.get(i));
			setLayout(new GridLayout(5, 6));
			// con.add(jb, BorderLayout.CENTER);
			// jb.addActionListener(this);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton) e.getSource();
		setVisible(false);
		JOptionPane.showMessageDialog(jb, jb.getSelectedIcon());
		setFire(1);
		// new HeroGalleryView().jf.setVisible(true);
	}

	public int Fire() {
		return fire;
	}

	public void setFire(int fire) {
		this.fire = fire;
	}

}
