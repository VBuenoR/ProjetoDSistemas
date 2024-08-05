package padraodeprojeto.factory2.abstracts;

import padraodeprojeto.factory2.interfaces.Veiculo;

public abstract class Locadora {

    public void locarVeiculo(){
        System.out.println("Veiculo sendo locado");
        Veiculo veiculo = createVeiculo();
        veiculo.locomover();
    }

    public abstract Veiculo createVeiculo();
}
