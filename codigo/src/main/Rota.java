public class Rota {
    private final String origem;
    private final String destino;
    private final Integer distancia;

    public Rota(String origem, String destino, Integer distancia) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public Integer getDistancia() {
        return this.distancia;
    }
}