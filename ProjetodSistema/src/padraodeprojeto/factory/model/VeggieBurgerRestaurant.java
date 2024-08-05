package padraodeprojeto.factory.model;

import padraodeprojeto.factory.abstracts.Restaurant;
import padraodeprojeto.factory.interfaces.Burger;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurguer() {
        System.out.println("Montando hambuerger vegano...");
        return new VeggieBurger();
    }
}
