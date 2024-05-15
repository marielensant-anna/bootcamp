/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marielen.bootcamp.dominio;

import java.time.LocalDate;


public class Mentoria extends ModeloEnsino {
    
    private LocalDate data;

    @Override
    public String toString() {
        return "Mentoria{" + "titulo=" + super.getTitulo() + ", descricao=" + super.getDescricao() + ", data=" + data + '}';
    }
    
    @Override
    public double calcularXP() {
        return XP_PADRAO * 20;
    }
 
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    
}
