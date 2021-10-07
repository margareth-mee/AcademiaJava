package P1;

public class Tela {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno(); 

        aluno1.setNome_completo("Maykon Granemann");
        aluno1.setIdade(18);
        aluno1.setMatricula("114110571");
        
        aluno2.setNome_completo("Cintia Maria");
        aluno2.setIdade(30);
        aluno2.setMatricula("114110577");

        System.out.println(aluno1);
        System.out.println(aluno2);

    }
    
}
