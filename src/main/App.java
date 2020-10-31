package main;

import java.util.Random;
import java.util.Scanner;

import entidades.Carro;
import entidades.Moto;
import entidades.Locadora;
import entidades.Veiculo;

public class App {

	public static String geraPalavra() {
		Random rand = new Random();
		int tamanho = 1 + rand.nextInt(8);
		String nome = "";
		String alfabeto = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < tamanho; i++) {
			int posicao = rand.nextInt(alfabeto.length());
			nome = nome + alfabeto.charAt(posicao);
		}
		return nome;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantidade de veículos: ");
		int quantidadeVeiculos = scan.nextInt();
		scan.nextLine();
		
		scan.close();

		Veiculo[] veiculos = new Veiculo[quantidadeVeiculos];
		
		for (int i = 0; i < veiculos.length; i++) {
			Random rand = new Random();
			
			double chance = Math.random();
			
			if(chance < 0.5) {
				veiculos[i] = new Carro(
						geraPalavra(), 
						1 + rand.nextInt(11), 
						1 + (rand.nextDouble() * 30000.0),
						2 + rand.nextInt(2)
						);
			} else 
				veiculos[i] = new Moto(
						geraPalavra(), 
						1 + rand.nextInt(11), 
						1 + (rand.nextDouble() * 30000.0),
						rand.nextBoolean()
						);
		}
		
		for (int i = 0; i < veiculos.length; i++) {
			System.out.println();
			
			veiculos[i].mostra();
			System.out.println();
		}
		
		Locadora locadora = new Locadora(veiculos);
		
		System.out.println(locadora.menorQuilometragem(veiculos));
		System.out.println(locadora.quantidadeMotos(veiculos));
	}

}
