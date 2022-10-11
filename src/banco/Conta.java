package banco;

public class Conta {

    private static double limiteChequeEspecial;
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void debitar(double saldo) {
        this.saldo -= saldo;
    }

    public void creditar(double saldo) {
        this.saldo += saldo;
    }

    public static void modificarLimite(double novoLimite) {
        limiteChequeEspecial = novoLimite;
    }

    public String getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String toString() {
        return this.numero + " R$ " + this.saldo;
    }

}
