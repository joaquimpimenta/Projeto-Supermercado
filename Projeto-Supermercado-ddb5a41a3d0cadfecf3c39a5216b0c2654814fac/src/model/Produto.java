package model;

public abstract class Produto {

    protected String nome;
    protected double preco;
    private int id;
    private static int contador = 0;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.id = contador++;
    }

    public Produto(){
        this.nome = "";
        this.preco = 0.0;
    }

    public int getId() { return id; }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ID: " + id + "| Nome: " + nome + "| Preço R$: " + preco;
    }
}
