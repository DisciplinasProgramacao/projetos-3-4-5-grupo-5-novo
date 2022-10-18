import java.util.Objects;

public abstract class Veiculo {
    protected Integer tanque;
    protected double valorVenda;
    protected Integer kilometragem;
    protected Rota[] rotas;

    Veiculo(double valorVenda, Integer kilometragem) {
        this.valorVenda = valorVenda;
        this.kilometragem = Objects.requireNonNullElse(kilometragem, 0);
    }

    abstract double ipva();

    abstract double seguro();

    abstract double alinhamento();

    abstract double vistoria();

    public Veiculo[] carregar(String path) {

        return new Veiculo[0];
    }

    public Veiculo[] salvar(String path) {

        return new Veiculo[0];
    }

    public Veiculo incluir(Veiculo veiculo) {
        return  veiculo;
    }

    public Rota addRota(String destino, String origem, Integer distancia) {

        return new Rota(destino, origem, distancia);
    }

    public Veiculo localizar(Veiculo veiculo) {

        return veiculo;
    }

    public void setKilometragem() {
        Integer distancia = 0;

        for(Rota rota : this.rotas) {
            distancia += rota.getDistancia();
        }

        distancia += this.kilometragem;
    }
}
