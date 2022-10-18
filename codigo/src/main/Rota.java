package main;

public class Rota {
    private String origem;
    private String destino;
    private Integer distancia;

    Rota(String origem, String destino, Integer distancia) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public Integer getDistancia() {
        return this.distancia;
    }
}
