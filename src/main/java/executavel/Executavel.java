package executavel;

import javax.swing.JOptionPane;

import view.Menu;

public class Executavel {
	public static void main(String[] args) {
		Menu menuComNomeCriadoLocalmente = new Menu();
		menuComNomeCriadoLocalmente.apresentarMenu();
		
		JOptionPane.showMessageDialog(null, "Olá pessoal! Eu fui criado na máquina do Vilmar!");
	}
}
