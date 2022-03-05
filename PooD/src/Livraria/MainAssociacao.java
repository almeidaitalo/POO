package Livraria;

public class MainAssociacao {
	public static void main(String[] args) {

		Editora pearson = new Editora();

		pearson.setCodEditora(11);
		pearson.setRazaoSocial("Pearson");
		pearson.setContato("Marcelo");
		pearson.setTelefone("79 997002222");

		Livros javaDeitel = new Livros();

		javaDeitel.setCodigo(245);
		javaDeitel.setDescLivro("Java: Como programar");
		javaDeitel.setEditora(pearson);
		javaDeitel.setISBN("123.456.789");

		System.out.println(javaDeitel.getEditora().getContato());
	}

}
