public class ContaCliente {
    private int id;
    private Cliente cliente;
    private double saldo = 0.0;


    public ContaCliente(int id, Cliente cliente, double saldo) {
        this.id = id;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public ContaCliente(int id, Cliente cliente) {
        this(id, cliente, 0.0);
    }


    public ContaCliente(int id) {
        this(id, null, 0.0);
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String nome = (cliente != null) ? cliente.getNome() : "Sem cliente";
        return String.format("%s(%d) saldo=R$%.2f", nome, id, saldo);
    }

    public double addDeposito(double valor) {
        saldo += valor;
        System.out.printf("Depósito de R$%.2f realizado. Novo saldo: R$%.2f%n", valor, saldo);
        return saldo;
    }

    public double subSaldo(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para retirada.");
            return saldo;
        }
        saldo -= valor;
        System.out.printf("Retirada de R$%.2f realizada. Novo saldo: R$%.2f%n", valor, saldo);
        return saldo;
    }
}