public class Carro extends Veiculo implements VeiculoGastos {
    public Carro(double valorVenda, Integer kilometragem, String placa) {
        super(valorVenda, kilometragem, placa);
        this.tanque = 50;
    }

    public double ipva() {
        return 0.04 * this.valorVenda;
    }

    public double seguro() {
        return 0.05 * this.valorVenda + 300;
    }

    public double alinhamento() {
        double kilometragem = getKilometragem();
        return 80 * (kilometragem/10000);
    }

    public double vistoria() {
        return 0;
    }

    public double custoTotal(){
       return ipva() + seguro() + alinhamento() + vistoria();
    }
}

