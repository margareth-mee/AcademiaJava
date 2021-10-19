public class Dados {
    private Object[] dados;
    int tamanhoAtual;
    int posicaoAtual;

    public Dados(){
        tamanhoAtual = 5;
        posicaoAtual = 0;
        this.dados = new Object[tamanhoAtual];
    }

    public String add(Object obj){

        if(posicaoAtual < dados.length){
            dados[posicaoAtual] = obj;
            posicaoAtual++;
        }else{
            tamanhoAtual = tamanhoAtual*2;
            Object[] dadosTemp = new Object[tamanhoAtual];

            for (int i = 0; i < dados.length; i++) {
                dadosTemp[i] = dados[i];                
            }

            dados = dadosTemp;
        }
        return "Salvo com sucesso!";
    }
    
    public int size(){
        return posicaoAtual + 1;
    }

    public String remove(Object obj){
        for (int i = 0; i < dados.length; i++) {
            if(dados[i].equals(obj)){
                reorganiza(i);
                posicaoAtual--;
                return "Removido com sucesso!";
            }
        }
        return "O objeto não foi encontrado!";
    }

    public void reorganiza(int posicao){
        for (int i = posicao; i < dados.length - 1; i++) {
            this.dados[i] = this.dados[i+1];
        }
    }

    public boolean contains(Object obj){
        for (int i = 0; i < posicaoAtual; i++) {
            if(dados[i].equals(obj)){
                return true;
            }
        }
        return false;
    }
}
