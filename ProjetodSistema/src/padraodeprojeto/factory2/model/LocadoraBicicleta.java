package padraodeprojeto.factory2.model;

import padraodeprojeto.factory.model.BeefBurger;
import padraodeprojeto.factory2.abstracts.Locadora;
import padraodeprojeto.factory2.interfaces.Veiculo;

public class LocadoraBicicleta extends Locadora {
    @Override
    public Veiculo createVeiculo() {
        System.out.println("Veiculo locado");
        return new VeiculoBicicleta();
    }
}
