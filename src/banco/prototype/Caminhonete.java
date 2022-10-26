package banco.prototype;

public class Caminhonete extends Veiculo {

    private double capCacamba;

    public Caminhonete(String modelo, String marca, String cor, int numeroRodas, double capCacamba) {
        super(modelo, marca, cor, numeroRodas);
        this.capCacamba = capCacamba;
    }

    public Caminhonete clonar() {
        Caminhonete clone = new Caminhonete(this.getModelo(), this.getMarca(), this.getCor(), this.getNumeroRodas(), this.capCacamba);
        return clone;
    }

    @Override
    public String toString() {
        return "Caminhonete{" +
                "capCacamba=" + capCacamba +
                '}';
    }

    public double getCapCacamba() {
        return capCacamba;
    }

    public void setCapCacamba(double capCacamba) {
        this.capCacamba = capCacamba;
    }
}
