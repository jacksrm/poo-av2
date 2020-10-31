package entidades;

public class Carro extends Veiculo {

	private Integer numeroDePortas;

	public Carro(
			String nomeVeiculo, 
			Integer quantidadeDisponivel, 
			Double quilometragem, 
			Integer numeroDePortas
			) {
		super(nomeVeiculo, quantidadeDisponivel, quilometragem);
		this.numeroDePortas = numeroDePortas;
	}

	public Integer getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(Integer numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}
	
	@Override
	public void mostra() {
		System.out.printf("Nome: %s%n", getNomeVeiculo());
		System.out.printf("Quantidade Disponível: %d%n", getQuantidadeDisponivel());
		System.out.printf("Quilometragem: %.1fkm %n", getQuilometragem());
		System.out.printf("Número de portas: %d%n", getNumeroDePortas());
	}

	@Override
	public Double calculaPrecoVenda(Double precoDeCompra) {
		Double precoVenda = getQuilometragem() > 15000 ? precoDeCompra * 0.6 : precoDeCompra * 0.8;
		return precoVenda;
	}

}
