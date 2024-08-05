package padraodeprojeto.strategy.model;

import padraodeprojeto.strategy.InvestStrategy;

public class Context {
    private InvestStrategy strategy;

    public Context(InvestStrategy strategy) {
        this.strategy = strategy;
    }

    public Context() {
    }

    public InvestStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(InvestStrategy strategy) {
        this.strategy = strategy;
    }

    public  double executeStrategy(double v){
        return strategy.execute(v);
    }

}
