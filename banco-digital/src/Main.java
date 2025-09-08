public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Fabio Francisco");
        ContaCorrente cc = new ContaCorrente(1234, 56789, cliente);
        
        cc.depositar(1000.0);
        cc.sacar(200.0);

        ContaPoupanca cp = new ContaPoupanca(1234, 98765, cliente);

        cc.transferir(500, cp);

        System.out.println("Saldo atual Conta: " + cc.getSaldo());
        System.out.println("Saldo atual Poupança: " + cp.getSaldo());
    }
}
