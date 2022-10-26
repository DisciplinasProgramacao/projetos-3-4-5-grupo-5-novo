public class Carro extends Veiculo {
    public Carro(double valorVenda, Integer kilometragem, String placa) {
        super(valorVenda, kilometragem, placa);
        this.tanque = 50;
    }

    public double ipva() {
        return gastos.ipva(0.04);
    }

    public double seguro() {
        return gastos.seguro(0.05, 300);
    }

    public double alinhamento() {
        return gastos.alinhamento(80, 10000);
    }

}

