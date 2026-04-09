package br.com.restaurante.view;

import br.com.restaurante.model.Funcionario;

public class Terminal {
    public static void main(String[] args) {
        //Instanciação de objetos
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Thiago");
        System.out.println(funcionario.getNome());
        funcionario.setId(271921);
        System.out.println(funcionario.getId());
        funcionario.setAtivo(true);
        System.out.println(funcionario.getAtivo());
        funcionario.setSalario(2650.50);
        System.out.println(funcionario.getSalario());
        funcionario.setSexo('M');
        System.out.println(funcionario.getSexo());
    }
}
