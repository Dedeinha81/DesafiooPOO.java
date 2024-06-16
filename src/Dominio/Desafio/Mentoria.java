package Dominio.Desafio;
import java.time.LocalDate;

public class Mentoria extends Conteudo {

   
    private LocalDate data;

    @Override
    public double calcularxp() {
       
        return xp_padrao + 20d;

    }

    
    public Mentoria() {
    }
   
   
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }


   


}

    