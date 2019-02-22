package graphics;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class MyPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MyPanel() {
		setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setForeground(Color.GRAY);
		splitPane.setBounds(0, 0, 450, 300);
		add(splitPane);
		
		JMenuBar menuBar = new JMenuBar();
		splitPane.setLeftComponent(menuBar);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		splitPane.setRightComponent(panel);

	}
}
