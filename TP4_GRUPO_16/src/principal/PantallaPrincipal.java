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
            	
            	
            	
            	
            	VentanaEjercicio1 frame = new VentanaEjercicio1() ;
            	frame.setVisible(true);
            	
         
               
               
               
            } catch (Exception e) {
                e.printStackTrace();// ejercicio 1
            }
        });
	}
	
	
	
	
	
	
}

