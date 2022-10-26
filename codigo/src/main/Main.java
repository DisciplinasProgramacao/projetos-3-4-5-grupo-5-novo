import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Main {
    static Frota frota = new Frota();

    public static void main(String[] args) throws Exception {
        int valorInserido = 1;
        while (valorInserido != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(
                    "Qual operação voce deseja fazer \n" +
                            "1. Carregar veiculos \n" +
                            "2. Salvar veiculos \n" +
                            "3. Localizar veiculos\n" +
                            "4. Incluir veiculo\n" +
                            "5. Incluir rota\n" +
                            "6. Imprimir relatorio do veículo \n" +
                            "0. Para terminar a aplicação \n");
            valorInserido = scanner.nextInt();
            System.out.println(valorInserido);
            switch (valorInserido) {
                case 1:
                    carregarVeiculos();
                    break;
                case 2:
                    Carro carro = new Carro(15000, 200000, "crr123");
                    salvarVeiculos(carro);
                    break;
                case 3:
                    localizarVeiculo();
                    break;
                case 4:
                    if (inserirVeiculo())
                        System.out.println("Veiculo inserida");
                    else
                        System.out.println("Houve um problema na insercao da veiculo");
                    break;
                case 5:
                    if (inserirRota())
                        System.out.println("Rota inserida");
                    else
                        System.out.println("Houve um problema na insercao da rota");
                    break;
                case 6:
                    System.out.println("Implementação em construção volte mais tarde");
                case 0:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opcao selecionada nao existe");
                    break;
            }
        }
    }

    private static void salvarVeiculos(Veiculo veiculo) throws IOException {
        try {
            FileOutputStream f = new FileOutputStream(new File("salvar.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(veiculo);
            o.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    private static Object carregarVeiculos() {
        try {
            FileInputStream a = new FileInputStream("salvar.txt");
            ObjectInputStream c = new ObjectInputStream(a);
            Object b = c.readObject();
            c.close();
            return b;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    private static boolean inserirRota() throws Exception {
        Scanner scanner = new Scanner(System.in);

        String placa;
        Veiculo veiculo;
        String origem;
        String destino;
        int distancia;

        System.out.println("Para a insercao do veiculo precisaremos do seguintes dados");
        System.out.println("Placa");
        placa = scanner.next();
        veiculo = tryLocalizarVeiculo(placa);
        if (veiculo == null) {
            return false;
        }

        System.out.println("Endereço de origem");
        origem = scanner.next();

        System.out.println("Endereço de destino");
        destino = scanner.next();

        System.out.println("Distancia em kilometros");
        distancia = scanner.nextInt();

        veiculo.addRota(destino, origem, distancia);

        return true;
    }

    private static Veiculo localizarVeiculo() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String placa;

        System.out.println("Informe a placa do veiculo que deseja localizar");
        placa = scanner.next();

        return tryLocalizarVeiculo(placa);
    }

    private static Veiculo tryLocalizarVeiculo(String placa) {
        Scanner scanner = new Scanner(System.in);
        try {
            return frota.localizarVeiculo(placa);
        } catch (Exception error) {
            if (error.getMessage().equals("Carro não encontrado")) {
                System.out.println("Carro com a placa inserida não encontrado");
                return null;
            } else if (error.getMessage().equals("Placa Invalida")) {
                System.out.println("Insira uma placa valida");
                placa = scanner.next();
                return tryLocalizarVeiculo(placa);
            } else {
                return null;
            }
        }
    }

    private static boolean inserirVeiculo() {
        Scanner scanner = new Scanner(System.in);

        String placa;
        double valorVenda;
        Integer kilometragem;
        String tipo;
        int tipoNumber;

        System.out.println("Para a insercao do veiculo precisaremos do seguintes dados");

        System.out.println("Placa");
        placa = scanner.next();

        System.out.println("Valor de venda");
        valorVenda = scanner.nextDouble();

        System.out.println("Kilometragem");
        kilometragem = scanner.nextInt();

        System.out.println(
                "tipo (insira o numero correspondente ao tipo)\n" +
                        "1. Carro\n" +
                        "2. Van\n" +
                        "3. Furgao\n" +
                        "4. Caminhao\n");
        tipoNumber = scanner.nextInt();
        tipo = getTipoByNumber(tipoNumber);

        String status = frota.inserirVeiculo(valorVenda, kilometragem, placa, tipo);
        if (status.equals("inserido"))
            return true;
        else
            return false;
    }

    private static String getTipoByNumber(int tipoNumber) {
        Scanner scanner = new Scanner(System.in);
        String tipo;

        switch (tipoNumber) {
            case 1:
                tipo = "carro";
                break;

            case 2:
                tipo = "van";
                break;

            case 3:
                tipo = "furgao";
                break;

            case 4:
                tipo = "caminhao";
                break;

            default:
                System.out.println("Valor inserino não existe. Insira um valor valido: ");
                tipoNumber = scanner.nextInt();
                tipo = getTipoByNumber(tipoNumber);
                break;
        }

        return tipo;
    }
}
