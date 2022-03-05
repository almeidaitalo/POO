package Livraria;

public class Editora {

	/* Função da classe */

	public int codEditora;
	private String razaoSocial;
	private String contato;
	private String telefone;

	public int getCodEditora() {
		return codEditora;
	}

	/*
	 * Utilizar get e set permite encapsular a coleta de informações para a classe
	 */
	public void setCodEditora(int codEditora) {
		codEditora = codEditora * 1000;
		this.codEditora = codEditora;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
