package Livraria;

public class Livros {

	private int codigo;
	private String descLivro;
	private String ISBN;
	private Editora editora;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescLivro() {
		return descLivro;
	}

	public void setDescLivro(String descLivro) {
		this.descLivro = descLivro;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
}
