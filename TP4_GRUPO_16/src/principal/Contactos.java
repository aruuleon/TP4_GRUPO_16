package principal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contactos extends  JFrame {
	
    
	private static final long serialVersionUID = 1L;
	
    private JTextField TextNombre;
    private JTextField TextApellido;
    private JTextField TextTelefono;
    private JTextField TextFechaNacimiento;
    
    private JLabel resultadoNombreLbl;
    private JLabel resultadoApellidoLbl;
    private JLabel resultadoTelefonoLbl;
    private JLabel resultadoFechaNacLbl;
    private JPanel contentPane;
    
   
		
		public Contactos() {
	        setTitle("Contactos");
	        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        setBounds(100, 100, 350, 350);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
	        setContentPane(contentPane);
	        contentPane.setLayout(new GridLayout(12, 10, 20, 10));

	       
	      
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

	        //para mostrar informacion segunda parte del punto 1
	        
	        resultadoNombreLbl = new JLabel("");
	        resultadoNombreLbl.setForeground(Color.BLUE);
	        contentPane.add(resultadoNombreLbl);
	        contentPane.add(new JLabel("")); 
	     
	        resultadoApellidoLbl = new JLabel("");
	        resultadoApellidoLbl.setForeground(Color.BLUE);
	        contentPane.add(resultadoApellidoLbl);
	        contentPane.add(new JLabel("")); 
	     
	        resultadoTelefonoLbl = new JLabel("");
	        resultadoTelefonoLbl.setForeground(Color.BLUE);
	        contentPane.add(resultadoTelefonoLbl);
	        contentPane.add(new JLabel(" "));
	     
	        resultadoFechaNacLbl = new JLabel("");
	        resultadoFechaNacLbl.setForeground(Color.BLUE);
	        contentPane.add(resultadoFechaNacLbl);
	        contentPane.add(new JLabel(" "));
	     
	        
	        // Asignamos la clase que maneja el botÃ³n
	        JButton mostrar = new JButton ("Mostrar");
	        mostrar.addActionListener(new EventoBotonMostrar(TextNombre, TextApellido, TextTelefono, TextFechaNacimiento, resultadoNombreLbl,resultadoApellidoLbl,resultadoTelefonoLbl,resultadoFechaNacLbl));
	        
	       
	        
	        contentPane.add(mostrar);
	       
		}
		
}



class EventoBotonMostrar implements ActionListener
{
	private JTextField nombre;
	private JTextField apellido;
	private JTextField telefono;
	private JTextField fechaNac;
	private JLabel resultadoNombreLbl;
	private JLabel resultadoApellidoLbl;
	private JLabel resultadoTelefonoLbl;
	private JLabel resultadoFechaNacLbl;

	    
	    public EventoBotonMostrar()
		{
			
		}
	    
	    public EventoBotonMostrar(JTextField nombre, JTextField apellido, JTextField telefono, JTextField fechaNac,
                JLabel resultadoNombre, JLabel resultadoApellido, JLabel resultadoTelefono, JLabel resultadoFechaNac) {
	    	
	    	this.nombre = nombre;
	    	this.apellido = apellido;
	    	this.telefono = telefono;
	    	this.fechaNac = fechaNac;
	    	this.resultadoNombreLbl = resultadoNombre;
	    	this.resultadoApellidoLbl = resultadoApellido;
	    	this.resultadoTelefonoLbl = resultadoTelefono;
	    	this.resultadoFechaNacLbl = resultadoFechaNac;
	    }

	
	
	public JTextField getNombre() {
			return nombre;
		}

		public void setNombre(JTextField nombre) {
			this.nombre = nombre;
		}

		public JTextField getApellido() {
			return apellido;
		}

		public void setApellido(JTextField apellido) {
			this.apellido = apellido;
		}

		public JTextField getTelefono() {
			return telefono;
		}

		public void setTelefono(JTextField telefono) {
			this.telefono = telefono;
		}

		public JTextField getFechaNac() {
			return fechaNac;
		}

		public void setFechaNac(JTextField fechaNac) {
			this.fechaNac = fechaNac;
		}

		

	@Override
	public void actionPerformed(ActionEvent e) {
		
		 	String nom = nombre.getText();
		    String ape = apellido.getText();
		    String tel = telefono.getText();
		    String fecha = fechaNac.getText();

		    boolean camposCompletos = true;

		    if (nom.isEmpty()) {
		        nombre.setBackground(Color.RED);
		        camposCompletos = false;
		    } else nombre.setBackground(Color.WHITE);

		    if (ape.isEmpty()) {
		        apellido.setBackground(Color.RED);
		        camposCompletos = false;
		    } else apellido.setBackground(Color.WHITE);

		    if (tel.isEmpty()) {
		        telefono.setBackground(Color.RED);
		        camposCompletos = false;
		    } else telefono.setBackground(Color.WHITE);

		    if (fecha.isEmpty()) {
		        fechaNac.setBackground(Color.RED);
		        camposCompletos = false;
		    } else fechaNac.setBackground(Color.WHITE);

		    if (camposCompletos) {
		        resultadoNombreLbl.setText("Nombre: " + nom);
		        resultadoApellidoLbl.setText("Apellido: " + ape);
		        resultadoTelefonoLbl.setText("Teléfono: " + tel);
		        resultadoFechaNacLbl.setText("Fecha Nacimiento: " + fecha);
		        
		        nombre.setText("");
		        apellido.setText("");
		        telefono.setText("");
		        fechaNac.setText("");

		        // Restaurar cajas de texto al mostrar en las lbl
		        nombre.setBackground(Color.WHITE);
		        apellido.setBackground(Color.WHITE);
		        telefono.setBackground(Color.WHITE);
		        fechaNac.setBackground(Color.WHITE);
		        
		        
		        
		    } 
		
		
}
	


}

 








