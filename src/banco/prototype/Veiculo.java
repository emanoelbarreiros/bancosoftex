package banco.prototype;

public abstract class Veiculo implements Prototype {

    private String modelo;
    private String marca;
    private String cor;
    private int numeroRodas;

    public Veiculo() {
        super();
    }

    public Veiculo(String modelo, String marca, String cor, int numeroRodas) {
        super();
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.numeroRodas = numeroRodas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    public abstract Veiculo clonar();
}
