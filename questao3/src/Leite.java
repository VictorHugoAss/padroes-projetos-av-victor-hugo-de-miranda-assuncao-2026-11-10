public class Leite extends Complemento {
    public Leite(Bebida bebida) { super(bebida); }

    @Override
    protected String nomeComplemento() { return "Leite"; }

    @Override
    protected double precoComplemento() { return 2.00; }
}
