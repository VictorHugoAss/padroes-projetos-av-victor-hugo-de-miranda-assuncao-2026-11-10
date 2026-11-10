public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 10);
        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        produto.adicionarObservador(compras);
        produto.adicionarObservador(vendas);
        produto.adicionarObservador(auditoria);

        System.out.println("\nEstoque: 10 -> 4");
        produto.alterarQuantidade(4);
        System.out.println("\nEstoque: 4 -> 0");
        produto.alterarQuantidade(0);
        System.out.println("\nEstoque: 0 -> 7");
        produto.alterarQuantidade(7);
        System.out.println("\nEstoque: 7 -> 7 (nenhum aviso)");
        produto.alterarQuantidade(7);

        produto.removerObservador(compras);
        System.out.println("\nCompras removida. Estoque: 7 -> 3");
        produto.alterarQuantidade(3);
        System.out.println("\nTotal de alterações: " + auditoria.getRegistros().size());
    }
}
