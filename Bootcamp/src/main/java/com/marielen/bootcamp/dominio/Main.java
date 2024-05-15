/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.marielen.bootcamp.dominio;

import java.time.LocalDate;


public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso da linguagem Java");
        curso1.setCargaHoraria(16);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("POO");
        curso2.setDescricao("Curso de Paradigma de Linguagem Orientada a Objetos");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Boas práticas");
        mentoria1.setDescricao("Mentoria sobre boas práticas na linguagem Java");
        mentoria1.setData(LocalDate.of(2024, 5, 18));
        
        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Programação com IA");
        mentoria2.setDescricao("Mentoria sobre programação conciliada com Inteligência Artificial");
        mentoria2.setData(LocalDate.of(2024, 5, 14));
        
        Bootcamp bootcamp = new Bootcamp();
        
        bootcamp.setNome("Santander 2024 - Backend com Java");
        bootcamp.setDescricao("Bootcamp Santander 2024 - Backend com Java pela plataforma DIO");
        bootcamp.getModelosEnsinos().add(curso2);
        bootcamp.getModelosEnsinos().add(curso1);
        bootcamp.getModelosEnsinos().add(mentoria1);
        bootcamp.getModelosEnsinos().add(mentoria2);
        
        Dev dev1 = new Dev();
        dev1.setNome("Marielen");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        dev1.progredir();
        System.out.println("Concluidos: " + dev1.getModelosEnsinoConcluidos());
        System.out.println("Inscritos: " + dev1.getModelosEnsinoInscritos());
        System.out.println("XP's conquistados: " + dev1.calcularTotalXP());
        
        
       
        
        
            
        
        
        
        
        
        
        
        
    }
    
}
