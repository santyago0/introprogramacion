package bimestre2.semana1.proyecto_final;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MaquinaExpendedora {
    private JPanel panelPrincipal;
    private JLabel lbl_pantalla;
    private JButton btn_1;
    private JButton btn_4;
    private JButton btn_0;
    private JButton btn_2;
    private JButton btn_5;
    private JButton btn_7;
    private JButton btn_8;
    private JLabel lbl_compra;
    private JButton btn_3;
    private JButton btn_6;
    private JButton btn_9;
    private JTextField txt_dinero;
    private JLabel lbl_vuelto;
    private JButton btn_ok;
    private JButton btn_aniadir;
    private JButton btn_vuelto;
    private JButton btn_dinero;
    private JButton btn_salir;
    private JButton btn_reiniciar;
    String productos[][] = {
            {"Ruffles","Doritos","Lays","Cheetos"},
            {"Snickers","Ferrero Rocher","Kit-Kat","Manicho"},
            {"Coca-Cola","Agua","Nestea","Jugo"},
    };
    double precios[][] = {
            {0.60,0.60,0.70,0.65},
            {1.00,1.50,0.80,0.50},
            {0.60,0.50,0.75,0.55},
    };
    String info = "";
    double coste = 0;
    public MaquinaExpendedora() {
        btn_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info = btn_1.getText();
                lbl_pantalla.setText(lbl_pantalla.getText()+info);
            }
        });
        btn_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info = btn_2.getText();
                lbl_pantalla.setText(lbl_pantalla.getText()+info);
            }
        });
        btn_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info = btn_3.getText();
                lbl_pantalla.setText(lbl_pantalla.getText()+info);
            }
        });
        btn_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info = btn_4.getText();
                lbl_pantalla.setText(lbl_pantalla.getText()+info);
            }
        });
        btn_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info = btn_5.getText();
                lbl_pantalla.setText(lbl_pantalla.getText()+info);
            }
        });
        btn_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info = btn_6.getText();
                lbl_pantalla.setText(lbl_pantalla.getText()+info);
            }
        });
        btn_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info = btn_7.getText();
                lbl_pantalla.setText(lbl_pantalla.getText()+info);
            }
        });
        btn_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info = btn_8.getText();
                lbl_pantalla.setText(lbl_pantalla.getText()+info);
            }
        });
        btn_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info = btn_9.getText();
                lbl_pantalla.setText(lbl_pantalla.getText()+info);
            }
        });
        btn_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info = btn_0.getText();
                lbl_pantalla.setText(lbl_pantalla.getText()+info);
            }
        });
        btn_ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    char posicion[] = new char[2];
                    for (int i = 0; i < posicion.length; i++) {
                        posicion[i] = lbl_pantalla.getText().charAt(i);
                    }
                    lbl_pantalla.setText(productos[Integer.parseInt(String.valueOf(posicion[0]))][Integer.parseInt(String.valueOf(posicion[1]))]
                            +" -> $"+precios[Integer.parseInt(String.valueOf(posicion[0]))][Integer.parseInt(String.valueOf(posicion[1]))]);
                    lbl_compra.setText(productos[Integer.parseInt(String.valueOf(posicion[0]))][Integer.parseInt(String.valueOf(posicion[1]))]
                            +" "+lbl_compra.getText());
                    coste += precios[Integer.parseInt(String.valueOf(posicion[0]))][Integer.parseInt(String.valueOf(posicion[1]))];
                }catch (Exception error) {
                    lbl_pantalla.setText(error.getMessage());
                }
            }
        });
        btn_aniadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_pantalla.setText("");
            }
        });
        btn_vuelto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double dinero = Double.valueOf(txt_dinero.getText());
                    double vuelto = 0;
                    if (coste<=dinero) {
                        vuelto = dinero - coste;
                        lbl_vuelto.setText("$" + String.valueOf(vuelto));
                        txt_dinero.setText("");
                    }else {
                        lbl_pantalla.setText("Ingresó un saldo insuficiente");
                    }
                }catch (Exception error) {
                    lbl_pantalla.setText(error.getMessage());
                }
            }
        });
            btn_dinero.setEnabled(true);
        btn_dinero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_1.setEnabled(true);
                btn_2.setEnabled(true);
                btn_3.setEnabled(true);
                btn_4.setEnabled(true);
                btn_5.setEnabled(true);
                btn_6.setEnabled(true);
                btn_7.setEnabled(true);
                btn_8.setEnabled(true);
                btn_9.setEnabled(true);
                btn_0.setEnabled(true);
                btn_ok.setEnabled(true);
                btn_aniadir.setEnabled(true);
                btn_vuelto.setEnabled(true);
                btn_reiniciar.setEnabled(true);
                txt_dinero.setEditable(false);
            }
        });
        btn_dinero.setEnabled(false);
        txt_dinero.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==KeyEvent.VK_ENTER)
                    btn_dinero.setEnabled(true);
            }
        });
        txt_dinero.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char caracter = e.getKeyChar();
                if(!(((caracter >= '0') && (caracter <= '9') || (caracter == ('.')) ||
                        (caracter == KeyEvent.VK_BACK_SPACE) || (caracter == KeyEvent.VK_DELETE)))){
                    e.consume();
                }
            }
        });
        btn_salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn_reiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reiniciar();
            }
        });
    }
    public static void main(String[] args) {
        MaquinaExpendedora obj = new MaquinaExpendedora();
        obj.iniciar();
    }
    public void iniciar() {
        JFrame inicio = new JFrame("MÁQUINA EXPENDEDORA");
        inicio.setContentPane(new MaquinaExpendedora().panelPrincipal);
        inicio.pack();
        inicio.setVisible(true);
        inicio.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void reiniciar() {
        lbl_compra.setText("");
        lbl_pantalla.setText("");
        lbl_vuelto.setText("");
        txt_dinero.setEditable(true);
        btn_1.setEnabled(false);
        btn_2.setEnabled(false);
        btn_3.setEnabled(false);
        btn_4.setEnabled(false);
        btn_5.setEnabled(false);
        btn_6.setEnabled(false);
        btn_7.setEnabled(false);
        btn_8.setEnabled(false);
        btn_9.setEnabled(false);
        btn_0.setEnabled(false);
        btn_ok.setEnabled(false);
        btn_aniadir.setEnabled(false);
        btn_dinero.setEnabled(false);
        btn_vuelto.setEnabled(false);
        coste = 0;
    }
}
