import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

final class deneme {
    public static final void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
    private static final void createAndShowGUI(){
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout()); // For presentation purposes only.
        final JToggleButton button = new JToggleButton(UIManager.getIcon("OptionPane.informationIcon"));
        button.setSelectedIcon(UIManager.getIcon("OptionPane.errorIcon"));
        frame.add(button);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}