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
    public double alinhamento() {
        double kilometragem = getKilometragem();

        return 1000 * (kilometragem/20000);
    }

    @Override
    double vistoria() {
        double kilometragem = getKilometragem();

        return this.formatar(1000 * (kilometragem/30000));
    }

}
