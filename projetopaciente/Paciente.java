/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopaciente;
import java.util.UUID;

public class Paciente {private String id_Paciente;
    private String idPaciente;
    private String tipoSangue;
    private double peso;
    private double altura;

    // Construtor
    public Paciente(String tipoSangue, double peso, double altura) {
        // Gera um ID único para o paciente
        this.idPaciente = UUID.randomUUID().toString();
        this.tipoSangue = tipoSangue;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters e Setters
    public String getIdPaciente() {
        return idPaciente;
    }

    public String getTipoSangue() {
        return tipoSangue;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}