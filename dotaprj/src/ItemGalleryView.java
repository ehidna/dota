import java.awt.BorderLayout;
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

public class ItemGalleryView extends JPanel implements ActionListener {
	private List<JButton> jbList = new ArrayList<JButton>();

	public ItemGalleryView() {
		for (int i = 0; i < 24; i++) {
			JButton jb = new JButton();
			jbList.add(jb);
			jb.setIcon(getImage(i));
			jb.addActionListener(this);
			jb.setSelectedIcon(getImage(i));
			add(jb, BorderLayout.CENTER);
			setLayout(new GridLayout(4, 6));
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

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton) e.getSource();
		jbList.add(jb);
		setVisible(false);
		JOptionPane.showMessageDialog(jb, jb.getSelectedIcon());
		// new HeroGalleryView().jf.setVisible(true);
	}
}
