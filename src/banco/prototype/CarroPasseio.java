package banco.prototype;

public class CarroPasseio extends Veiculo {

    private int numeroPortas;

    public CarroPasseio(String modelo, String marca, String cor, int numeroRodas, int numeroPortas) {
        super(modelo, marca, cor, numeroRodas);
        this.numeroPortas = numeroPortas;
    }

    public CarroPasseio clonar() {
        CarroPasseio clone = new CarroPasseio(this.getModelo(), this.getMarca(), this.getCor(), this.getNumeroRodas(), this.numeroPortas);
        return clone;
    }

}
