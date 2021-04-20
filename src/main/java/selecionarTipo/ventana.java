import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Mon Apr 19 21:35:20 CEST 2021
 */



/**
 * @author Laura
 */
public class ventana extends JPanel {
    public ventana() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Laura
        label1 = new JLabel();
        label2 = new JLabel();
        tipoDato = new JComboBox();
        botonRegistro = new JButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.
        swing.border.EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border
        .TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog"
        ,java.awt.Font.BOLD,12),java.awt.Color.red), getBorder
        ())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java
        .beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName()))throw new RuntimeException
        ();}});
        setLayout(new FormLayout(
            "3*(default, $lcgap), default",
            "6*(default, $lgap), default"));

        //---- label1 ----
        label1.setText("REGISTRO");
        label1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        add(label1, CC.xy(5, 5));

        //---- label2 ----
        label2.setText("TIPO DE DATO");
        label2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(label2, CC.xy(5, 9));

        //---- tipoDato ----
        tipoDato.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        add(tipoDato, CC.xy(7, 9));

        //---- botonRegistro ----
        botonRegistro.setText("Crear");
        botonRegistro.addActionListener(e -> button1ActionPerformed(e));
        add(botonRegistro, CC.xy(7, 11));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Laura
    private JLabel label1;
    private JLabel label2;
    private JComboBox tipoDato;
    private JButton botonRegistro;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
