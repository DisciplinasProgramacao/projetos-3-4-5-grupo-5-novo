import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Veiculo {
    public String placa;
    protected Integer tanque;
    protected double valorVenda;
    protected Integer kilometragem;
    protected List<Rota> rotas = new ArrayList<>();

    public Veiculo(double valorVenda, Integer kilometragem, String placa) {
        this.valorVenda = valorVenda;
        this.kilometragem = kilometragem;
        this.placa = placa;
    }

    public Rota addRota(String destino, String origem, Integer distancia) {
        return new Rota(destino, origem, distancia);
    }

    public Integer getKilometragem() {
        Integer distancia = 0;

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
