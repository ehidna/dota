import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class HeroGalleryView implements ActionListener {
	private List<JButton> jbList = new ArrayList<JButton>();
	private JFrame jf;

	public HeroGalleryView() {
		jf = new JFrame();
		// jf.setBounds(100, 100, 800, 420);
		Container con = jf.getContentPane();
		con.setLayout(new GridLayout(5, 6));

		for (int i = 0; i < 30; i++) {
			JButton jb = new JButton();
			jb.setIcon(getImage(i));
			con.add(jb, BorderLayout.CENTER);
			jb.addActionListener(this);
			jb.setSelectedIcon(getImage(i));
		}
		jf.pack();
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}

	private ImageIcon getImage(int i) {
		JSONParser parser = new JSONParser();
		JSONArray msg = null;
		ImageIcon img;
		try {
			Object obj;
			obj = parser.parse(new FileReader("Image.json"));
			JSONObject jsonObject = (JSONObject) obj;
			msg = (JSONArray) jsonObject.get("imageList");
			Iterator<String> iterator = msg.iterator();

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

	public static void main(String[] args) {
		new HeroGalleryView();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton) e.getSource();
		jbList.add(jb);
		jf.setVisible(false);
		JOptionPane.showMessageDialog(jb, jb.getSelectedIcon());
		//new HeroGalleryView().jf.setVisible(true);
	}
}
