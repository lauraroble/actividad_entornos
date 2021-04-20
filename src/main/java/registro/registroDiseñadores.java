import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Mon Apr 19 21:54:12 CEST 2021
 */



/**
 * @author Laura
 */
public class registroDiseñadores extends JPanel {
    public registroDiseñadores() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Laura
        this2 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        scrollPane1 = new JScrollPane();
        label3 = new JLabel();
        scrollPane2 = new JScrollPane();
        label4 = new JLabel();
        scrollPane3 = new JScrollPane();
        label5 = new JLabel();
        scrollPane4 = new JScrollPane();
        label6 = new JLabel();
        scrollPane5 = new JScrollPane();
        crearDiseñador = new JButton();

        //======== this2 ========
        {
            this2.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder
            (0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER,javax.swing.border
            .TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt
            .Color.red),this2. getBorder()));this2. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void
            propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName()))throw new RuntimeException()
            ;}});
            this2.setLayout(new FormLayout(
                "3*(default, $lcgap), 109dlu",
                "7*(default, $lgap), 10dlu, 2*($lgap, default)"));

            //---- label1 ----
            label1.setText("DISE\u00d1ADORES");
            label1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
            this2.add(label1, CC.xy(5, 5));

            //---- label2 ----
            label2.setText("Nombre");
            label2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
            this2.add(label2, CC.xy(5, 7));
            this2.add(scrollPane1, CC.xy(7, 7));

            //---- label3 ----
            label3.setText("Departamento");
            label3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
            this2.add(label3, CC.xy(5, 9));
            this2.add(scrollPane2, CC.xy(7, 9));

            //---- label4 ----
            label4.setText("N\u00ba Proyectos");
            label4.setFont(new Font("Century Gothic", Font.PLAIN, 12));
            this2.add(label4, CC.xy(5, 11));
            this2.add(scrollPane3, CC.xy(7, 11));

            //---- label5 ----
            label5.setText("Sueldo");
            label5.setFont(new Font("Century Gothic", Font.PLAIN, 12));
            this2.add(label5, CC.xy(5, 13));
            this2.add(scrollPane4, CC.xy(7, 13));

            //---- label6 ----
            label6.setText("email");
            label6.setFont(new Font("Century Gothic", Font.PLAIN, 12));
            this2.add(label6, CC.xy(5, 15));
            this2.add(scrollPane5, CC.xy(7, 15));

            //---- crearDiseñador ----
            crearDiseñador.setText("Guardar");
            this2.add(crearDiseñador, CC.xy(7, 17));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Laura
    private JPanel this2;
    private JLabel label1;
    private JLabel label2;
    private JScrollPane scrollPane1;
    private JLabel label3;
    private JScrollPane scrollPane2;
    private JLabel label4;
    private JScrollPane scrollPane3;
    private JLabel label5;
    private JScrollPane scrollPane4;
    private JLabel label6;
    private JScrollPane scrollPane5;
    private JButton crearDiseñador;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
