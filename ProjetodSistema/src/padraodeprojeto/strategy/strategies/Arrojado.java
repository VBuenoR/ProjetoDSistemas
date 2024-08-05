package padraodeprojeto.strategy.strategies;

import padraodeprojeto.strategy.InvestStrategy;

public class Arrojado implements InvestStrategy {
    @Override
    public double execute(double quantia) {
        return (quantia * 1.05);
    }
}
