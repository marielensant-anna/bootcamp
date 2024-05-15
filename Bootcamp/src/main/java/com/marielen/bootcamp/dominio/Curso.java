/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marielen.bootcamp.dominio;

import static com.marielen.bootcamp.dominio.ModeloEnsino.XP_PADRAO;


public class Curso extends ModeloEnsino {
    
    private int cargaHoraria;

    @Override
    public String toString() {
        return "Curso{" + "titulo=" + super.getTitulo() + ", descricao=" + super.getDescricao() + ", cargaHoraria=" + cargaHoraria + '}';
    }
    
     @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }
    
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
