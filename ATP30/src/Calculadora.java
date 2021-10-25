public class Calculadora {
    private int n1;
    private int n2;

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN1() {
        return n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN2() {
        return n2;
    }

    public int soma() {
        return n1 + n2;
    }

    public int subtracao() {
        return n1 - n2;
    }

    public int multiplicacao() {
        return n1 * n2;
    }

    public int divisao() {
        int resultado = 0;

        try{
            resultado = n1 / n2;
        }catch(ArithmeticException ex){
            System.out.println("Não é possível dividir um número por 0.");
        }
        return resultado;
    }
}
