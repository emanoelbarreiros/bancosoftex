package banco;

import java.math.BigDecimal;

public class Conta {

    public static double limiteChequeEspecial = 1000.0;
    private String numero;
    public double saldo;

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

//    public static void modificarLimite(double novoLimite) {
//        limiteChequeEspecial = novoLimite;
//    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    public double getSaldo() {
        return this.saldo;
    }

    public String toString() {
        return this.numero + " R$ " + this.saldo;
    }

}
