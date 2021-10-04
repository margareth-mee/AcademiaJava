public class TelaPrincipalLoja {
   public static void main(String[] args) {
       Produto p1 = new Produto();

       p1.setCodigo(10002);
       p1.setDescricao("Frost-free");
       p1.setNome("Geladeira");
       p1.setValor(2500.00);

       System.out.println("---------- Produto ---------");
       System.out.println("Nome: " + p1.getNome());
       System.out.println("Descrição: " + p1.getDescricaco());
       System.out.printf("Valor %.2f\n", p1.getValor());
       System.out.println("Codigo: " + p1.getCodigo());
   } 
}
