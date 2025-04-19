package principal;

public class PantallaPrincipalEjercicio1 {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
            try {
                SeleccionMultiple seleccionMultiple = new SeleccionMultiple();
                seleccionMultiple.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();// ejercicio 1
            }
        }
	}
	
}
