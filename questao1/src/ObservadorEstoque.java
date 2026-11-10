public interface ObservadorEstoque {
    void estoqueAlterado(String produto, int anterior, int atual);
}
