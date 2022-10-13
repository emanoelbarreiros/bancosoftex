package banco.rh;

public class PessoaFisica extends Pessoa implements Jogador, Pintor {

    private String cpf;

    public String dizerOi() {
        return "Oi, eu sou um humano.";
    }

    public void pular(){
        System.out.println("Ufa! Pulei.");
    }

    public void chutar(){
        System.out.println("Ufa! Chutei.");
    }

    public void correr(){
        System.out.println("Ufa! Corri.");
    }

    public void pintar()  {
        System.out.println("Pintei um belo quadro.");
    }

}
