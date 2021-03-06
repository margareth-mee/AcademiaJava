public class Dados {
    private Object[] dados;
    int tamanhoAtual;
    int posicaoAtual;

    public Dados() {
        tamanhoAtual = 5;
        posicaoAtual = 0;
        this.dados = new Object[tamanhoAtual];
    }

    public String add(Object obj) {
        verificaTamanho();
        dados[posicaoAtual] = obj;
        posicaoAtual++;
        return "Salvo com sucesso!";
    }

    public void verificaTamanho() {
        if (posicaoAtual >= dados.length) {
            tamanhoAtual += 5;
            Object[] dadosTemp = new Object[tamanhoAtual];

            for (int i = 0; i < dados.length; i++) {
                dadosTemp[i] = dados[i];
            }
            dados = dadosTemp;
        }
    }

    public int size() {
        return posicaoAtual;
    }

    public String remove(Object obj) {
        for (int i = 0; i < posicaoAtual; i++) {
            if (dados[i].equals(obj)) {
                reorganiza(i);
                posicaoAtual--;
                return "Removido com sucesso!";
            }
        }
        return "O objeto não foi encontrado!";
    }

    public void reorganiza(int posicao) {
        for (int i = posicao; i < posicaoAtual; i++) {
            this.dados[i] = this.dados[i + 1];
        }
    }

    public boolean contains(Object obj) {
        for (int i = 0; i < posicaoAtual; i++) {
            if (dados[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }
}
