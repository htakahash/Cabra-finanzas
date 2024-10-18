import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyPanel extends JPanel {
    private JButton jcomp1;
    private JButton jcomp2;
    private JLabel jcomp3;
    private JTextField jcomp4;
    private JLabel jcomp5;
    private JComboBox jcomp6;
    private JButton jcomp7;
    private JButton jcomp8;
    private JButton jcomp9;
    private JButton jcomp10;
    private JButton jcomp11;
    private JLabel jcomp12;
    private JTextArea Felicidad;
    private JSlider jcomp14;
    private JLabel jcomp15;
    private JList jcomp16;
    private JLabel jcomp17;
    private JLabel jcomp18;
    private JPasswordField jcomp19;
    private JLabel jcomp20;
    private JTextField jcomp21;
    private JLabel jcomp22;
    private JTextField jcomp23;
    private JLabel jcomp24;
    private JLabel jcomp25;
    private JTextField jcomp26;
    private JLabel jcomp27;
    private JLabel jcomp28;
    private JLabel jcomp29;
    private JTextField jcomp31;
    private JLabel jcomp32;
    private JLabel jcomp33;
    private JLabel jcomp34;
    private JTextField jcomp36;
    private JLabel jcomp37;
    private JLabel jcomp38;
    private JLabel jcomp39;
    private JTextField jcomp40;

    public MyPanel() {
        setupComponents();
        addActionListeners();
    }

    private void setupComponents() {
        setPreferredSize(new Dimension(626, 331));
        setLayout(null);

        jcomp1 = new JButton("Indice");
        jcomp2 = new JButton("Mascota");
        jcomp7 = new JButton("Ingresos");
        jcomp8 = new JButton("Gastos");
        jcomp9 = new JButton("Alertas");
        jcomp10 = new JButton("Deudas");
        jcomp11 = new JButton("Metas");

        add(jcomp1);
        add(jcomp2);
        add(jcomp7);
        add(jcomp8);
        add(jcomp9);
        add(jcomp10);
        add(jcomp11);

        jcomp1.setBounds(5, 25, 100, 20);
        jcomp7.setBounds(5, 85, 100, 25);
        jcomp8.setBounds(5, 120, 100, 25);
        jcomp9.setBounds(5, 155, 100, 25);
        jcomp10.setBounds(5, 190, 100, 25);
        jcomp11.setBounds(5, 225, 100, 25);
    }

    private void addActionListeners() {
        jcomp7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarIngresos();
            }
        });

        jcomp8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarGastos();
            }
        });

        jcomp9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarAlertas();
            }
        });

        jcomp10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarDeudas();
            }
        });

        jcomp11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gestionarMetas();
            }
        });
    }

    private void registrarIngresos() {
        JOptionPane.showMessageDialog(this, "Funcionalidad para registrar ingresos activada");
    }

    private void registrarGastos() {
        JOptionPane.showMessageDialog(this, "Funcionalidad para registrar gastos activada");
    }

    private void mostrarAlertas() {
        JOptionPane.showMessageDialog(this, "Mostrando alertas de gastos excesivos");
    }

    private void registrarDeudas() {
        JOptionPane.showMessageDialog(this, "Funcionalidad para registrar deudas activada");
    }

    private void gestionarMetas() {
        JOptionPane.showMessageDialog(this, "Funcionalidad para gestionar metas activada");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MyPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
