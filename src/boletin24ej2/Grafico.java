package boletin24ej2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * 2- Crea unha aplicación con  un marco que ten de título “ CURSO DAM “ e 2 botons :
 programación e outro bases . Se prememos o botón programación  o titulo do JFrame debe
 ser  programación  e se prememos bases debe ser bases de datos.
 */
/**
 *
 * @author bhernandezsouto
 */
public class Grafico extends javax.swing.JFrame {

    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;

    public void formar() {
        marco = new JFrame();
        panel = new JPanel();
        boton1 = new JButton("Bases");
        boton2 = new JButton("Programación");
        marco.setVisible(true);
        panel.setVisible(true);
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void botonPulsado(java.awt.event.MouseListener evt) {
                marco.setName("Bases.");
            }
        });

        boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void botonPulsado(java.awt.event.MouseEvent evt) {
                marco.setName("Programación.");
            }
        });

    }
