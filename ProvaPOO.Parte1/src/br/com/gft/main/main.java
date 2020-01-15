package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.gft.models.Pessoa;

public class main {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		int maisvelha = 0;
		int posicao = 0;
		int num;

		Pessoa P1 = new Pessoa("João", 15);
		Pessoa P2 = new Pessoa("Leandro", 21);
		Pessoa P3 = new Pessoa("Paulo", 17);
		Pessoa P4 = new Pessoa("Jessica", 18);

		List<Pessoa> pessoa = new ArrayList<>();
		pessoa.add(P1);
		pessoa.add(P2);
		pessoa.add(P3);
		pessoa.add(P4);

		for (int i = 0; i < pessoa.size(); i++) {
			if (pessoa.get(i).getIdade() > maisvelha) {

				maisvelha = pessoa.get(i).getIdade();
				posicao = i;
			}
			System.out.println("Nome: " + pessoa.get(i).getNome() + " Idade: " + pessoa.get(i).getIdade());
		}
		
		System.out.println("A pessoa mais velha é: " + pessoa.get(posicao).getNome());
		System.out.println("Quantidade de pessoas : " + pessoa.size());
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");

		for (int j = 0; j < pessoa.size(); j++) {
			if (pessoa.get(j).getIdade() < 18) {
				pessoa.remove(j);
			}
		}

		for (int i = 0; i < pessoa.size(); i++) {
			System.out.println("Nome: " + pessoa.get(i).getNome() + " Idade: " + pessoa.get(i).getIdade());
		}
		System.out.println("Quantidade de pessoas: " + pessoa.size());
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println("Consulte a lista, entre com o valor a ser consultado: ");
		num = src.nextInt();
		if (num > pessoa.size()) {
			System.out.println("Valor não disponível");
			
		} else {
			System.out.println("Nome: " + pessoa.get(num).getNome() + ", " + pessoa.get(num).getIdade());
		}

	}

}