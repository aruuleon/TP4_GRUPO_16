package principal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEjercicio1 extends  JFrame {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private JTextField TextNombre;
    private JTextField TextApellido;
    private JTextField TextTelefono;
    private JTextField TextFechaNacimiento;
    private JPanel contentPane;
	
	
	
		
		public VentanaEjercicio1() {
	        setTitle("Contactos");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 350, 250);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(new GridLayout(6, 2, 5, 5));

	        // etiquetas y campos de texto
	        JLabel nombreLbl = new JLabel("Nombre:");
	        contentPane.add(nombreLbl);
	        TextNombre = new JTextField();
	        contentPane.add(TextNombre);
	        TextNombre.setColumns(10);

	        JLabel apellidoLbl = new JLabel("Apellido:");
	        contentPane.add(apellidoLbl);
	        TextApellido = new JTextField();
	        contentPane.add(TextApellido);
	        TextApellido.setColumns(10);

	        JLabel telefonoLbl = new JLabel("Teléfono:");
	        contentPane.add(telefonoLbl);
	        TextTelefono = new JTextField();
	        contentPane.add(TextTelefono);
	        TextTelefono.setColumns(10);

	        JLabel fechaNacimientoLbl = new JLabel("Fecha Nac.:");
	        contentPane.add(fechaNacimientoLbl);
	        TextFechaNacimiento = new JTextField();
	        contentPane.add(TextFechaNacimiento);
	        TextFechaNacimiento.setColumns(10);

	        
	        
	        // botón "Mostrar" y su AccionListener
	        JButton mostrar = new JButton("Mostrar");
	        mostrar.addActionListener(new ActionListener() {
	        	
	        	
	        	
	        	
	            public void actionPerformed(ActionEvent e) {
	                String nombre = TextNombre.getText();
	                String apellido = TextApellido.getText();
	                String telefono = TextTelefono.getText();
	                String fechaNacimiento = TextFechaNacimiento.getText();

	                // Validar que todos los campos estén completos
	                if (nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || fechaNacimiento.isEmpty()) {
	                    // Cambia rojo los campos incompletos
	                    if (nombre.isEmpty()) TextNombre.setBackground(Color.RED); else TextNombre.setBackground(Color.WHITE);
	                    if (apellido.isEmpty()) TextApellido.setBackground(Color.RED); else TextApellido.setBackground(Color.WHITE);
	                    if (telefono.isEmpty()) TextTelefono.setBackground(Color.RED); else TextTelefono.setBackground(Color.WHITE);
	                    if (fechaNacimiento.isEmpty()) TextFechaNacimiento.setBackground(Color.RED); else TextFechaNacimiento.setBackground(Color.WHITE);
	                 
	                } else {
	                 
	                }
	            }
	            
	            
	            
	            
	        });
	        contentPane.add(mostrar);
		}
		
}
