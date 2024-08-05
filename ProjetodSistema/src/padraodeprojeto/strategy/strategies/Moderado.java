package padraodeprojeto.strategy.strategies;

import padraodeprojeto.strategy.InvestStrategy;

public class Moderado implements InvestStrategy {

    @Override
    public double execute(double quantia) {
        return (quantia * 1.02);
    }
}
