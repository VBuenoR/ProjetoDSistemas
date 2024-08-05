package padraodeprojeto.lojaex01;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private Cliente cliente;
    private List<ItemCarrinho> itens;

    public CarrinhoDeCompras(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public boolean adicionarProduto (Produto produto, int quantidade, double desconto){
        ItemCarrinho item = new ItemCarrinho(produto, quantidade, desconto);
        return this.itens.add(item);

    }

    public double obterValorTotal() {
        double total = 0.0;
        for (ItemCarrinho item : itens) { total += item.obterCusto(); }

        return total;
    }

    @Override
    public String toString() {
        String pedido = this.cliente.getNome() + "\n";
        for (ItemCarrinho item : itens){
            pedido += item.getProduto().getCodigo() + "\n";
        }
        return pedido;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
