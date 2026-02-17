package model;

public class Fruta extends Produto{

    private double peso;
    private String origem;

    public Fruta(String nome, double preco, double peso, String origem){
        super(nome, preco);
        this.peso = peso;
        this.origem = origem;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    @Override
    public void setPreco(double preco) {
        super.setPreco(preco);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    public String getOrigem() {
        return origem;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String toString(){
        return super.toString() + "Peso: " + peso + "| Origem: " + origem;
    }
}
