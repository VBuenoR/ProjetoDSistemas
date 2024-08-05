package padraodeprojeto.composit.sistemapedidos;

import padraodeprojeto.composit.sistemapedidos.model.Caixa;
import padraodeprojeto.composit.sistemapedidos.model.Martelo;

public class Main {
    public static void main(String[] args) {
        Caixa pedido = new Caixa();
        Caixa caixa1 = new Caixa();
        Martelo m = new Martelo("Cabo de ferro", 80.00);

        caixa1.addChildren(m);
        pedido.addChildren(caixa1);

        Caixa caixa2 = new Caixa();
        Caixa caixa21 = new Caixa();
        Caixa caixa22 = new Caixa();

        Martelo m1 = new Martelo("Cabo de diamante", 100.24);
        Martelo m2 = new Martelo("Cabo de ouro", 50.24);

        caixa21.addChildren(m1);
        caixa2.addChildren(caixa21);
        pedido.addChildren(caixa2);

        System.out.println(pedido.execute());
    }
}
