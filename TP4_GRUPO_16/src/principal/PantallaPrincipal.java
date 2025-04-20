package principal;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PantallaPrincipal extends JFrame {
	
	

	


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

