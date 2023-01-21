package bimestre2.semana1.semana6.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValidacionCedula {
    private JTextField txt_cedula;
    private JButton btn_verificacion;
    private JLabel lbl_resultado;
    private JPanel panelPrincipal;

    public ValidacionCedula() {
        btn_verificacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cedula = txt_cedula.getText();
                int tam_cedula = cedula.length();
                if (tam_cedula!=10) {
                    lbl_resultado.setText("Dígitos de cédula incorretos");
                }else {
                    char cedula_arr[] = new char[tam_cedula];
                    int coeficientes[] = {2,1,2,1,2,1,2,1,2};
                    int resultado[] = new int[coeficientes.length];
                    for (int i = 0; i < cedula_arr.length; i++) {
                        cedula_arr[i] = cedula.charAt(i);
                    }
                    for (int i = 0; i < resultado.length; i++) {
                        resultado[i] = coeficientes[i] * Integer.parseInt(String.valueOf(cedula_arr[i]));
                        if (resultado[i] >= 10)
                            resultado[i] = resultado[i] - 9;
                    }
                    int suma_resultado = 0;
                    for (int i = 0; i < resultado.length; i++) {
                        suma_resultado = suma_resultado + resultado[i];
                    }
                    int residuo = suma_resultado%10;
                    if (residuo == 0){
                        int verificador_1 = residuo;
                        if (verificador_1 == (Integer.parseInt(String.valueOf(cedula_arr[9])))) {
                            lbl_resultado.setText("Cédula correcta");
                        }else {
                            lbl_resultado.setText("Cédula incorrecta");
                        }
                    }else {
                        int verificador_2 = 10 - residuo;
                        if (verificador_2 == (Integer.parseInt(String.valueOf(cedula_arr[9])))) {
                            lbl_resultado.setText("Cédula correcta");
                        }else {
                            lbl_resultado.setText("Cédula incorrecta");
                        }
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame inicio = new JFrame("SumaNúmero");
        inicio.setContentPane(new ValidacionCedula().panelPrincipal);
        inicio.pack();
        inicio.setVisible(true);
    }
}
