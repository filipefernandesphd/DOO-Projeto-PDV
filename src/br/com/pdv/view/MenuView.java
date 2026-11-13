package br.com.pdv.view;

import java.util.Scanner;

public class MenuView {
    private Scanner scanner;

    // Getters and Setters
    public Scanner getScanner() {
        return scanner;
    }
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public MenuView(Scanner scanner){
        this.scanner = scanner;
    }

    /**
     * Mostra o menu principal.
     * @return Retorna a opção escolhida.
     */
    public int mostrarMenuPrincipal(){
        String menu = """
        === MENU ===
        [1] - Cadastrar produtos
        [2] - Listar produtos
        [0] - Sair
        """;

        System.out.println(menu);
        System.out.print("Digite a opção: ");

        return Integer.parseInt(scanner.nextLine());
    }
}
