package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Promedio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contPanelCuerpo;
	private JTextField textFieldPromedio;
	private JTextField textFieldCondicion;
	private JTextField textFieldNota3;
	private JTextField textFieldNota2;
	private JTextField textFieldNota1;

	public Promedio() {
		setTitle("Resumen");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 559, 433);
		contPanelCuerpo = new JPanel();
		contPanelCuerpo.setForeground(new Color(0, 0, 0));
		contPanelCuerpo.setToolTipText("");

		setContentPane(contPanelCuerpo);
		contPanelCuerpo.setLayout(null);
		
		JPanel panelNotasEstudiante = new JPanel();
		panelNotasEstudiante.setToolTipText("");
		panelNotasEstudiante.setBounds(23, 29, 346, 181);
		panelNotasEstudiante.setBorder(BorderFactory.createTitledBorder("Notas del estudiante"));
		contPanelCuerpo.add(panelNotasEstudiante);
		panelNotasEstudiante.setLayout(null);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(43, 24, 52, 25);
		panelNotasEstudiante.add(lblNota1);
		lblNota1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(43, 60, 52, 25);
		panelNotasEstudiante.add(lblNota2);
		lblNota2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setBounds(43, 96, 52, 25);
		panelNotasEstudiante.add(lblNota3);
		lblNota3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		
		JLabel lblTps = new JLabel("TPS");
		lblTps.setBounds(43, 129, 52, 25);
		panelNotasEstudiante.add(lblTps);
		lblTps.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		
		JComboBox cBoxTps = new JComboBox();
		cBoxTps.setBounds(160, 131, 140, 22);
		panelNotasEstudiante.add(cBoxTps);
		cBoxTps.addItem("TP 1");
		cBoxTps.addItem("TP 2");
		cBoxTps.addItem("TP 3");
		
		textFieldNota3 = new JTextField();
		textFieldNota3.setColumns(10);
		textFieldNota3.setBounds(158, 96, 142, 25);
		panelNotasEstudiante.add(textFieldNota3);
		
		textFieldNota2 = new JTextField();
		textFieldNota2.setColumns(10);
		textFieldNota2.setBounds(158, 60, 142, 25);
		panelNotasEstudiante.add(textFieldNota2);
		
		
		textFieldNota1 = new JTextField();
		textFieldNota1.setColumns(10);
		textFieldNota1.setBounds(158, 24, 142, 25);
		panelNotasEstudiante.add(textFieldNota1);
		
		JPanel panelNotasEstudiante2 = new JPanel();
		panelNotasEstudiante2.setBounds(23, 232, 346, 135);
		panelNotasEstudiante2.setBorder(BorderFactory.createTitledBorder("Notas del estudiante"));
		contPanelCuerpo.add(panelNotasEstudiante2);
		panelNotasEstudiante2.setLayout(null);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(38, 35, 107, 25);
		panelNotasEstudiante2.add(lblPromedio);
		lblPromedio.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		
		JLabel lblCondicion = new JLabel("Condicion:");
		lblCondicion.setBounds(38, 71, 107, 25);
		panelNotasEstudiante2.add(lblCondicion);
		lblCondicion.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		
		textFieldPromedio = new JTextField();
		textFieldPromedio.setColumns(10);
		textFieldPromedio.setBounds(155, 37, 142, 25);
		panelNotasEstudiante2.add(textFieldPromedio);
		
		textFieldCondicion = new JTextField();
		textFieldCondicion.setColumns(10);
		textFieldCondicion.setBounds(155, 74, 142, 23);
		panelNotasEstudiante2.add(textFieldCondicion);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNuevo.setBounds(379, 190, 139, 61);
		contPanelCuerpo.add(btnNuevo);
		btnNuevo.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        textFieldNota1.setText("");
		        textFieldNota2.setText("");
		        textFieldNota3.setText("");
		        textFieldPromedio.setText("");
		        textFieldCondicion.setText("");
		        textFieldCondicion.setForeground(Color.BLACK); 
		        cBoxTps.setSelectedIndex(0); 
		    }
		});
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSalir.setBounds(379, 262, 139, 61);
		contPanelCuerpo.add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        System.exit(0);
		    }
		});
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double nota1 = Double.parseDouble(textFieldNota1.getText());
					double nota2 = Double.parseDouble(textFieldNota2.getText());
					double nota3 = Double.parseDouble(textFieldNota3.getText());
					
					double resultado = (nota1 + nota2 + nota3) / 3;
					
					String promedio = String.valueOf(resultado);
					textFieldPromedio.setText(promedio); 
					
					String condicion;
					if(resultado < 6) {
						condicion="Libre";
					}else if(resultado >=6 && resultado < 8) {
						condicion="Regular";
					}else {
						condicion="Promocionado";
					}
					
					textFieldCondicion.setText(condicion);
					
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: Ingresa números válidos en todas las notas.", "Datos inválidos", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCalcular.setBounds(379, 118, 139, 61);
		contPanelCuerpo.add(btnCalcular);
	}
}
