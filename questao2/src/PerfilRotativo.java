public class PerfilRotativo implements PerfilStrategy {
    private static final double vlr_por_hora = 15.00;

    @Override
    public double calcular(int minutos) {
        int minutosCobrados = Math.max(0, minutos);
        double horasIniciadas = Math.ceil(minutosCobrados / 60.0);
        return horasIniciadas * vlr_por_hora;
    }
}
