public class Carro extends Veiculo {
    public Carro(double valorVenda, Integer kilometragem) {
        super(valorVenda, kilometragem);
        this.tanque = 50;
    }

    @Override
    public double ipva() {
        return 0.04 * this.valorVenda;
    }

    @Override
    public double seguro() {
        return 0.05 * this.valorVenda + 300;
    }

    @Override
    public double alinhamento() {
        double kilometragem = getKilometragem();

        return 80 * (kilometragem/10000);
    }

    @Override
    double vistoria() {
        return 0;
    }

}

