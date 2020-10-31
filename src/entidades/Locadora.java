package entidades;

import interfaces.Informacoes;

public class Locadora implements Informacoes{
	private Veiculo[] veiculos;
	
	public Locadora(Veiculo[] veiculos) {
		this.veiculos = veiculos;
	}

	public Veiculo[] getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Veiculo[] veiculos) {
		this.veiculos = veiculos;
	}

	@Override
	public Double menorQuilometragem(Veiculo[] veiculos) {
		Double count = veiculos[0].getQuilometragem();
		for (int i = 0; i < veiculos.length; i++) {
			if(veiculos[i].getQuilometragem() < count)
				count = veiculos[i].getQuilometragem();
		}
		return count;
	}

	@Override
	public Integer quantidadeMotos(Veiculo[] veiculos) {
		int count = 0;
		for (int j = 0; j < veiculos.length; j++) {
			if( veiculos[j] instanceof Moto)
				count ++;
		}
		return count;
	}
}
