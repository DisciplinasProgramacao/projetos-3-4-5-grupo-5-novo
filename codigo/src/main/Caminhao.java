public class Caminhao extends Veiculo {
    private final double IPVA = 0.01;
    private final double TAXA_SEGURO = 0.02;
    private final double SEGURO_ADICIONAL = 2000;
    private final double TAXA_MANUTENCAO = 1000;
    private final double KM_MANUTENCAO = 20000;
    private final double TAXA_VISTORIA = 1000;
    private final double KM_VISTORIA = 30000;

    public Caminhao(double valorVenda, Integer kilometragem, String placa) {
        super(valorVenda, kilometragem, placa);
    }

    @Override
    protected void setGastos() {
        this.gastos = new VeiculoGastos(
                this.valorVenda,
                this.kilometragem,
                this.IPVA,
                this.TAXA_SEGURO,
                this.SEGURO_ADICIONAL,
                this.TAXA_MANUTENCAO,
                this.KM_MANUTENCAO,
                this.TAXA_VISTORIA,
                this.KM_VISTORIA
        );
    }
}
