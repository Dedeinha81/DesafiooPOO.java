package Dominio.Desafio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Botcamp bootcamp = new Botcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Deve deveAndrea = new Deve();
        deveAndrea.setNome("Andrea");
        deveAndrea.inscreverBotcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Andrea:" + deveAndrea.getConteudosInscritos());
        deveAndrea.progredir();
        deveAndrea.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Andrea:" + deveAndrea.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Andrea:" + deveAndrea.getConteudosConcluidos());
        System.out.println("XP:" + deveAndrea.calcularTotalXp());

        System.out.println("-------");

        Deve deveSham = new Deve();
        deveSham.setNome("Sham");
        deveSham.inscreverBotcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Sham:" + deveSham.getConteudosInscritos());
        deveSham.progredir();
        deveSham.progredir();
        deveSham.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Sham:" + deveSham.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Sham:" + deveSham.getConteudosConcluidos());
        System.out.println("XP:" + deveSham.calcularTotalXp());

    }


}
