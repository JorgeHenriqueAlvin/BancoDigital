import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        System.out.println("\n--- Contas do banco " + nome + " ---");
        for (Conta conta : contas) {
            conta.imprimirExtrato();
        }
    }
}
