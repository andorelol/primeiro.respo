public class Conta {
     String nomeTitular;
    int numeroConta;
     String agencia;
     double saldo;
     String dataAbertura;

    public static void main(String[] args) {
            // nova conta
            Conta minhaConta = new Conta("João", 123456, "1234-5", 1000.0, "01/01/2024");

            // Realizando operações na conta
            minhaConta.sacar(200.0);
            minhaConta.depositar(500.0);

            // Calculando o rendimento mensal
            double rendimentoMensal = minhaConta.calcularRendimento(1.5);
            System.out.println("Rendimento mensal: R$" + rendimentoMensal);

    }
    // Construtor
    public Conta(String nomeTitular, int numeroConta, String agencia, double saldo, String dataAbertura) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    //  sacar um valor do saldo
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    //  depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    //  calcular o rendimento mensal da conta
    public double calcularRendimento(double taxaMensal) {
        return saldo * (taxaMensal / 100);
    }
}
