public abstract class Complemento implements Bebida {
    private final Bebida bebida;

    protected Complemento(Bebida bebida) {
        this.bebida = bebida;
    }

    protected abstract String nomeComplemento();
    protected abstract double precoComplemento();

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + " + nomeComplemento();
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + precoComplemento();
    }
}
