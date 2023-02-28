/* Nome: Ronan Jorge
 * Data: 28/02/2023
 * Objetivo: 01) Criar uma aplicação em Java que tenha uma função recursiva que
 * calcule o somatório do N primeiros número NATURAIS (a função deve
 * retornar zero para números negativos)
 */

package view;

import javax.swing.JOptionPane;
import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de n:"));
		System.out.println("A soma dos n primeiros naturais é "+ op.sum(n)+".");
	}

}
