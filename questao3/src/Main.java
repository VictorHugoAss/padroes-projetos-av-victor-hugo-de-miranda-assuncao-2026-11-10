public class Main {
    public static void main(String[] args) {
        Bebida pedido1 = new Espresso();
        Bebida pedido2 = new Leite(new Cha());

        Bebida pedido3 = new Espresso();
        pedido3 = new Leite(pedido3);
        pedido3 = new Chantilly(pedido3);
        pedido3 = new Calda(pedido3);

        exibitPedido(pedido1);
        exibitPedido(pedido2);
        exibitPedido(pedido3);
    }

    private static void exibitPedido(Bebida pedido) {
        System.out.printf("%s: R$ %.2f%n",
                pedido.getDescricao(), pedido.getPreco());
    }
}
