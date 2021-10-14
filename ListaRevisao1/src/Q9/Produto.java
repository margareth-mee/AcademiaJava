package Q9;

import java.util.Random;

public class Produto {
  private String codigo;
  private String nome;
  private String descricao;
  private double valor;
  
  public Produto(){
      geraCodigo();
  }

  public void setCodigo(String codigo) {
      this.codigo = codigo;
  }
  public void setNome(String nome) {
      this.nome = nome;
  }
  public String getNome() {
      return nome;
  }
  public void setDescricao(String descricao) {
      this.descricao = descricao;
  }
  public String getDescricao() {
      return descricao;
  }
  public void setValor(double valor) {
      this.valor = valor;
  }
  public double getValor() {
      return valor;
  }
  private void geraCodigo(){
    Random gerador = new Random();
    this.codigo = Integer.toString( gerador.nextInt(1000));
  }
  @Override
  public String toString() {
      return "Código: " + this.codigo + "\nNome: " + this.nome + "\nDescrição: " + this.descricao + "\nValor: " + this.valor;
  }
}
