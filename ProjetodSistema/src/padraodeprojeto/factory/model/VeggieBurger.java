package padraodeprojeto.factory.model;

import padraodeprojeto.factory.interfaces.Burger;

public class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparando hamburguer vegano...");
    }
}
