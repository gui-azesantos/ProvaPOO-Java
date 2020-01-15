package br.com.gft.model;

public class Gerente extends Funcionario{
	
	public Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public  double bonificacao() {
		return (this.getSalario() + 10000.00);
	}
}
