package Dominio.Desafio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Botcamp {

    
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    private Set<Deve> devesInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Deve> getDevesInscritos() {
        return devesInscritos;
    }

    public void setDevesInscritos(Set<Deve> devesInscritos) {
        this.devesInscritos = devesInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Botcamp bootcamp = (Botcamp) o;
        return Objects.equals(nome, bootcamp.nome) && 
               Objects.equals(descricao, bootcamp.descricao) && 
               Objects.equals(dataInicial, bootcamp.dataInicial) && 
               Objects.equals(dataFinal, bootcamp.dataFinal) && 
               Objects.equals(devesInscritos, bootcamp.devesInscritos) && 
               Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devesInscritos, conteudos);
    }
}
