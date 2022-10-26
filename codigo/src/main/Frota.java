import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Frota {
    private final List<Veiculo> veiculos = new ArrayList<>();
    private final String name;

    Frota(String name) {
        this.name = name;
    }

    public String inserirVeiculo(double valorVenda, Integer kilometragem, String placa, String tipo) throws Exception {
        String formatPlaca = formatPlaca(placa);

        if(validarPlaca(formatPlaca)) {
            Veiculo veiculo;
            switch (tipo) {
                case "carro" ->
                        veiculo = new Carro(valorVenda, kilometragem, placa);
                case "van" ->
                    veiculo = new Van(valorVenda, kilometragem, placa);
                case "furgao" ->
                    veiculo = new Furgao(valorVenda, kilometragem, placa);
                case "caminhao" ->
                    veiculo = new Caminhao(valorVenda, kilometragem, placa);
                default -> {
                    return "Tipo inserido nao existe";
                }
            }
            if(localizarVeiculo(veiculo.getPlaca()) == null)
                return "Inserido";
            else
                return "Veiculo ja existe";
        }

        return "Placa invalida";
    }

    public Veiculo localizarVeiculo(String placa) throws Exception{
        String formatPlaca = formatPlaca(placa);
        if(validarPlaca(formatPlaca)) {
            for (Veiculo veiculo : veiculos) {
                if (Objects.equals(veiculo.getPlaca(), placa))
                    return veiculo;
            }

            throw new Exception("Carro não encontrado");
        } else {
            throw new Exception("Placa Invalida");
        }

    }

    public List<Veiculo> getVeiculos() {
        return this.veiculos;
    }

    private boolean validarPlaca(String placa) {
        Pattern pattern = Pattern.compile("[A-Z]{3}[0-9]{1}[A-Z]{1}[0-9]{2}|[A-Z]{3}[0-9]{4}");
        Matcher mat = pattern.matcher(placa);

        return (mat.matches());
    }

    private String formatPlaca(String placa) {
        String[] charsPlaca = placa.split("");
        StringBuilder formatPlaca = new StringBuilder();
        for(String charPlaca : charsPlaca) {
            formatPlaca.append(charPlaca.toUpperCase());
        }

        return formatPlaca.toString();
    }

    public String getName() {
        return this.name;
    }
}
