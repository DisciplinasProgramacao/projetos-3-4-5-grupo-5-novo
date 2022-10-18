package main;

public class Carro extends Veiculo {
    public Carro(double valorVenda, Integer kilometragem) {
        super(valorVenda, kilometragem);
        this.tanque = 50;
    }

    @Override
    public double ipva() {
        return 0.04 * this.valorVenda;
    }

    @Override
    public double seguro() {
        return 0.05 * this.valorVenda + 300;
    }

    @Override
    double alinhamento() {
        return 0;
    }

    @Override
    double vistoria() {
        return 0;
    }

}

