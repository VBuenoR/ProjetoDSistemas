package padraodeprojeto.factory2.model;

import padraodeprojeto.factory2.interfaces.Veiculo;

public class VeiculoPatinete implements Veiculo {
    @Override
    public void locomover() {
        System.out.println("Andando patinando");
    }
}
