package padraodeprojeto.factory2.model;

import padraodeprojeto.factory2.interfaces.Veiculo;

public class VeiculoBicicleta implements Veiculo {
    @Override
    public void locomover() {
        System.out.println("Pedalando bicicleta");
    }
}
