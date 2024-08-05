package padraodeprojeto.composit.sistemapedidos.model;

public class Martelo extends Produto{

    public Martelo(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public Double getValor() {
        return super.getValor();
    }

    @Override
    public void setValor(Double valor) {
        super.setValor(valor);
    }

    @Override
    public double execute() {
        return super.execute();
    }
}
