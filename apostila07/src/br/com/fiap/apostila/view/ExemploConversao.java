package br.com.fiap.apostila.view;

import javax.swing.*;

public class ExemploConversao {
    public static void main(String[] args) {

        String baseStr = JOptionPane.showInputDialog("Digite a base do retangulo");
        double valorBase = Double.parseDouble(baseStr);

        String alturaStr = JOptionPane.showInputDialog("Digite a altura");
        double valorAltura = Double.parseDouble(alturaStr);

        double area = valorAltura * valorBase;

        JOptionPane.showMessageDialog(null, "Valor da área: " + area);
    }
}
