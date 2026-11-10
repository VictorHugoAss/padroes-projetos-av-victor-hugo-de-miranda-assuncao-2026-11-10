import java.util.ArrayList;
import java.util.List;

public class Auditoria implements ObservadorEstoque {
    private final List<String> registros = new ArrayList<>();

    @Override
    public void estoqueAlterado(String produto, int anterior, int atual) {
        String registro = produto + ": " + anterior + " -> " + atual;
        registros.add(registro);
        System.out.println("Auditoria: " + registro);
    }

    public List<String> getRegistros() {
        return List.copyOf(registros);
    }
}
