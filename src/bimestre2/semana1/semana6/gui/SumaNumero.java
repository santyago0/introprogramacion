package bimestre2.semana1.semana6.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumaNumero {
    private JPanel panelPrincipal;
    private JTextField txt_n1;
    private JTextField txt_n2;
    private JButton btn_suma;
    private JLabel lbl_resultado;
    private JButton btn_resta;
    private JButton btn_multiplicacion;
    private JButton btn_division;

    public SumaNumero() {
        btn_suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int suma = Integer.parseInt(txt_n1.getText()) + Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(suma));
            }
        });

        btn_resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resta = Integer.parseInt(txt_n1.getText()) - Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(resta));
            }
        });

        btn_multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int multiplicacion = Integer.parseInt(txt_n1.getText()) * Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(multiplicacion));
            }
        });

        btn_division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double division = Integer.parseInt(txt_n1.getText())/Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(division));
            }
        });
    }

    public static void main(String[] args) {
        JFrame inicio = new JFrame("SumaNúmero");
        inicio.setContentPane(new SumaNumero().panelPrincipal);
        inicio.pack();
        inicio.setVisible(true);
    }
}
