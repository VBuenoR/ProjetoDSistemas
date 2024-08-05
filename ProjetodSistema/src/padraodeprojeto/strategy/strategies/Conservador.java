package padraodeprojeto.strategy.strategies;

import padraodeprojeto.strategy.InvestStrategy;

public class Conservador implements InvestStrategy {

    @Override
    public double execute(double quantia) {
        return (quantia * 1.01);
    }
}
