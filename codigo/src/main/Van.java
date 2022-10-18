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
    public double alinhamento() {
        double kilometragem = getKilometragem();

        return 120 * (kilometragem/10000);
    }

    @Override
    double vistoria() {
        double kilometragem = getKilometragem();

        return this.formatar(500 * (kilometragem/10000));
    }
}
