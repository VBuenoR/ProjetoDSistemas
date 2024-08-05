package padraodeprojeto.factory.factorys;

import padraodeprojeto.factory.abstracts.Restaurant;
import padraodeprojeto.factory.model.BeefBurgerRestaurant;
import padraodeprojeto.factory.model.VeggieBurgerRestaurant;

public class GoFactory {
    public static void main(String[] args) {
        Restaurant beef = new BeefBurgerRestaurant();
        beef.orderBurger();

        Restaurant veg = new VeggieBurgerRestaurant();
        veg.orderBurger();
    }
}
