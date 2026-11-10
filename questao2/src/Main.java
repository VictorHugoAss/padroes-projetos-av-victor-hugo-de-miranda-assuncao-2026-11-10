public class Main {
    public static void main(String[] args){
        Ticket ticket = new Ticket("SEW5G64", 180,new PerfilRotativo());
        System.out.println("Ticket: " + ticket.getPlaca() + " | " + ticket.getMinutos() + " min");

        System.out.println("Valor Rotativo: " + ticket.calcularValor());

        ticket.setperfil(new PerfilMensalista());
        System.out.println("Valor Mensalista: " + ticket.calcularValor());

        ticket.setperfil(new PerfilConveniado());
        System.out.println("Valor Conveniado: " +ticket.calcularValor());
    }
}
