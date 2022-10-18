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
