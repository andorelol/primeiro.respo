class Conta {
    String titular;
    int numero;
    double saldo;
    
    public Conta(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
}

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("andre", 100, 200);
        System.out.println("Conta do " + c1.titular + " // numero " + c1.numero + " // saldo atual: " + c1.saldo);
    }
}







  public class Empresa {
    public static void main(String[] args) {
        int janeiro = 15000;
        int fevereiro = 23000;
        int março = 17000;
        int somaTotal = janeiro + fevereiro + março;
        double media = somaTotal / 3.0; // Calcula a média
        System.out.println("A soma total é: " + somaTotal);
        System.out.println("A média é: " + media);
    }

}
