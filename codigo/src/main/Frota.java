import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Frota {
    private List<Veiculo> veiculos = new ArrayList<Veiculo>();

    public void inserirVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void localizarVeiculo(String placa) {
        for(Veiculo veiculo: veiculos) {
            if(Objects.equals(veiculo.getPlaca(), placa))
                System.out.println(veiculo);
        }
    }
}
