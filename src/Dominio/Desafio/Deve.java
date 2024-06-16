package Dominio.Desafio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Deve {
    private String nome;
    private Set<Conteudo>conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo>conteudosConcluidos = new LinkedHashSet<>();
    

    public void inscreverBotcamp(Botcamp botcamp){
        this.conteudosInscritos.addAll(botcamp.getConteudos());
        botcamp.getDevesInscritos().add(this);

        
    }
    

    public void progredir(){
      Optional<Conteudo>conteudos = this.conteudosInscritos.stream().findFirst();
      if(conteudos.isPresent()){
        this.conteudosConcluidos.add(conteudos.get());
        this.conteudosInscritos.remove(conteudos.get());

      }else{
        System.err.println("Voce nao esta matriculado em nenhum conteudo");
      }
    }

    public double calcularTotalXp(){
       return this.conteudosConcluidos.stream().mapToDouble(conteudo->conteudo.calcularxp()).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }


}
