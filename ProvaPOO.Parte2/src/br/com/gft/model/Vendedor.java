package br.com.gft.model;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, int idade, double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double bonificacao() {
		return (this.getSalario() + 3000.00);
	}
}
