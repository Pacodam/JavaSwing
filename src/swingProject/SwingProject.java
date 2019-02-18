package swingProject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class SwingProject {

	public static void main(String[] args) {
		
				myFrame m = new myFrame();
				m.setVisible(true);
				
				m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
}

		class myFrame extends JFrame {
			
			public myFrame() {
				setSize(500,300);
				
				myPanel p = new myPanel();
				p.setVisible(true);
				
				setResizable(false);
				add(p);
				
			}
			
		}


		class myPanel extends JPanel {
			
			public myPanel() {
				setBackground(Color.red);
				
				JButton button = new JButton("push me");
				button.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						onPushButton();
					}
				});
				add(button);
			}
			
			private void onPushButton() {
				setBackground(Color.pink);
			}
		}
		

	/*
	 * tendremos un jframe, dentro irá un Jpanel que dentro tenga un JSplitPanel, o directamente que el JsplitPanel sea el mismo Jpanel.
	 * A la izquierda irá la consola, arriba de la consola irá un Jmenu y a la derecha irá la lógica de programa, que será otro JPanel. en este tendré varios: login, menu, new game (el snake irá aqui), un scores (pestañas y subpestañas, etc)
	 * Lo único que va cambiando es la lógica de la aplicación, el resto es siempre fijo.
	 */


