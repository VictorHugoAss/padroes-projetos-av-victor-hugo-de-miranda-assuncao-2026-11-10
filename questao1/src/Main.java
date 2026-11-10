public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 10);
        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        produto.adicionarObservador(compras);
        produto.adicionarObservador(vendas);
        produto.adicionarObservador(auditoria);

        System.out.println("Estoque: 10 -> 4");
        produto.alterarQuantidade(4);
        System.out.println("Estoque: 4 -> 0");
        produto.alterarQuantidade(0);
        System.out.println("Estoque: 0 -> 7");
        produto.alterarQuantidade(7);
        System.out.println("Estoque: 7 -> 7 (nenhum aviso)");
        produto.alterarQuantidade(7);

        produto.removerObservador(compras);
        System.out.println("Compras removida. Estoque: 7 -> 3");
        produto.alterarQuantidade(3);
        System.out.println("Total de alterações: " + auditoria.getRegistros().size());
    }
}
