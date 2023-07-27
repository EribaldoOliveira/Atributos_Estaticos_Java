package AtributosEstaticos;
/*
 Atributos Estáticos são atributos, onde os valores são compartilhados entre as instâncias da classe;

-> Para utilizar um atributo estático, coloca-se o nome da classe junto ao atributo.
Ex.: NomeDaClasse, atributo; 
*/

public class Programa_AtributosEstáticos {
	public static void main (String[] args) {
		
		Conta c1 = new Conta(" - Angelina  Jolie");
		System.out.print(c1.getNumero());
		System.out.println(c1.getCliente());
		
		Conta c2 = new Conta(" - Felicity Jones");
		System.out.print(c2.getNumero());
		System.out.println(c2.getCliente());
		
		Conta c3 = new Conta(" - Maria das Graças");
		System.out.print(c3.getNumero());
		System.out.println(c3.getCliente());
		
		System.out.println();
		
		System.out.println(c1.contador);
		System.out.println(c2.contador);
		System.out.println(c3.contador);
		System.out.println(Conta.contador);
	}

}
