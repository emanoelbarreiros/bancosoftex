package banco.prototype;

public class Aplicacao {

    private Veiculo[] veiculos;

    public Aplicacao() {
        veiculos = new Veiculo[6];
        Caminhonete cam = new Caminhonete("Toro",
                "Fiat", "branca",
                4, 450.0);
        veiculos[0] = cam;
        veiculos[1] = cam.clonar();
        veiculos[2] = cam.clonar();

        CarroPasseio carro = new CarroPasseio("Cronos", "Fiat",
                "preto", 4, 4);

        veiculos[3] = carro;
        veiculos[4] = carro.clonar();
        veiculos[5] = carro.clonar();
    }

    public Veiculo[] clonarVeiculos() {
        Veiculo[] novosVeiculos = new Veiculo[veiculos.length];
        for (int i = 0; i < novosVeiculos.length; i++) {
            novosVeiculos[0] = veiculos[0].clonar();
        }

        return novosVeiculos;
    }
}
