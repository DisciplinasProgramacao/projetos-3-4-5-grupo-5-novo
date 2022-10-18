package main;

public class Furgao extends Veiculo{
    public Furgao(double valorVenda, Integer kilometragem) {
        super(valorVenda, kilometragem);
        this.tanque = 80;
    }

    @Override
    public double ipva() {
        return 0.03 * this.valorVenda;
    }

    @Override
    public double seguro() {
        return 0.03 * this.valorVenda;
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
