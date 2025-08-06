public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Banco Digital");

        Cliente cliente1 = new Cliente("Jorge Henrique");
        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        cc.depositar(1000);
        cc.transferir(250, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        banco.listarContas();
    }
}
