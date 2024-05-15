/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marielen.bootcamp.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class Dev {
    
    private String nome;
    private Set<ModeloEnsino> modelosEnsinoInscritos = new LinkedHashSet<>();
    private Set<ModeloEnsino> modelosEnsinoConcluidos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<ModeloEnsino> getModelosEnsinoInscritos() {
        return modelosEnsinoInscritos;
    }

    public void setModelosEnsinoInscritos(Set<ModeloEnsino> modelosEnsinoInscritos) {
        this.modelosEnsinoInscritos = modelosEnsinoInscritos;
    }

    public Set<ModeloEnsino> getModelosEnsinoConcluidos() {
        return modelosEnsinoConcluidos;
    }

    public void setModelosEnsinoConcluidos(Set<ModeloEnsino> modelosEnsinoConcluidos) {
        this.modelosEnsinoConcluidos = modelosEnsinoConcluidos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.modelosEnsinoInscritos);
        hash = 41 * hash + Objects.hashCode(this.modelosEnsinoConcluidos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dev other = (Dev) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.modelosEnsinoInscritos, other.modelosEnsinoInscritos)) {
            return false;
        }
        return Objects.equals(this.modelosEnsinoConcluidos, other.modelosEnsinoConcluidos);
    }
    
    
    
    public void inscreverBootcamp(Bootcamp bootcamp){
        this.modelosEnsinoInscritos.addAll(bootcamp.getModelosEnsinos());
        bootcamp.getDevsInscritos().add(this);
    }
    
    public void progredir(){
        Optional<ModeloEnsino> modeloEnsino = this.modelosEnsinoInscritos.stream().findFirst();
        if (modeloEnsino.isPresent()){
            this.modelosEnsinoConcluidos.add(modeloEnsino.get());
            this.modelosEnsinoInscritos.remove(modeloEnsino.get());
        }else
            throw new RuntimeException("Dev não inscrito em nenhum modelo de ensino!");
    }
    
    public double calcularTotalXP(){
       return this.modelosEnsinoConcluidos.stream()
                .mapToDouble(ModeloEnsino::calcularXP)
                .sum();
    }
    
}
