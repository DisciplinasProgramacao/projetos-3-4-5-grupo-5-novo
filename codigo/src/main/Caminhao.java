public class Caminhao extends Veiculo implements VeiculoGastos {

    public Caminhao(double valorVenda, Integer kilometragem, String placa) {
        super(valorVenda, kilometragem, placa);
        this.tanque = 60;
    }

    public double ipva() {
        return 0.01 * this.valorVenda;
    }

    public double seguro() {
        return 0.02 * this.valorVenda + 2000;
    }

    public double alinhamento() {
        double kilometragem = getKilometragem();

        return 1000 * (kilometragem/20000);
    }

    public double vistoria() {
        double kilometragem = getKilometragem();

        return this.formatar(1000 * (kilometragem/30000));
    }

}
