package padraodeprojeto.composit.sistemapedidos.model;

import padraodeprojeto.composit.sistemapedidos.interfaces.Component;

import java.util.ArrayList;
import java.util.List;

public class Caixa implements Component {



    private List<Component> children = new ArrayList<Component>();


    public void addChildren(Component c){
        children.add(c);
    }
    public void removeChildren(Component c){
        children.remove(c);
    }

    @Override
    public double execute() {
        Double total = 0.0;
        for (Component component : children) {
            total += component.execute();
        }
        return total;
    }
}
