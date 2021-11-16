package desafio;

public class Jantar {


	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João", 83.1);
		Comida c1 = new Comida("carne", 10.1);
	
		
		System.out.printf(" O %s de %.2f Kg apos comer %s de "
				+ "peso %.2f kg \n agora  esta com "
				+ "peso de  %.2f Kg ",p1.nomeP,p1.pesoP,c1.nomeC,c1.pesoC,p1.comer(p1.pesoP,c1.pesoC) );
		
	}

}
