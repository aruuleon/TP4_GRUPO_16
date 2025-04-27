package principal;

import java.awt.EventQueue;

public class PantallaPrincipal {
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(() -> {
            try {
                Principal principal = new Principal();
                principal.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
		
	}
	
}
