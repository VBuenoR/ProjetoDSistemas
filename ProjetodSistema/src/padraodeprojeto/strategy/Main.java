package padraodeprojeto.strategy;

import padraodeprojeto.strategy.model.Context;
import padraodeprojeto.strategy.strategies.Conservador;

public class Main {
    public static void main(String[] args) {
        Context c = new Context();
        InvestStrategy conservador = new Conservador();
        c.setStrategy(conservador);
        c.executeStrategy(100);
        double valorAtu = c.executeStrategy(100.0);
        System.out.printf("Valor atualizado" + valorAtu);
    }
}
