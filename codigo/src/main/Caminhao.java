package main;

public class Caminhao extends Veiculo {

    public Caminhao(double valorVenda, Integer kilometragem) {
        super(valorVenda, kilometragem);
        this.tanque = 60;
    }

    @Override
    public double ipva() {
        return 0.01 * this.valorVenda;
    }

    @Override
    public double seguro() {
        return 0.02 * this.valorVenda + 2000;
    }

    @Override
    double alinhamento() {
        return 0;
    }

    @Override
    double vistoria() {
        return 0;
    }

}
