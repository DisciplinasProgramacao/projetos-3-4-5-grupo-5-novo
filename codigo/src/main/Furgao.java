public class Furgao extends Veiculo {
    private double vistoria;

    public Furgao(double valorVenda, Integer kilometragem, String placa) {
        super(valorVenda, kilometragem, placa);
        this.tanque = 80;
    }

    public double ipva() {
        return gastos.ipva(0.03);
    }

    public double seguro() {
        return gastos.seguro(0.03, 0);
    }

    public double alinhamento() {
        return gastos.alinhamento(120, 10000);
    }

    public double vistoria() {
        double kilometragem = getKilometragem();

        return this.formatar(gastos.vistoria(500, 10000));
    }
}
