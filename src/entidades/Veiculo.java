package entidades;

public abstract class Veiculo {
	private String nomeVeiculo;
	private Integer quantidadeDisponivel;
	private Double quilometragem;
	
	public Veiculo(String nomeVeiculo, Integer quantidadeDisponivel, Double quilometragem) {
		this.nomeVeiculo = nomeVeiculo;
		this.quantidadeDisponivel = quantidadeDisponivel;
		this.quilometragem = quilometragem;
	}
	
	public String getNomeVeiculo() {
		return nomeVeiculo;
	}
	public void setNomeVeiculo(String nomeVeiculo) {
		this.nomeVeiculo = nomeVeiculo;
	}
	public Integer getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}
	public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	public Double getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(Double quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	public abstract Double calculaPrecoVenda(Double precoDeCompra);
	public abstract void mostra();
}
