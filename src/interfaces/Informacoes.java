package interfaces;

import entidades.Veiculo;

public interface Informacoes {
	Double menorQuilometragem(Veiculo[] veiculos);
	
	Integer quantidadeMotos(Veiculo[] veiculos);
}
