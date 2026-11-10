public class Calda extends Complemento {
    public Calda(Bebida bebida) { super(bebida); }

    @Override
    protected String nomeComplemento() { return "Calda"; }

    @Override
    protected double precoComplemento() { return 1.50; }
}
