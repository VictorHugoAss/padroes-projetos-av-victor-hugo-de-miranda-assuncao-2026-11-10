public class PerfilConveniado implements PerfilStrategy {
    private static final int minutos_gratuitos = 30;
    private static final double vlr_por_hora = 15.00;
    private static final double desconto = 0.15;

    @Override
    public double calcular(int minutos) {
        int minutosCobrados = Math.max(0, minutos - minutos_gratuitos);
        double horasIniciadas = Math.ceil(minutosCobrados / 60.0);
        return horasIniciadas * vlr_por_hora * (1-desconto);
    }
}
