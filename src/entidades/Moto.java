package entidades;

public class Moto extends Veiculo {
	
	private Boolean eEspotiva;

	public Moto(String nomeVeiculo, Integer quantidadeDisponivel, Double quilometragem, Boolean eEspotiva) {
		super(nomeVeiculo, quantidadeDisponivel, quilometragem);
		this.eEspotiva = eEspotiva;
	}
	
	

	public Boolean geteEspotiva() {
		return eEspotiva;
	}

	public void seteEspotiva(Boolean eEspotiva) {
		this.eEspotiva = eEspotiva;
	}
	
	@Override
	public void mostra() {
		System.out.printf("Nome: %s%n", getNomeVeiculo());
		System.out.printf("Quantidade Disponível: %d%n", getQuantidadeDisponivel());
		System.out.printf("Quilometragem: %.1fkm %n", getQuilometragem());
		System.out.printf("Esportiva: %s%n", geteEspotiva() ? "sim" : "não");
	}

	@Override
	public Double calculaPrecoVenda(Double precoDeCompra) {
		Double precoVenda = getQuilometragem() > 8000 ? precoDeCompra * 0.7 : precoDeCompra * 0.9;
		return precoVenda;
	}
}
