package model;

public class ProdutosCongelados extends Produto {

    private String temperaturaIdealDeArmazenamento;
    private String embalagem;

    public ProdutosCongelados(String nome, double preco, String embalagem, String temperaturaIdealDeArmazenamento) {
        super(nome, preco);
        this.preco = preco;
        this.temperaturaIdealDeArmazenamento = temperaturaIdealDeArmazenamento;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public String getTemperaturaIdealDeArmazenamento() {
        return temperaturaIdealDeArmazenamento;
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setPreco(double preco) {
        super.setPreco(preco);
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public void setTemperaturaIdealDeArmazenamento(String temperaturaIdealDeArmazenamento) {
        this.temperaturaIdealDeArmazenamento = temperaturaIdealDeArmazenamento;
    }
}
