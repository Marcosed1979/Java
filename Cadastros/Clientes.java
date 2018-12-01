package Cadastros;

public class Clientes {
	String nome;
	int nascimentoAno;
	int nascimentoMes;
	int nascimentoDia;
	String telefone;

	void nome() {
		System.out.println("Nome: " + this.nome);
	}

	void dataDeNascimento() {
		System.out.println(
				"Data de nascimento: " + this.nascimentoDia + "/" + this.nascimentoMes + "/" + this.nascimentoAno);
	}

	void telefone() {
		System.out.println("Telefone: " + this.telefone);
	}

}
