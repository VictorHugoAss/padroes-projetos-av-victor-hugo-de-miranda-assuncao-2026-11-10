import java.util.ArrayList;
import java.util.List;

public class Produto {
    private final String nome;
    private int quantidade;
    private final List<ObservadorEstoque> observadores = new ArrayList<>();

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void adicionarObservador(ObservadorEstoque observador) {
        if (!observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void removerObservador(ObservadorEstoque observador) {
        observadores.remove(observador);
    }

    public void alterarQuantidade(int novaQuantidade) {
        if (quantidade == novaQuantidade) {
            return;
        }

        int anterior = quantidade;
        quantidade = novaQuantidade;
        for (ObservadorEstoque observador : observadores) {
            observador.estoqueAlterado(nome, anterior, novaQuantidade);
        }
    }
}
