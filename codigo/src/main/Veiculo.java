import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class Veiculo {
    protected double ipva;
    protected double seguro;
    protected double alinhamento;
    private String placa;
    protected Integer tanque;
    protected double valorVenda;
    protected double kilometragem;
    protected List<Rota> rotas = new ArrayList<>();

    protected VeiculoGastos gastos = new VeiculoGastos(this);

    public Veiculo(double valorVenda, Integer kilometragem, String placa) {
        this.valorVenda = valorVenda;
        this.kilometragem = kilometragem;
        this.placa = placa;
    }

    public Rota addRota(String destino, String origem, Integer distancia) {
        return new Rota(destino, origem, distancia);
    }

    public double getKilometragem() {
        double distancia = 0;

        if(this.rotas.size() > 0) {
            for (Rota rota : this.rotas) {
                distancia += rota.getDistancia();
            }
        }

        distancia += this.kilometragem;

        return distancia;
    }

    public String getPlaca() {
        return this.placa;
    }

    protected double formatar(double media) {
        DecimalFormat decimalFormat = new DecimalFormat("###.00");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        String formatDecimal = decimalFormat.format(media);
        return Double.parseDouble(formatDecimal.replace(",", "."));
    }
}
