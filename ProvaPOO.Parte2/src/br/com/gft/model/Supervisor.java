package br.com.gft.model;

public class Supervisor extends Funcionario {
	
	

	public Supervisor(String nome, int idade, double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public  double bonificacao() {
		return (this.getSalario() + 5000.00);
	}
}
