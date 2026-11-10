public class Compras implements ObservadorEstoque {
    @Override
    public void estoqueAlterado(String produto, int anterior, int atual) {
        if (atual < 5) {
            System.out.println("Compras: estoque baixo de " + produto + " (" + atual + ").");
        }
    }
}
