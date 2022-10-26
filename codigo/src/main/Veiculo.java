import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class Veiculo {
    private final String placa;
    protected Integer tanque;
    protected double valorVenda;
    protected double kilometragem;
    protected List<Rota> rotas = new ArrayList<>();

    protected VeiculoGastos gastos = null;


    public Veiculo(double valorVenda, Integer kilometragem, String placa) {
        this.valorVenda = valorVenda;
        this.kilometragem = kilometragem;
        this.placa = placa;
        setGastos();
    }

    protected abstract void setGastos();

    public Rota addRota(String destino, String origem, Integer distancia) {
        novaKilometragem(distancia);
        return new Rota(destino, origem, distancia);
    }

    private void novaKilometragem(Integer distancia) {
        this.kilometragem += distancia;
    }

    public double getKilometragem() {
        return this.kilometragem;
    }

    public String getPlaca() {
        return this.placa;
    }

    public double custoTotal() {
        return gastos.custoTotal();
    }

    protected double formatar(double media) {
        DecimalFormat decimalFormat = new DecimalFormat("###.00");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        String formatDecimal = decimalFormat.format(media);
        return Double.parseDouble(formatDecimal.replace(",", "."));
    }

}
