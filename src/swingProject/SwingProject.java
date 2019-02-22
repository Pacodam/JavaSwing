package swingProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import graphics.MyFrame;


public class SwingProject {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
				
			}
}

		
		

	/*
	 * tendremos un jframe, dentro irá un Jpanel que dentro tenga un JSplitPanel, o directamente que el JsplitPanel sea el mismo Jpanel.
	 * A la izquierda irá la consola, arriba de la consola irá un Jmenu y a la derecha irá la lógica de programa, que será otro JPanel. en este tendré varios: login, menu, new game (el snake irá aqui), un scores (pestañas y subpestañas, etc)
	 * Lo único que va cambiando es la lógica de la aplicación, el resto es siempre fijo.
	 */


