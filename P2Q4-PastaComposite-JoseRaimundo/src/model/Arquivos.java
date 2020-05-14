package model;

public class Arquivos extends ImplementacaoSistema{

	private String nome;
	private int tamanho;
	
	public Arquivos(String nomeArquivo, int tamanhoArquivo) {
		super();
		this.nome = nomeArquivo;
		this.tamanho = tamanhoArquivo;
	}

	public String getNome() {
		return nome;
	}

	public int getTamanho() {
		return tamanho;
	}

	@Override
	public String toString() {
		return "Arquivos [nome=" + nome + ", tamanho=" + tamanho + "]";
	}
	
	

}
