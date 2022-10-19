public class Van extends Veiculo implements VeiculoGastos {
    public Van(double valorVenda, Integer kilometragem, String placa) {
        super(valorVenda, kilometragem, placa);
        this.tanque = 250;
    }

    public double ipva() {
        return 0.03 * this.valorVenda;
    }

    public double seguro() {
        return 0.03 * this.valorVenda;
    }

    public double alinhamento() {
        double kilometragem = getKilometragem();

        return 120 * (kilometragem/10000);
    }

    public double vistoria() {
        double kilometragem = getKilometragem();

        return this.formatar(500 * (kilometragem/10000));
    }
}
