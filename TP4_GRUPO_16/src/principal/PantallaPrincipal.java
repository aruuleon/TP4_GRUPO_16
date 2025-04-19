package principal;

import java.awt.EventQueue;

public class PantallaPrincipal {
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(() -> {
            try {
                SeleccionMultiple seleccionMultiple = new SeleccionMultiple();
                seleccionMultiple.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
		
	}
	
}
