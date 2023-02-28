/* Nome: Ronan Jorge
 * Data: 28/02/2023
 * Objetivo: 01) Criar uma aplica��o em Java que tenha uma fun��o recursiva que
 * calcule o somat�rio do N primeiros n�mero NATURAIS (a fun��o deve
 * retornar zero para n�meros negativos)
 */

package view;

import javax.swing.JOptionPane;
import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de n:"));
		System.out.println("A soma dos n primeiros naturais � "+ op.sum(n)+".");
	}

}
