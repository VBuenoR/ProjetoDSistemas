package padraodeprojeto.factory.abstracts;

import padraodeprojeto.factory.interfaces.Burger;

public abstract class Restaurant {

    public void orderBurger() {
        System.out.println("Novo Pedido de hamburger");
        Burger burger = createBurguer();
        burger.prepare();


    }

    public abstract Burger createBurguer();

}
