package principal;


import java.awt.EventQueue;

import javax.swing.JFrame;

public class PantallaPrincipal extends JFrame {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
            try {
            	Contactos frame = new Contactos() ;
            	frame.setVisible(true);
            } 
            catch (Exception e) {
                e.printStackTrace();// ejercicio 1
            }
        });
	}
}

