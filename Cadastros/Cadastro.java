package Cadastros;
// Aprendendo sobre classes, objetos e métodos
public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clientes c1 = new Clientes();
		c1.nome = "Ana Paula Simioli";
		c1.telefone = "019-XXXXX-XXXX";
		c1.nascimentoAno = 1981;
		c1.nascimentoMes = 11;
		c1.nascimentoDia = 05;
		c1.nome();
		c1.telefone();
		c1.dataDeNascimento();

		Clientes c2 = new Clientes();
		c2.nome = "Rute Nucci Degrossoli";
		c2.telefone = "19-XXXXX-XXXX";
		c2.nascimentoAno = 1960;
		c2.nascimentoMes = 07;
		c2.nascimentoDia = 18;
		c2.nome();
		c2.telefone();
		c2.dataDeNascimento();
	}

}
