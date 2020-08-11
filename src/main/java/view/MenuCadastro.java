package view;

import java.util.Scanner;

public class MenuCadastro {
	
	Scanner teclado = new Scanner(System.in);
	
	private static final int OPCAO_MENU_CADASTRO_USUARIOS = 1;
	private static final int OPCAO_MENU_CADASTRO_RECEITAS = 2;
	private static final int OPCAO_MENU_CADASTRO_DESPESAS = 3;
	private static final int OPCAO_MENU_CADASTRO_VOLTAR = 4;

	public void apresentarMenuCadastro() {
		int opcao = this.apresentarOpcoesMenu();
		while(opcao != OPCAO_MENU_CADASTRO_VOLTAR) {
			switch(opcao) {
				case OPCAO_MENU_CADASTRO_USUARIOS: {
					MenuUsuario menuUsuario = new MenuUsuario();
					menuUsuario.apresentarMenuUsuario();
					break;
				}
				case OPCAO_MENU_CADASTRO_RECEITAS: {
					MenuReceita menuReceita = new MenuReceita();
					menuReceita.apresentarMenuReceita();
					break;
				}
				case OPCAO_MENU_CADASTRO_DESPESAS: {
					MenuDespesa menuDespesa = new MenuDespesa();
					menuDespesa.apresentarMenuDespesa();
					break;
				}
				default: {
					System.out.println("\nOpção Inválida.");
				}
			}
			opcao = this.apresentarOpcoesMenu();
		}
		
	}

	private int apresentarOpcoesMenu() {
		System.out.println("\nControle de Gastos \n -------- Menu Cadastro -------");
		System.out.println("\nOpções:");
		System.out.println(OPCAO_MENU_CADASTRO_USUARIOS + " - Cadastrar Usuários");
		System.out.println(OPCAO_MENU_CADASTRO_RECEITAS + " - Cadastrar Receitas");
		System.out.println(OPCAO_MENU_CADASTRO_DESPESAS + " - Cadastrar Despesas");
		System.out.println(OPCAO_MENU_CADASTRO_VOLTAR + " - Voltar");
		System.out.print("\nDigite a opção: ");
		return Integer.parseInt(teclado.nextLine());
	}

}
