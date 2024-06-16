package Dominio.Desafio;

public class Curso extends Conteudo {
    private int CargaHoraria;

   @Override
   public double calcularxp() {
       
       return xp_padrao * CargaHoraria;
   }
   

   
public Curso () {
}


public int getCargaHoraria() {
    return CargaHoraria;
}
public void setCargaHoraria(int cargaHoraria) {
    CargaHoraria = cargaHoraria;
}
@Override
public String toString() {
    return "Curso [titulo=" +getTitulo() + ", descricao=" + getDescricao() + ", CargaHoraria=" + CargaHoraria + "]";
}




   

}
