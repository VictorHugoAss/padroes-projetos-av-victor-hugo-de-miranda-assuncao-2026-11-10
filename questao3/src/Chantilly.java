public class Chantilly extends Complemento {
    public Chantilly(Bebida bebida) { super(bebida); }

    @Override
    protected String nomeComplemento() { return "Chantilly"; }

    @Override
    protected double precoComplemento() { return 2.50; }
}
