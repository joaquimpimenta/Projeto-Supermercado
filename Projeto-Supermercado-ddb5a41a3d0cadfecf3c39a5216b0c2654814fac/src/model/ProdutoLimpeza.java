package model;

public class ProdutoLimpeza extends  Produto{

    private String marca;
    private String tipo;

    public ProdutoLimpeza(String nome, double preco, String marca, String tipo){
        super(nome, preco);
        this.marca = marca;
        this.tipo = tipo;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setPreco(double preco) {
        super.setPreco(preco);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return super.toString() + "| Marca: " + marca + "| Tipo: " + tipo;
    }
}
