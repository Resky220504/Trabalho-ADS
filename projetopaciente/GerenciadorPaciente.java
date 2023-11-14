/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopaciente;

import java.util.Scanner;

public class GerenciadorPaciente {
    private Paciente paciente;

    // Construtor
    public GerenciadorPaciente() {
        // Inicialmente, o paciente é nulo
        this.paciente = null;
    }

    // Métodos
    public void registrarPaciente(String tipoSangue, double peso, double altura) {
        this.paciente = new Paciente(tipoSangue, peso, altura);
        System.out.println("Paciente registrado com sucesso!");
        imprimirDadosPaciente();
        confirmarOuEditar();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPeso(double peso) {
        if (paciente != null) {
            paciente.setPeso(peso);
            System.out.println("Peso atualizado com sucesso!");
            imprimirDadosPaciente();
            confirmarOuEditar();
        } else {
            System.out.println("Nenhum paciente registrado.");
        }
    }

    public void setAltura(double altura) {
        if (paciente != null) {
            paciente.setAltura(altura);
            System.out.println("Altura atualizada com sucesso!");
            imprimirDadosPaciente();
            confirmarOuEditar();
        } else {
            System.out.println("Nenhum paciente registrado.");
        }
    }

    void imprimirDadosPaciente() {
        if (paciente != null) {
            System.out.println("Dados do Paciente:");
            System.out.println("ID: " + paciente.getIdPaciente());
            System.out.println("Tipo de Sangue: " + paciente.getTipoSangue());
            System.out.println("Peso: " + paciente.getPeso());
            System.out.println("Altura: " + paciente.getAltura());
        }
    }

    private void confirmarOuEditar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja confirmar os dados? (S para Sim, qualquer outra coisa para editar)");
        String resposta = scanner.next();

        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Dados confirmados!");
        } else {
            System.out.println("====== MedSys ======");
            System.out.println("Opções de Edição:");
            System.out.println("1 - Editar Peso");
            System.out.println("2 - Editar Altura");
            System.out.println("3 - Cancelar Edição");
            System.out.println("=====================");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o novo peso:");
                    double novoPeso = lerDouble(scanner);
                    setPeso(novoPeso);
                    break;
                case 2:
                    System.out.println("Informe a nova altura:");
                    double novaAltura = lerDouble(scanner);
                    setAltura(novaAltura);
                    break;
                case 3:
                    System.out.println("Edição cancelada.");
                    break;
                default:
                    System.out.println("Opção inválida. Edição cancelada.");
            }
        }
    }

    // Método auxiliar para ler um double, tratando o ponto ou a vírgula como separador decimal
    private double lerDouble(Scanner scanner) {
        String input = scanner.next().replace(",", ".");
        return Double.parseDouble(input);
    }
}