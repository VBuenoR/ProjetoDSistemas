package padraodeprojeto.lojaex01;

public class ItemCarrinho {

    private Produto produto;
    private int quantidade;
    private double desconto;

    public ItemCarrinho(Produto produto, int quantidade, double desconto) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    public double obterCusto (){
        double descontototal = (produto.getValor() * this.quantidade) * this.desconto;
        return (produto.getValor() * this.quantidade) - descontototal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
