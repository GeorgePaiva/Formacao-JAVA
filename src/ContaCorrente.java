import java.util.Scanner;

public class ContaCorrente extends Conta {
	private double taxa;

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public void sacar(double valor) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Descontar taxa(s/n)?");
		String resposta = sc.next();

		if (resposta.equals("s")) {
			setSaldo(getSaldo() - valor - taxa);

		} else {

			super.sacar(valor);
		}
	}

}
