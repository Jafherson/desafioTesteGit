package desafio;

public class Pessoa {
	String nomeP = "";
	double pesoP;
	
	Pessoa(){
		
	}
	Pessoa(String nome, double peso){
		this.nomeP = nome;
		this.pesoP = peso;
		
		}
	double comer(double pesoP, double pesoC) {
		
		return pesoP+ pesoC;
	}
	
}
