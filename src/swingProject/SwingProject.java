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
	 * tendremos un jframe, dentro ir� un Jpanel que dentro tenga un JSplitPanel, o directamente que el JsplitPanel sea el mismo Jpanel.
	 * A la izquierda ir� la consola, arriba de la consola ir� un Jmenu y a la derecha ir� la l�gica de programa, que ser� otro JPanel. en este tendr� varios: login, menu, new game (el snake ir� aqui), un scores (pesta�as y subpesta�as, etc)
	 * Lo �nico que va cambiando es la l�gica de la aplicaci�n, el resto es siempre fijo.
	 */


