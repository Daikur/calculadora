package calculator;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class gui00 extends JFrame {

    private Container panelCalculadora;
    private Container panelOperando;
    private Container panelButton;
    private Container panelResultado;
    private JButton sumar;
    private JButton restar;
    private JButton multiplicar;
    private JButton dividir;
    private JLabel text1;
    private JLabel text2;
    private JTextField operando1;
    private JTextField operando2;
    private JLabel text_resultado;
    private JTextField resultado;

    public gui00() {
        super("Calculadora");

        //Panel
        JPanel panelCalculadora = new JPanel();
        panelCalculadora.setLayout(new FlowLayout());

        JPanel panelOperando = new JPanel();
        JPanel panelButton = new JPanel();
        JPanel panelResultado = new JPanel();

        this.setLayout(new GridLayout(5, 1));
        this.add(panelCalculadora);
        this.add(panelOperando);
        this.add(panelButton);
        this.add(panelResultado);

        //Botones
        sumar = new JButton("Calcular Suma");
        restar = new JButton("Calcular Resta");
        multiplicar = new JButton("Calcular Multiplicar");
        dividir = new JButton("Calcular División");

        //Etiqueta
        text1 = new JLabel("Operando 1");
        text2 = new JLabel("Operando 2");
        text_resultado = new JLabel("Resultado");

        //Campo texto
        operando1 = new JTextField(5);
        operando2 = new JTextField(5);
        resultado = new JTextField(10);

//Añadir los botones al panel
        //Boton
        panelButton.add(sumar);
        panelButton.add(restar);
        panelButton.add(multiplicar);
        panelButton.add(dividir);

        //Operando
        panelOperando.add(text1);
        panelOperando.add(operando1);
        panelOperando.add(text2);
        panelOperando.add(operando2);

        //Resultado
        panelResultado.add(text_resultado);
        panelResultado.add(resultado);

        //Eventos
        sumar.addActionListener(new Accion());
        restar.addActionListener(new Accion());
        multiplicar.addActionListener(new Accion());
        dividir.addActionListener(new Accion());

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public class Accion implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Double f1 = new Double(operando1.getText());
            Double f2 = new Double(operando2.getText());
            double resul = 0;

            if (e.getSource() == sumar) {
                resul = (f1 + f2);
            } else if (e.getSource() == restar) {
                resul = (f1 - f2);
            } else if (e.getSource() == multiplicar) {
                resul = (f1 * f2);
            } else if (e.getSource() == dividir) {
                resul = (f1 / f2);
            }

            resultado.setText(Double.toString(resul));
        }
    }

    public static void main(String[] args) {
        gui00 aplicacion = new gui00();
    }
}
