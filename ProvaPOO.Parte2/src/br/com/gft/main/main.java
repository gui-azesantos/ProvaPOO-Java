package br.com.gft.main;
import br.com.gft.model.*;;

public class main {

	public static void main(String[] args) {
		
		Gerente A = new Gerente("Jessica", 35, 20000.00);
		A.bonificacao();
		
		Supervisor B = new Supervisor("Paulo", 30, 10000.00);
		B.bonificacao();
		
		Vendedor C = new Vendedor("Leandro", 21, 3000.00);
		C.bonificacao();
		
		
		System.out.println(" \n Nome: " + A.getNome() + " \n Sal�rio: " +  A.getSalario() +  " \n Sal�rio com Bonifica��o " +A.bonificacao());
		System.out.println(" \n Nome: " + B.getNome() + " \n Sal�rio: " +  B.getSalario() +  " \n Sal�rio com Bonifica��o " +B.bonificacao());
		System.out.println(" \n Nome: " + C.getNome() + " \n Sal�rio: " +  C.getSalario() +  " \n Sal�rio com Bonifica��o " +C.bonificacao());
	}

}
