package modulo1;

public class Principal {
    public static void main(String[] args) {
        System.out.println("======== Cadastro de Pessoas =======");
        
        Pessoa person1 = new Pessoa();
        person1.nome = "Margareth";
        person1.sobrenome = "Lima";
        person1.idade = 25;
        
        Pessoa person2 = new Pessoa();
        person2.nome = "Adriana";
        person2.sobrenome = "Mota";
        person2.idade = 45;

        imprimirPessoa(person1);
        imprimirPessoa(person2);
    }

    static void imprimirPessoa(Pessoa person){
        System.out.println("Cadastro realizado!");
        System.out.println("Nome: " + person.nome + " " + person.sobrenome);
        System.out.println("Idade: " + person.idade);
    }
}
