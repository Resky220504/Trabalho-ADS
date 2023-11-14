/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetopaciente;

import java.util.Scanner;

public class ProjetoPaciente {

    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

        GerenciadorPaciente gerenciadorPaciente = new GerenciadorPaciente();
        AgendadorConsulta agendadorConsulta = new AgendadorConsulta();
        boolean sair = false;

        while (!sair) {
            System.out.println("====== MedSys ======");
            System.out.println("1 - Registrar Paciente");
            System.out.println("2 - Editar Dados do Paciente");
            System.out.println("3 - Agendar Consulta");
            System.out.println("4 - Exportar Histórico");
            System.out.println("5 - Sair");
            System.out.println("=====================");
            System.out.print("Escolha uma opção:");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    registrarPaciente(gerenciadorPaciente, scanner);
                    break;
                case 2:
                    editarDadosPaciente(gerenciadorPaciente, scanner);
                    break;
                case 3:
                    agendadorConsulta.agendarConsulta();
                    break;
                case 4:
                    agendadorConsulta.exportarHistorico();
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    private static void registrarPaciente(GerenciadorPaciente gerenciadorPaciente, Scanner scanner) {
        System.out.println("Informe o tipo de sangue do Paciente:");
        String tipoSangue = scanner.next();
        System.out.println("Informe o peso do Paciente:");
        double peso = lerDouble(scanner);
        System.out.println("Informe a altura do Paciente:");
        double altura = lerDouble(scanner);
        gerenciadorPaciente.registrarPaciente(tipoSangue, peso, altura);
    }

    private static void editarDadosPaciente(GerenciadorPaciente gerenciadorPaciente, Scanner scanner) {
        Paciente pacienteAtual = gerenciadorPaciente.getPaciente();

        if (pacienteAtual != null) {
            System.out.println("Dados atuais do Paciente:");
            gerenciadorPaciente.imprimirDadosPaciente();
            System.out.println("Escolha uma opção para editar:");
            System.out.println("1 - Editar Peso");
            System.out.println("2 - Editar Altura");
            System.out.println("3 - Voltar");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Informe o novo peso:");
                    double novoPeso = lerDouble(scanner);
                    gerenciadorPaciente.setPeso(novoPeso);
                    break;
                case 2:
                    System.out.println("Informe a nova altura:");
                    double novaAltura = lerDouble(scanner);
                    gerenciadorPaciente.setAltura(novaAltura);
                    break;
                case 3:
                    System.out.println("Edição cancelada.");
                    break;
                default:
                    System.out.println("Opção inválida. Edição cancelada.");
            }
        } else {
            System.out.println("Nenhum paciente registrado.");
        }
    }

    // Método auxiliar para ler um double, tratando o ponto ou a vírgula como separador decimal
    private static double lerDouble(Scanner scanner) {
        String input = scanner.next().replace(",", ".");
        return Double.parseDouble(input);
    }
}