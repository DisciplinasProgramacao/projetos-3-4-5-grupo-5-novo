package main;

public class Van extends Veiculo{
    public Van(double valorVenda, Integer kilometragem) {
        super(valorVenda, kilometragem);
        this.tanque = 250;
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
