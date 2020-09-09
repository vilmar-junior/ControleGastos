package view;

import java.awt.Component;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Menu {
	
	Scanner teclado = new Scanner(System.in);
	
	private static final int OPCAO_MENU_CADASTRO = 1;
	private static final int OPCAO_MENU_RELATORIO = 2;
	private static final int OPCAO_MENU_SAIR = 3;
	private static final int OPCAO_INVALIDA = -1;

	public void apresentarMenu() {
		JOptionPane.showMessageDialog(null, "Bem-vindo");
		
		int opcao = this.apresentarOpcoesMenuComJOptionPane();
		while(opcao != OPCAO_MENU_SAIR) {
			switch(opcao) {
				case OPCAO_MENU_CADASTRO: {
					MenuCadastro menuCadastro = new MenuCadastro();
					menuCadastro.apresentarMenuCadastro();
					break;
				}
				case OPCAO_MENU_RELATORIO: {
					MenuRelatorio menuRelatorio = new MenuRelatorio();
					menuRelatorio.apresentarMenuRelatorio();
					break;
				}
				default: {
					System.out.println("\nOpção Inválida.");
				}
			}
			opcao = this.apresentarOpcoesMenu();
		}
	}
	
	public void apresentarMenuComJOptionPane() {
		int opcaoSelecionada = this.apresentarOpcoesMenuComJOptionPane();
		
		while(opcaoSelecionada != OPCAO_MENU_SAIR) {
			switch(opcaoSelecionada) {
				case OPCAO_MENU_CADASTRO: {
					MenuCadastro menuCadastro = new MenuCadastro();
					menuCadastro.apresentarMenuCadastro();
					break;
				}
				case OPCAO_MENU_RELATORIO: {
					MenuRelatorio menuRelatorio = new MenuRelatorio();
					menuRelatorio.apresentarMenuRelatorio();
					break;
				}
				default: {
					System.out.println("\nOpção Inválida.");
				}
			}
			opcaoSelecionada = this.apresentarOpcoesMenuComJOptionPane();
		}
	}
	
	
	private int apresentarOpcoesMenuComJOptionPane() {

		String titulo = "Controle de Gastos";
		String mensagem = "\nOpções:";
		mensagem += OPCAO_MENU_CADASTRO + " - Cadastros";
		mensagem += OPCAO_MENU_RELATORIO + " - Relatórios";
		mensagem += OPCAO_MENU_SAIR + " - Sair";
		mensagem += "\nDigite a opção: ";
		
		Integer[] opcoes = {OPCAO_MENU_CADASTRO, OPCAO_MENU_RELATORIO, OPCAO_MENU_SAIR};
		Component componentePai = null;
		Icon icone = null; //Não será usado
		Object opcaoSelecionadaPorPadrao = null; //Nada é selecionado no começo
		
		Integer opcaoSelecionada = (Integer) JOptionPane.showInputDialog(componentePai, mensagem, 
																		 titulo, JOptionPane.INFORMATION_MESSAGE,
																		 icone , opcoes, opcaoSelecionadaPorPadrao);
		
		
		return opcaoSelecionada;
	}

	private int apresentarOpcoesMenu() {
		System.out.println("Controle de Gastos");
		System.out.println("\nOpções:");
		System.out.println(OPCAO_MENU_CADASTRO + " - Cadastros");
		System.out.println(OPCAO_MENU_RELATORIO + " - Relatórios");
		System.out.println(OPCAO_MENU_SAIR + " - Sair");
		System.out.print("\nDigite a opção: ");
		return Integer.parseInt(teclado.nextLine());
	}

}
