public class Furgao extends Veiculo implements VeiculoGastos {
    public Furgao(double valorVenda, Integer kilometragem, String placa) {
        super(valorVenda, kilometragem, placa);
        this.tanque = 80;
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

    public double custoTotal(){
        return ipva() + seguro() + alinhamento() + vistoria();
     }
}
