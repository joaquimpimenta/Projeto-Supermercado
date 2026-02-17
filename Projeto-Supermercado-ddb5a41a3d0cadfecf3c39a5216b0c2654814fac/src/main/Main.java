package main;

import service.Gerenciar;
import view.Visualizar;

public class Main {
    public static void main(String[] args){

        Visualizar visualizar = new Visualizar();
        Gerenciar gerenciar = new Gerenciar();

        int opcao = 1;

        do{
            opcao = visualizar.menu();
            gerenciar.gerenciarOpcaoSelecionada(opcao, visualizar);

        } while(opcao != 0);

        visualizar.saindoDoSistema();
    }
}
