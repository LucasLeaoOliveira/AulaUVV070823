/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiadesolucao;

/**
 *
 * @author alunodev08
 */
public class Veiculo {
    private int ano;
    private String marca;
    private String placa;
    private String cor;

    public Veiculo(int ano, String marca, String placa, String cor) {
        this.ano = ano;
        this.marca = marca;
        this.placa = placa;
        this.cor = cor;
    }

    public Veiculo() {
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
}
