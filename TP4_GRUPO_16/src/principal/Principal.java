package principal;

import java.awt.*;
import javax.swing.*;

public class Principal extends JFrame {

    private static final long serialVersionUID = 1L;

    public Principal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setLayout(null);

        JPanel panel = new JPanel(null);
        panel.setBounds(10, 30, 464, 200);
        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        getContentPane().add(panel);

        JLabel label = new JLabel("GRUPO NRO 16");
        label.setBounds(20, 10, 200, 20);
        panel.add(label);

        JButton btnEjercicio1 = new JButton("Ejercicio 1");
        btnEjercicio1.setBounds(150, 40, 150, 30);
        panel.add(btnEjercicio1);

        JButton btnEjercicio2 = new JButton("Ejercicio 2");
        btnEjercicio2.setBounds(150, 85, 150, 30);
        panel.add(btnEjercicio2);

        JButton btnEjercicio3 = new JButton("Ejercicio 3");
        btnEjercicio3.setBounds(150, 130, 150, 30);
        panel.add(btnEjercicio3);

        btnEjercicio1.addActionListener(e -> {
            Contactos contactos = new Contactos();
            contactos.setVisible(true);
        });

        btnEjercicio2.addActionListener(e -> {
            Promedio promedio = new Promedio();
            promedio.setVisible(true);
        });

        btnEjercicio3.addActionListener(e -> {
            SeleccionMultiple seleccionMultiple = new SeleccionMultiple();
            seleccionMultiple.setVisible(true);
        });
    }
}
