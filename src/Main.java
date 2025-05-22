public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Alice", 15);
        Cliente cliente2 = new Cliente(2, "Bruno", 5);


        ContaCliente conta1 = new ContaCliente(101, cliente1, 500.0);
        ContaCliente conta2 = new ContaCliente(102, cliente2); // saldo 0.0

        FaturaCliente fatura1 = new FaturaCliente(201, cliente1, 300.0);
        FaturaCliente fatura2 = new FaturaCliente(202, cliente2, 100.0);


        System.out.println("🧾 Contas dos clientes:");
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println();

        conta2.addDeposito(150.0);
        conta2.subSaldo(50.0);
        conta1.subSaldo(700.0); // saldo insuficiente

        System.out.println();
        System.out.println("💳 Faturas:");
        mostrarFatura(fatura1);
        mostrarFatura(fatura2);

        FaturaCliente fatura3 = new FaturaCliente(203);
        fatura3.setValor(200);
        mostrarFatura(fatura3);
    }

    public static void mostrarFatura(FaturaCliente fatura) {
        System.out.println(fatura);
        System.out.printf("Valor com desconto: R$ %.2f%n", fatura.getValorComDesconto());
        System.out.println("---------------------------------------------------");
    }
}