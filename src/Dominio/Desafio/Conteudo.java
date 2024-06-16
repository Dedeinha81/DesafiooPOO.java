package Dominio.Desafio;

public abstract class Conteudo {

    protected final static double  xp_padrao = 10d;

  private String titulo;
  private String descricao;

  public abstract double calcularxp();

public static double getXpPadrao() {
    return xp_padrao;
}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}

  




}
