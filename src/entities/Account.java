package entities;

public class Account {

	private int numero; //number
	private String nome; //string
	private double saldo;// balance
	
	public Account(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial); //encapsulamento
	}
	
	public Account(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.0;
	}

	public String toString() {
		return "Conta: " + numero + ", nome: " + nome + ", saldo: " + String.format("%.2f", saldo);
	}
	
}
