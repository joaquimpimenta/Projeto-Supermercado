package model;

public class Bebidas extends Produto{

    private String validade;
    private String sabor;

    public Bebidas(String nome, double preco, String validade, String sabor){
        super(nome, preco);
        this.validade = validade;
        this.sabor = sabor;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    public String getSabor() {
        return sabor;
    }

    public String getValidade() {
        return validade;
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setPreco(double preco) {
        super.setPreco(preco);
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String toString(){
        return super.toString() + " | Sabor: " + sabor + " | Validade: " + validade;
    }
}