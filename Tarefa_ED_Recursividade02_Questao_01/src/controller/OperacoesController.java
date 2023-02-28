package controller;

public class OperacoesController {
	public OperacoesController() {
		super();
	}
	public int sum(int n) {
		/* soma(N) = 1 + 2 + 3 + 4 + 5 + 6 + ... + (N - 1) + N
		 * = soma (N - 1) + N
		 * = soma (N - 2) + (N - 1) + N
		 * ...
		 * = soma (zero) + 1 + 2 + 3 + 4 + 5 + ... + (N - 1) + N
		 * 
		 * Para fazermos a recursividade, se N é maior que zero, basta
		 * retornarmos o valor de N acrescido da própria função para N - 1.
		 * O ponto de parada acontece quando chegarmos em zero e neste caso
		 * retornamos para a função o valor zero. */
		if(n <= 0) return 0;
		else return n + sum(n - 1);
	}
}
