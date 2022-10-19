import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Frota {
    private List<Veiculo> veiculos = new ArrayList<>();

    public String inserirVeiculo(double valorVenda, Integer kilometragem, String placa, String tipo) {
        String formatPlaca = formatPlaca(placa);

        if(validarPlaca(formatPlaca)) {
            switch (tipo) {
                case "carro" -> {
                    Carro carro = new Carro(valorVenda, kilometragem, placa);
                    veiculos.add(carro);
                }
                case "van" -> {
                    Van van = new Van(valorVenda, kilometragem, placa);
                    veiculos.add(van);
                }
                case "furgao" -> {
                    Furgao furgao = new Furgao(valorVenda, kilometragem, placa);
                    veiculos.add(furgao);
                }
                case "caminhao" -> {
                    Caminhao caminhao = new Caminhao(valorVenda, kilometragem, placa);
                    veiculos.add(caminhao);
                }
                default -> {
                    return "Tipo inserido nao existe";
                }
            }

            return "Inserido";
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
}
