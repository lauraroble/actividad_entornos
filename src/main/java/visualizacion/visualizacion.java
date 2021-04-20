import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Mon Apr 19 22:10:33 CEST 2021
 */



/**
 * @author Laura
 */
public class visualizacion extends JPanel {
    public visualizacion() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Laura
        this2 = new JPanel();
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        Buscar = new JButton();

        //======== this2 ========
        {
            this2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
            . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder
            . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .
            awt .Font .BOLD ,12 ), java. awt. Color. red) ,this2. getBorder( )) )
            ; this2. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
            ;
            this2.setLayout(new FormLayout(
                "3*(default, $lcgap), 109dlu",
                "7*(default, $lgap), 10dlu, 2*($lgap, default)"));

            //---- label1 ----
            label1.setText("DISE\u00d1ADORES");
            label1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
            this2.add(label1, CC.xy(5, 5));
            this2.add(scrollPane1, CC.xywh(4, 7, 4, 1));

            //---- Buscar ----
            Buscar.setText("Buscar");
            this2.add(Buscar, CC.xy(5, 9));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Laura
    private JPanel this2;
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JButton Buscar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
