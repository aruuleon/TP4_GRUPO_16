package principal;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SeleccionMultiple extends JFrame {
  
	private static final long serialVersionUID = 1L;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textFieldHours;
    private JRadioButton firstRadioButton;
    private JRadioButton secondRadioButton;
    private JRadioButton thirdRadioButton;
    private JCheckBox firstCheckBox;
    private JCheckBox secondCheckBox;
    private JCheckBox thirdCheckBox;

    public SeleccionMultiple() {
        setTitle("Seleccion multiple");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 500, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setLayout(null);

        JPanel firstPanel = crearFirstPanel();
        getContentPane().add(firstPanel);

        JPanel secondPanel = crearSecondPanel();
        getContentPane().add(secondPanel);

        JLabel labelHours = new JLabel("Cantidad de horas en el computador:");
        labelHours.setBounds(20, 165, 250, 14);
        getContentPane().add(labelHours);

        textFieldHours = new JTextField();
        textFieldHours.setBounds(287, 162, 75, 20);
        getContentPane().add(textFieldHours);
        textFieldHours.setColumns(10);

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(340, 205, 100, 30);
        getContentPane().add(btnAceptar);
        btnAceptar.addActionListener(new EventoBotonAceptar(
        	    firstRadioButton, secondRadioButton, thirdRadioButton,
        	    firstCheckBox, secondCheckBox, thirdCheckBox, textFieldHours));
    }

    private JPanel crearFirstPanel() {
        JPanel panel = new JPanel(null);
        panel.setBounds(10, 10, 464, 40);
        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        JLabel label = new JLabel("Elije un sistema operativo");
        label.setBounds(10, 11, 200, 14);
        panel.add(label);

        firstRadioButton = crearRadio("Windows", 200, 8, buttonGroup, panel);
        secondRadioButton = crearRadio("Mac", 300, 8, buttonGroup, panel);
        thirdRadioButton = crearRadio("Linux", 380, 8, buttonGroup, panel);
        
        firstRadioButton.setSelected(true);

        return panel;
    }

    private JPanel crearSecondPanel() {
        JPanel panel = new JPanel(null);
        panel.setBounds(10, 61, 464, 90);
        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        JLabel label = new JLabel("Elije una especialidad");
        label.setBounds(10, 36, 200, 14);
        panel.add(label);

        firstCheckBox = crearCheck("Programaci�n", 308, 2, panel);
        secondCheckBox = crearCheck("Administraci�n", 308, 33, panel);
        thirdCheckBox = crearCheck("Dise�o Gr�fico", 308, 63, panel);

        return panel;
    }

    private JRadioButton crearRadio(String texto, int x, int y, ButtonGroup grupo, JPanel panel) {
        JRadioButton radio = new JRadioButton(texto);
        radio.setBounds(x, y, 80, 20);
        grupo.add(radio);
        panel.add(radio);
        return radio;
    }

    private JCheckBox crearCheck(String texto, int x, int y, JPanel panel) {
        JCheckBox check = new JCheckBox(texto);
        check.setBounds(x, y, 150, 20);
        panel.add(check);
        return check;
    }
 
    public class EventoBotonAceptar implements ActionListener {
        
    	private JTextField txtHoras;

        private JRadioButton rbWindows;
        private JRadioButton rbMac;
        private JRadioButton rbLinux;

        private JCheckBox cbProgramacion;
        private JCheckBox cbAdmistracion;
        private JCheckBox cbDisGrafico;

        public EventoBotonAceptar(JRadioButton windows, JRadioButton mac, JRadioButton linux,
                                  JCheckBox programacion, JCheckBox administracion, JCheckBox disGrafico, JTextField horas) {
            this.txtHoras = horas;
        	
        	this.rbWindows = windows;
            this.rbMac = mac;
            this.rbLinux = linux;

            this.cbProgramacion = programacion;
            this.cbAdmistracion = administracion;
            this.cbDisGrafico = disGrafico;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            String sistemaOp = "";
            if (rbWindows.isSelected())
            	sistemaOp = "Windows";
            else if (rbMac.isSelected())
            	sistemaOp = "Mac";
            else if (rbLinux.isSelected()) 
            	sistemaOp = "Linux";
            
            String especialidades = "";
            if (cbProgramacion.isSelected()) 
            	especialidades += " - Programación";
            if (cbAdmistracion.isSelected()) 
            	especialidades += " - Administración";
            if (cbDisGrafico.isSelected()) 
            	especialidades += " - Diseño Gráfico";
            
            String horas = txtHoras.getText();
           
            String mensaje = sistemaOp  + especialidades + " - " + horas + " Hs";
            mostrarVentanaInfo(mensaje);
        }

    	private void mostrarVentanaInfo(String mensaje) {
    	    JFrame mensajeFrame = new JFrame("Mensaje");
    	    mensajeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	    mensajeFrame.setSize(500, 250); 
    	    mensajeFrame.setLocationRelativeTo(null);
    	    mensajeFrame.setLayout(null);

    	    JLabel label = new JLabel(mensaje, SwingConstants.CENTER);
    	    label.setBounds(20, 40, 450, 50);
    	    mensajeFrame.add(label);

    	    JButton btnCerrar = new JButton("Aceptar");
    	    btnCerrar.setBounds(200, 130, 100, 30);
    	    btnCerrar.addActionListener(new EventoBotonCerrar(mensajeFrame));
    	    mensajeFrame.add(btnCerrar);

    	    mensajeFrame.setVisible(true);
    	}
    }
    
    public class EventoBotonCerrar implements ActionListener {
        private JFrame ventana;

        public EventoBotonCerrar(JFrame vent) {
            this.ventana = vent;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            ventana.setVisible(false);
        }
    }
    
}

