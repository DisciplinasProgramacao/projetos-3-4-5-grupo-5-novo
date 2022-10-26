public class Furgao extends Veiculo {
    private final int litro = 80;
    private final double IPVA = 0.03;
    private final double TAXA_SEGURO = 0.03;
    private final double TAXA_ALINHAMENTO = 120;
    private final double KM_ALINHAMENTO = 10000;
    private final double TAXA_VISTORIA = 500;
    private final double KM_VISTORIA = 10000;

    public Furgao(double valorVenda, Integer kilometragem, String placa) {
        super(valorVenda, kilometragem, placa);
        this.tanque = 80;
    }

    @Override
    protected void setGastos() {
        this.gastos = new VeiculoGastos(
                this.valorVenda,
                this.kilometragem,
                this.IPVA,
                this.TAXA_SEGURO,
                this.TAXA_ALINHAMENTO,
                this.KM_ALINHAMENTO,
                this.TAXA_VISTORIA,
                this.KM_VISTORIA
        );
    }
}
