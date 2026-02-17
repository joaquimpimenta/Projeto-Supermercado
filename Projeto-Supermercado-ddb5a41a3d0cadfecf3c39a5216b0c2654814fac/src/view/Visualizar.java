package view;
import java.util.Scanner;

public class Visualizar {

    Scanner scanner;

    public Visualizar(){
        scanner = new Scanner(System.in);
    }

    public int menu(){
        System.out.println(" ========= MENU =========");
        System.out.println("1. Menu para cadastra produtos");
        System.out.println("2. Menu Visualizar produto");
        System.out.println("3. Buscar produto pelo ID");
        System.out.println("4. Remover produto pelo ID");
        System.out.println("0. Sair");
        System.out.println("============================");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

    public void opcaoInvalida(){
        System.out.println("Tente novamente. Digite uma opção válida.");
    }

    public String nomeProduto(){
        System.out.print("Digite o nome do produto que deseja adicionar: ");
        return scanner.nextLine();
    }

    public double precoProduto(){
        System.out.println("Digite o preço do produto que deseja adicionar: ");
        return scanner.nextDouble();
    }

    public String removerProduto(){
        System.out.println("Digite o nome do produto que deseja remover: ");
        return scanner.nextLine();
    }

    public String buscarProduto(){
        System.out.println("Digite o nome do produto que deseja encontrar:" );
        return scanner.nextLine();
    }

    public void produtoEncontradoComSucesso(){
        System.out.println("Produto encontrado. ");
    }

    public void produtoRemovidoComSucesso(){
        System.out.println("Produto removido com sucesso.");
    }

    public void produtoNaoEncontrado(){
        System.out.println("Produto não encontrado.");
    }

    public void saindoDoSistema(){
        System.out.println("Saindo do sistema...");
    }

    //sub Menu

    public int subMenuProdutos(){
        System.out.println("=== SubMenus ===");
        System.out.println("1. Cadastrar Frutas ou Verduras");
        System.out.println("2. Cadastrar produtos de limpeza");
        System.out.println("3. Cadastrar bebidas");
        System.out.println("4. Cadastrar alimentos congelados");
        System.out.println("=================================");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

    public int subMenuFrutasOuVerduras(){
        System.out.println("=========== SubMenus ===========");
        System.out.println("1. Cadastrar Frutas");
        System.out.println("2. Cadastrar Verdura");
        System.out.println("=================================");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

    public String nomeFruta(){
        System.out.print("Digite o nome da fruta: ");
        return scanner.nextLine();
    }

    public double precoFruta(){
        System.out.print("Digite o preço da fruta R$");
        return scanner.nextDouble();
    }

    public double pesoFruta(){
        scanner.nextLine();
        System.out.print("Digite o peso da fruta: ");
        return  scanner.nextDouble();
    }

    public String origemFruta(){
        scanner.nextLine();
        System.out.print("Digite de onde a fruta veio: ");
        return scanner.nextLine();
    }

    public String nomeVerdura(){
        System.out.print("Digite o nome da verdura: ");
        return scanner.nextLine();
    }

    public double precoVerdura(){
        System.out.print("Digite o preço da verdura, digitada acima: ");
        return scanner.nextDouble();
    }

    public int caloriasVerdura(){
        scanner.nextLine();
        System.out.print("Digite a quantidade de calorias a verdura possui: ");
        return scanner.nextInt();
    }

    public int qtdEstoqueVerduras(){
        scanner.nextLine();
        System.out.print("Digite a quantidade de verduras que serão adicionadas no estoque: ");
        return scanner.nextInt();
    }

    public int subMenuVisualizarProdutos(){
        System.out.println("====== VISUALIZAR PRODUTOS ======");
        System.out.println("1. Visualizar frutas ou verduras");
        System.out.println("2. Visualizar produtos de limpeza");
        System.out.println("3. Visualizar bebidas");
        System.out.println("4. Visualizar produtos congelados");
        System.out.println("==================================");
        System.out.print("Escolha uma opção: ");
        int opcaoA = scanner.nextInt();
        scanner.nextLine();
        return opcaoA;
    }

    public int subMenuFrutaOuVerdura(){
        System.out.println("======= SUBMENU =======");
        System.out.println("1. Visualizar Frutas");
        System.out.println("2. Visualizar Verduras");
        int opcaoSubMenu = scanner.nextInt();
        scanner.nextLine();
        return opcaoSubMenu;
    };

    public String nomeProdutoLimpeza(){
        System.out.print("Digite o nome do produto de limpeza: ");
        return scanner.nextLine();
    }

    public double precoProdutoLimpeza(){
        System.out.print("Digite o preço do produto de limpeza: ");
        return scanner.nextDouble();
    }

    public String marcaProdutoLimpeza(){
        scanner.nextLine();
        System.out.print("Digite a marca do produto de limpeza: ");
        return scanner.nextLine();
    }

    public String tipoProdutoLimpeza(){
        System.out.print("Digite o tipo do produto de limpeza: (por exemplo, Desinfetante, Detergente, Sabão Líquido).");
        return scanner.nextLine();
    }

    public String nomeBebida(){
        System.out.print("Digite o nome da bebida: ");
        return scanner.nextLine();
    }

    public double precoBebida(){
        System.out.print("Digite o valor da bebida: ");
        return scanner.nextDouble();
    }

    public String saborBebida(){
        scanner.nextLine();
        System.out.print("Qual é o sabor da bebida: ");
        return scanner.nextLine();
    }

    public String validadeBebida(){
        System.out.print("Validade: ");
        return scanner.nextLine();
    }

    public String nomeProdutoCongelado(){
        System.out.print("Digite o nome do produto congelado: ");
        return scanner.nextLine();
    }

    public double precoProdutoCongelado(){
        System.out.print("Preço do produto congelado: ");
        return scanner.nextDouble();
    }

    public String embalagemProdutoCongelado(){
        scanner.nextLine();
        System.out.println("Categoria do produto congelado: ");
        return scanner.nextLine();
    }

    public String temperaturaIdealProdutoCongelado(){
        System.out.print("Temperatura ideal: ");
        return scanner.nextLine();
    }

}
