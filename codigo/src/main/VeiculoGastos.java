public class VeiculoGastos {
    private double ipva;
    private double seguro;
    private double alinhamento;
    private double vistoria;
    private final Veiculo veiculo;


    VeiculoGastos(Veiculo veiculo) {
        this.veiculo = veiculo;
        this.vistoria = 0;

    }

    public double ipva(double taxaIpva) {
        this.ipva = taxaIpva * this.veiculo.valorVenda;
        return this.ipva;
    }

   public double seguro(double taxaSeguro, double valorExtra) {
       this.seguro = taxaSeguro * this.veiculo.valorVenda + valorExtra;
       return this.seguro;
   }

   public double alinhamento(double valor, double aCadaKm) {
       this.alinhamento = valor * (this.veiculo.kilometragem/aCadaKm);
       return this.alinhamento;
   }

   double vistoria(double valor, double aCadaKm) {
       this.vistoria = valor * (this.veiculo.kilometragem/aCadaKm);
       return this.vistoria;
   }

    double custoTotal() {
        return this.ipva + this.seguro + this.alinhamento + this.vistoria;
    }
}
