package padraodeprojeto.factory.model;

import padraodeprojeto.factory.abstracts.Restaurant;
import padraodeprojeto.factory.interfaces.Burger;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurguer() {
        System.out.println("Montando hamburger de carne...");
        return new BeefBurger();
    }
}
