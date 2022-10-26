public class VeiculoGastos {
    private final double valorVenda;
    private final double kilometragem;
    private final double ipva;
    private final double seguro;
    private final double alinhamento;
    private final double vistoria;

    public VeiculoGastos(
            double valorVenda,
            double kilometragem,
            double ipva,
            double taxa_seguro,
            double seguro_adicional,
            double taxa_manutencao,
            double km_manutencao,
            double taxa_vistoria,
            double km_vistoria
    ) {
        this.valorVenda = valorVenda;
        this.kilometragem = kilometragem;
        this.ipva = ipva(ipva);
        this.seguro = seguro(taxa_seguro, seguro_adicional);
        this.alinhamento = alinhamento(taxa_manutencao, km_manutencao);
        this.vistoria = vistoria(taxa_vistoria, km_vistoria);
    }

    public VeiculoGastos(
            double valorVenda,
            double kilometragem,
            double ipva,
            double taxa_seguro,
            double seguro_adicional,
            double taxa_alinhamento,
            double km_alinhamento
    ) {
        this.valorVenda = valorVenda;
        this.kilometragem = kilometragem;
        this.ipva = ipva(ipva);
        this.seguro = seguro(taxa_seguro, seguro_adicional);
        this.alinhamento = alinhamento(taxa_alinhamento, km_alinhamento);
        this.vistoria = 0;
    }

    public VeiculoGastos(
            double valorVenda,
            double kilometragem,
            double ipva,
            double taxa_seguro,
            double taxa_alinhamento,
            double km_alinhamento,
            double taxa_vistoria,
            double km_vistoria
    ) {
        this.valorVenda = valorVenda;
        this.kilometragem = kilometragem;
        this.ipva = ipva(ipva);
        this.seguro = seguro(taxa_seguro, 0);
        this.alinhamento = alinhamento(taxa_alinhamento, km_alinhamento);
        this.vistoria = vistoria(taxa_vistoria, km_vistoria);
    }

    private double ipva(double taxaIpva) {
        return taxaIpva * this.valorVenda;
    }

    public double getIpva() {
        return this.ipva;
    }

   private double seguro(double taxaSeguro, double valorExtra) {
       return taxaSeguro * this.valorVenda + valorExtra;
   }

    public double getSeguro() {
        return this.seguro;
    }

    private double alinhamento(double valor, double aCadaKm) {
       return valor * (this.kilometragem/aCadaKm);
   }

    public double getAlinhamento() {
        return this.alinhamento;
    }

    public double getManutencao() {
        return this.alinhamento;
    }

    private double vistoria(double valor, double aCadaKm) {
       return valor * (this.kilometragem/aCadaKm);
   }

    public double getVistoria() {
        return this.vistoria;
    }

    double custoTotal() {
        return this.ipva + this.seguro + this.alinhamento + this.vistoria;
    }
}
