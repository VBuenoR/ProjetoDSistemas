package padraodeprojeto.composit.sistemapedidos.model;

import padraodeprojeto.composit.sistemapedidos.interfaces.Component;


public class Produto implements Component {

    private String nome;
    private Double valor;

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public double execute() {
        return getValor();
    }
}
