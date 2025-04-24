package principal;

import java.awt.*;
import javax.swing.*;

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

        firstCheckBox = crearCheck("Programación", 308, 2, panel);
        secondCheckBox = crearCheck("Administración", 308, 33, panel);
        thirdCheckBox = crearCheck("Diseño Gráfico", 308, 63, panel);

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
    
}
