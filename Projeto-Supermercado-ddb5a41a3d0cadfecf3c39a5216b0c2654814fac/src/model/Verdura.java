package model;

public class Verdura extends Produto{

    private int quantidadeEmEstoque;
    private int calorias;

    public Verdura(String nome, double preco, int calorias, int quantidadeEmEstoque){
        super(nome, preco);
        this.calorias = calorias;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public void setPreco(double preco) {
        super.setPreco(preco);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString(){
        return super.toString() + "| Calorias: " + calorias + " | Quantidade em estoque: " + quantidadeEmEstoque;
    }
}
