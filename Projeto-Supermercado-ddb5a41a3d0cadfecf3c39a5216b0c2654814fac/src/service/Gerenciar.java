package service;
import model.*;
import view.Visualizar;
import java.util.ArrayList;
import java.util.List;
import model.ProdutoLimpeza;

public class Gerenciar {

    List<Produto> list;

    public Gerenciar(){
        list = new ArrayList<>();
    }

    public void gerenciarOpcaoSelecionada(int opcao, Visualizar visualizar){

        switch (opcao){

            case 1:

                int opcaoSelecionada = visualizar.subMenuProdutos();

                if(opcaoSelecionada == 1){
                    int opcaoVerduraOuFruta = visualizar.subMenuFrutasOuVerduras();

                    if(opcaoVerduraOuFruta == 1){

                        String nome = visualizar.nomeFruta();
                        double preco = visualizar.precoFruta();
                        double peso = visualizar.pesoFruta();
                        String origem = visualizar.origemFruta();

                        Produto produto = new Fruta(nome, preco, peso, origem);
                        list.add(produto);

                        break;

                    } else if(opcaoVerduraOuFruta == 2){

                        String nomeVerdura = visualizar.nomeVerdura();
                        double precoVerdura = visualizar.precoVerdura();
                        int calorias = visualizar.caloriasVerdura();
                        int quantidade = visualizar.qtdEstoqueVerduras();

                        Produto produtoVerdura = new Verdura(nomeVerdura, precoVerdura, calorias, quantidade);
                        list.add(produtoVerdura);

                        break;
                    }
                } else if(opcaoSelecionada == 2){

                    String nome = visualizar.nomeProdutoLimpeza();
                    double preco = visualizar.precoProdutoLimpeza();
                    String marca = visualizar.marcaProdutoLimpeza();
                    String tipo = visualizar.tipoProdutoLimpeza();

                    Produto produtoLimpeza = new ProdutoLimpeza(nome, preco, marca, tipo);
                    list.add(produtoLimpeza);
                    break;
                } else if(opcaoSelecionada == 3){

                    String nome = visualizar.nomeBebida();
                    double preco = visualizar.precoBebida();
                    String sabor = visualizar.saborBebida();
                    String validade = visualizar.validadeBebida();

                    Produto bebida = new Bebidas(nome, preco, sabor, validade);
                    list.add(bebida);
                    break;
                } else if (opcaoSelecionada == 4){

                    String nome = visualizar.nomeProdutoCongelado();
                    double preco = visualizar.precoProdutoCongelado();
                    String embalagem = visualizar.embalagemProdutoCongelado();
                    String temperatura = visualizar.temperaturaIdealProdutoCongelado();

                    Produto produtoCongelado = new ProdutosCongelados(nome, preco, embalagem, temperatura);
                    list.add(produtoCongelado);
                    break;
                }

            case 2:

                int opcaoB = visualizar.subMenuVisualizarProdutos();

                if(opcaoB == 1){

                    int opcaoC = visualizar.subMenuFrutaOuVerdura();

                    if(opcaoC == 1){
                        for(Produto p : list){
                            if(p instanceof Fruta){
                                Fruta fruta = (Fruta) p;
                                System.out.println(p);
                                break;
                            }
                        }
                    } else if (opcaoC == 2){
                        for(Produto p : list){
                            if(p instanceof Verdura){
                                Verdura verdura = (Verdura) p;
                                System.out.println(p);
                                break;
                            }
                        }
                    } else {
                        visualizar.opcaoInvalida();
                        break;
                    }

                } else if(opcaoB == 2){
                    for(Produto p : list){
                        if(p instanceof ProdutoLimpeza){
                            ProdutoLimpeza produtoLimpeza = (ProdutoLimpeza) p;
                            System.out.println(p);
                            break;
                        }
                    }
                } else if(opcaoB == 3){

                    for(Produto p : list)

                    break;
                }

                break;

            case 3:

                String encontrar = visualizar.buscarProduto();

                for(Produto p : list){
                    if(p.getNome().equals(encontrar)){
                        visualizar.produtoEncontradoComSucesso();
                    }
                }

                break;

            case 4:

                String procurar = visualizar.removerProduto();
                boolean encontrado = false;

                for(int i = 0;i < list.size(); i++){
                    if(list.equals(procurar)){
                        visualizar.produtoRemovidoComSucesso();
                    } else {
                        visualizar.produtoNaoEncontrado();
                    }
                }

            default:

                if(opcao > 4){
                    visualizar.opcaoInvalida();
                }
        }

    }

}
