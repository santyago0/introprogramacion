package bimestre2.semana1.proyecto_final;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Caratula {
    private JPanel panelCaratua;
    private JButton btn_siguiente;

    public Caratula() {
        btn_siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MaquinaExpendedora cambio = new MaquinaExpendedora();
                cambio.iniciar();
            }
        });
    }

    public static void main(String[] args) {
        Caratula obj = new Caratula();
        obj.iniciar();
    }
    public void iniciar(){
        JFrame inicio = new JFrame("MÁQUINA EXPENDEDORA");
        inicio.setContentPane(new Caratula().panelCaratua);
        inicio.pack();
        inicio.setVisible(true);
        inicio.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
