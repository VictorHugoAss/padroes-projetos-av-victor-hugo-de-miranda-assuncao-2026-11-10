public class PerfilMensalista implements PerfilStrategy {

    private static final double vlr_fixo = 10.00;

    @Override
    public double calcular(int minutos) {
        return vlr_fixo;
    }
}
