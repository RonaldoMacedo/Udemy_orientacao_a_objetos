package entities;

public class Account {

	private int numero;
	private String nome;
	private double saldo;
	
	public Account(int numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
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
