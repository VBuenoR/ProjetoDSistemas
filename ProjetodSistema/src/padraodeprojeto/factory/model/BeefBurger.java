package padraodeprojeto.factory.model;

import padraodeprojeto.factory.interfaces.Burger;

public class BeefBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparando hamburger de carne...");
    }
}
