public class Ticket {
    private final String placa;
    private final int minutos;
    private PerfilStrategy perfil;

    public Ticket(String placa, int minutos, PerfilStrategy perfil) {
        this.placa = placa;
        this.minutos = minutos;
        this.perfil = perfil;
    }

    public String getPlaca() { return placa; }
    public int getMinutos() { return minutos; }

    public void setperfil(PerfilStrategy perfil) {
        this.perfil = perfil;
    }

    public double calcularValor() {
        return perfil.calcular(minutos);
    }
}
