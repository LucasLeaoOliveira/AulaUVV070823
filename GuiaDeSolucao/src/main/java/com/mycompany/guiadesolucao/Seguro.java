/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiadesolucao;

/**
 *
 * @author alunodev08
 */
public class Seguro {
    private float valor;
    private boolean vigencia;
    private Cliente proprietario;
    private Cliente[] vetorCliente;
    
    
    public Seguro(){}
    
    public Seguro(float valor, boolean vigencia, Cliente proprietario, Cliente[] vetorCliente) {
        this.valor = valor;
        this.vigencia = vigencia;
        this.proprietario = proprietario;
        this.vetorCliente = vetorCliente;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    public Cliente getProprietario() {
        return proprietario;
    }

    public void setProprietario(Cliente proprietario) {
        this.proprietario = proprietario;
    }

    public Cliente[] getVetorCliente() {
        return vetorCliente;
    }

    public void setVetorCliente(Cliente[] vetorCliente) {
        this.vetorCliente = vetorCliente;
    }
    
}
