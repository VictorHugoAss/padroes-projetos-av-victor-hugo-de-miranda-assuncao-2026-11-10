public class Vendas implements ObservadorEstoque {
    @Override
    public void estoqueAlterado(String produto, int anterior, int atual) {
        if (anterior == 0 && atual > 0) {
            System.out.println("Vendas: " + produto + " voltou ao estoque (" + atual + ").");
        }
    }
}
