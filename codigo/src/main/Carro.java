public class Carro extends Veiculo {
    private final double IPVA = 0.04;
    private final double TAXA_SEGURO = 0.05;
    private final double SEGURO_ADICIONAL = 300;
    private final double TAXA_ALINHAMENTO = 80;
    private final double KM_ALINHAMENTO = 10000;

    public Carro(double valorVenda, Integer kilometragem, String placa) {
        super(valorVenda, kilometragem, placa);
        this.tanque = 50;
    }

    @Override
    protected void setGastos() {
        this.gastos = new VeiculoGastos(
                this.valorVenda,
                this.kilometragem,
                this.IPVA,
                this.TAXA_SEGURO,
                this.SEGURO_ADICIONAL,
                this.TAXA_ALINHAMENTO,
                this.KM_ALINHAMENTO
        );
    }
}

