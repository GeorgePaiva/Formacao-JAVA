public class Conta {
	private String titular;
	private double saldo;
	private static int total = 0;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	// Método Construtor com o mesmo nome da Classe.
	public Conta() {
		System.out.println("Essa é uma conta comum.");
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		this.saldo = saldo + valor;
	}

	public void sacar(double valor) {
		this.saldo = saldo - valor;
	}

	public void totalConta() {
		total++;
	}

}
