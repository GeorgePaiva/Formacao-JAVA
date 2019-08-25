public class Aplicacao {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Digite seu nome:");
		 * String nome=sc.next(); System.out.println("Bom dia, " + nome);
		 */

		Poupanca p = new Poupanca();
		p.depositar(300);
		p.sacar(50);
		System.out.println("Novo Saldo " + p.getSaldo());
		p.totalConta();
		System.out.println("Total de contas criadas " + p.getTotal());

		ContaCorrente c1 = new ContaCorrente();
		c1.depositar(500);
		System.out.println("CONTA CORRENTE ");
		System.out.println("Novo saldo: " + c1.getSaldo());
		c1.setTaxa(10);
		c1.sacar(400);
		System.out.println("Novo saldo: " + c1.getSaldo());

		c1.totalConta();
		System.out.println("Total de contas criadas " + p.getTotal());

	}

}
