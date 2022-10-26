public class Caminhao extends Veiculo {
    private double vistoria;

    public Caminhao(double valorVenda, Integer kilometragem, String placa) {
        super(valorVenda, kilometragem, placa);
        this.tanque = 60;
    }

    public double ipva() {
        return gastos.ipva(0.01);
    }

    public double seguro() {
        return gastos.seguro(0.02, 2000);
    }

    public double alinhamento() {
        return gastos.alinhamento(1000, 20000);
    }

    public double vistoria() {
        double kilometragem = getKilometragem();

        return this.formatar(gastos.vistoria(1000, 30000));
    }

}
